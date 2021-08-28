package kr.ac.kopo.blockChain.copy;

import java.util.ArrayList;
import java.util.Date;

public class Block {
	public String hash; //디지털 서명
	public String previousHash; //이전 block의 hash값
	public String merkleRoot;
	public ArrayList<Transaction> transactions = new ArrayList<>();//our data will be a simple message
	private long timeStamp; //as number of milliseconds since 1/1/1970
	private int nonce;
	
	public Block(String previousHash) {
		this.previousHash = previousHash;
		this.timeStamp = new Date().getTime();
		this.hash = calculateHash(); //Making sure we do this after we set the other values
	} 
	
	//Calculate new hash based on blocks contents
	public String calculateHash() {
		String calculatedhash = StringUtil.applySha256(
				previousHash + 
				Long.toString(timeStamp) +
				Integer.toString(nonce) + 
				merkleRoot
				);
		return calculatedhash;
	}
	
	
	//difficulty는 멤버가 풀여야할 자릿수
	//Increases nonce value until hash target is reached
	public void mineBlock(int difficulty) {
		merkleRoot = StringUtil.getMerleRoot(transactions);
		String target = StringUtil.getDificultyString(difficulty); //Create a String with difficulty * "0"
		while(!hash.substring(0, difficulty).equals(target)) {
			nonce ++ ;
			hash = calculateHash();
		}
		System.out.println("Block Mined!!! : " + hash);
	}
	
	//Add transactions to this block
	public boolean addTransaction(Transaction transaction) {
		//process transaction and check if valid, unless block is genesis block then ignore.
		if(transaction == null) return false;		
		if((!"0".equals(previousHash))) {
			if((transaction.processTransaction() != true)) {
				System.out.println("Transaction failed to process. Discarded.");
				return false;
			}
		}

		transactions.add(transaction);
		System.out.println("Transaction Successfully added to Block");
		return true;
	}
}
