package kr.ac.kopo.blockChain;

import java.security.*;
import java.util.ArrayList;

public class Transaction {
	public String transactionId; //this is also hash of the transaction
	public PublicKey sender; //senders address(public key)
	public PublicKey reciepient; //recipients address(public key)
	public float value;
	public byte[] signature ; //This is to prevent anybody else from spending funds in our wallet.
	
	public ArrayList<TransactionInput> inputs = new ArrayList<>();
	public ArrayList<TransactionOutput> outputs = new ArrayList<>();
	
	private static int sequence = 0; //a rough count of how many transactions have bean generated 

	public Transaction(PublicKey from, PublicKey to, float value, ArrayList<TransactionInput> inputs) {
		this.sender = from;
		this.reciepient = to;
		this.value = value;
		this.inputs = inputs;
	}
	
	//generateSignature, verifySignature는  miner(블록체인 주인)에 의해서 새로운 트랜잭션이 블록에 추가될 때마다 서명이 확인될 것이다.
	
	public boolean processTransaction() {
		
		if(verifySignature() == false) {
			System.out.println("#Transaction Signature failed to verify");
			return false;
		}
		
		//Gathers transaction inputs (Making sure they are unspent) 
		for(TransactionInput i : inputs) {
			i.UTXO = NoobChain.UTXOs.get(i.transactionOutputId);
		}
		
		//checks if transaction is valid
		if(getInputsValue() < NoobChain.minimumTransaction) {
			System.out.println("Transaction Inputs too small : " + getInputsValue());
			return false;
		}
		
		//Generate transaction outputs (output 발생)
		float leftOver = getInputsValue() - value; //get value of inputs then the left over change
												   //input 값 얻기 남은 변경 값
		transactionId = calculateHash();
		outputs.add(new TransactionOutput(this.reciepient, value, transactionId)); //send value to recipient
		outputs.add(new TransactionOutput(this.sender, leftOver, transactionId)); //send the left over 'change' back to sender
		
		//Add outputs to Unspent list
		for(TransactionOutput o : outputs) {
			NoobChain.UTXOs.put(o.id, o);
		}
		
		//Remove transaction inputs from UTXO lists as spent
		for(TransactionInput i : inputs) {
			if(i.UTXO == null) continue; //if Transaction can't be found skip it(트랜잭션을 찾을 수 없으면 건너뛴다)
			NoobChain.UTXOs.remove(i.UTXO.id);
		}
	
		return true;
	
	}
	
	//returns sum of inputs(UTXOs) values
	public float getInputsValue() {
		float total = 0;
		for(TransactionInput i : inputs) {
			if(i.UTXO == null) continue ; //if Transaction can't be found skip it, This behavior may not be optimal.
			total += i.UTXO.value ; 
		}
		return total;
	}
	
	
	//Signs all the data we dont wish to be tampered with
	//조작되지 않길 바라는 모든 데이터에 서명한다.
	public void generateSignature(PrivateKey privateKey) {
		String data = StringUtil.getStringFromKey(sender) 
					+ StringUtil.getStringFromKey(reciepient)
					+ Float.toString(value);
		signature = StringUtil.applyECDSASig(privateKey, data); 
		//나중에 public key를 사용해서 이 시그니처를 해독함 그럼 시그니처에 정보들이 들어있는거지?  
	}
	
	//Verifies the data we signed hasnt been tampered with
	//서명한 데이터가 변조되지 않았는지 확인
	public boolean verifySignature() {
		String data = StringUtil.getStringFromKey(sender) + StringUtil.getStringFromKey(reciepient)
						+ Float.toString(value);
		return StringUtil.verifyECDSASig(sender, data, signature);
	}
	
	//returns sum or outputs
	public float getOutputsValue() {
		float total = 0;
		for(TransactionOutput o : outputs) {
			total += o.value;
		}
		return total;
	}
	
	
	//this calculates the transaction hash(which will be used as its id)
	private String calculateHash() {
		sequence ++ ; //increase the sequence to avoid 2 identical transactions having the same hash
		
		return StringUtil.applySha256(
				StringUtil.getStringFromKey(sender) + 
				StringUtil.getStringFromKey(reciepient) +
				Float.toString(value) + sequence
				);
	}
	
}
