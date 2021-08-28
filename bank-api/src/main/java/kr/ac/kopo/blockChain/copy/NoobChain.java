package kr.ac.kopo.blockChain.copy;

import java.security.Security;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import com.google.gson.GsonBuilder;

public class NoobChain {
	public static ArrayList<Block> blockchain = new ArrayList<Block>();
	public static HashMap<String,TransactionOutput> UTXOs = new HashMap<String,TransactionOutput>();
	
	public static int difficulty = 3;
	public static float minimumTransaction = 0.1f;
	public static Wallet walletA;
	public static Wallet walletB;
	public static Wallet walletC;
	
	public static Transaction genesisTransaction;

	public static void main(String[] args) {	
		//add our blocks to the blockchain ArrayList:
		Security.addProvider(new org.bouncycastle.jce.provider.BouncyCastleProvider()); //Setup Bouncy castle as a Security Provider
		
		//Create wallets:
		walletA = new Wallet();
		walletB = new Wallet();		
		walletC = new Wallet();		
		Wallet coinbase = new Wallet();
		
		Map<String, Object> value = new HashMap<>();
		value.put("id", "artwork1");
		value.put("piece", 100f);
		
		//create genesis transaction, which sends 100 NoobCoin to walletA: 
		genesisTransaction = new Transaction(coinbase.publicKey, walletA.publicKey, value, null);
		genesisTransaction.generateSignature(coinbase.privateKey);	 //manually sign the genesis transaction(초기 거래 트랜잭션에 수동으로 서명)	
		genesisTransaction.transactionId = "0"; //manually set the transaction id
		genesisTransaction.outputs.add(new TransactionOutput(genesisTransaction.reciepient, genesisTransaction.value, genesisTransaction.transactionId)); //manually add the Transactions Output
		UTXOs.put(genesisTransaction.outputs.get(0).id, genesisTransaction.outputs.get(0)); //its important to store our first transaction in the UTXOs list.
		
		System.out.println("Creating and Mining Genesis block... ");
		Block genesis = new Block("0");
		genesis.addTransaction(genesisTransaction);
		addBlock(genesis); //coinbase -> walletA로 100 보냄
		
		//testing
		Block block1 = new Block(genesis.hash);
		System.out.println("\nWalletA's balance is: " + walletA.getBalance("artwork1"));
		
		Map<String, Object> value2 = new HashMap<>();
		value2.put("id", "artwork1");
		value2.put("piece", 30f);
		
		Map<String, Object> value3 = new HashMap<>();
		value3.put("id", "artwork1");
		value3.put("piece", 20f);
		
		Map<String, Object> value4 = new HashMap<>();
		value4.put("id", "artwork1");
		value4.put("piece", 40f);
		
		Map<String, Object> value5 = new HashMap<>();
		value5.put("id", "artwork2");
		value5.put("piece", 100f);
		
		Map<String, Object> value6 = new HashMap<>();
		value6.put("id", "artwork2");
		value6.put("piece", 30f);
		
		//[test1] : A가 B에게 artwork1을 30개 줌 => A : 70개, B : 30개
		System.out.println("\nWalletA is Attempting to send funds (30_artwork1) to WalletB...");
		block1.addTransaction(walletA.sendFunds(walletB.publicKey, value2));

		System.out.println("\nWalletA's balance is: " + walletA.getBalance((String) value2.get("id")));
		System.out.println("WalletB's balance is: " + walletB.getBalance((String) value2.get("id")));
		System.out.println("WalletC's balance is: " + walletC.getBalance((String) value2.get("id")));
		
		
		//[test2] : A가 C에게 artwork1을 40개 줌 => A : 30개, B : 30개, C : 40개
		System.out.println("\nWalletA is Attempting to send funds (40_artwork1) to WalletC...");
		block1.addTransaction(walletA.sendFunds(walletC.publicKey, value4));
		System.out.println("\nWalletA's balance is: " + walletA.getBalance((String) value4.get("id")));
		System.out.println("WalletB's balance is: " + walletB.getBalance((String) value4.get("id")));
		System.out.println("WalletC's balance is: " + walletC.getBalance((String) value4.get("id")));
		
		addBlock(block1);
		
		System.out.println("blockchain 길이 : " + blockchain.size());
		for(Block block : blockchain) {
			for(Transaction tran : block.transactions) {
				System.out.println("tran id : " + tran.transactionId + ", block hash : " + block.hash);
			}
		}
		
		//[test3] : A가 artwork2 작품 100조각 받기  => A : 100개, B : 0개, C : 0개 (임의로 데이터 넣기)
		genesisTransaction = new Transaction(coinbase.publicKey, walletA.publicKey, value5, null);
		genesisTransaction.generateSignature(coinbase.privateKey);	 //manually sign the genesis transaction(초기 거래 트랜잭션에 수동으로 서명)	
		genesisTransaction.transactionId = "0"; //manually set the transaction id
		genesisTransaction.outputs.add(new TransactionOutput(genesisTransaction.reciepient, genesisTransaction.value, genesisTransaction.transactionId)); //manually add the Transactions Output
		UTXOs.put(genesisTransaction.outputs.get(0).id, genesisTransaction.outputs.get(0)); //its important to store our first transaction in the UTXOs list.
		/*
		System.out.println("Creating and Mining Genesis block... ");
		Block genesis = new Block("0");
		genesis.addTransaction(genesisTransaction);
		addBlock(genesis); //coinbase -> walletA로 100 보냄
		
		
		
		block1.addTransaction(coinbase.sendFunds(walletA.publicKey, value4));
		System.out.println("\nWalletA's balance is: " + walletA.getBalance((String) value5.get("id")));
		System.out.println("WalletB's balance is: " + walletB.getBalance((String) value5.get("id")));
		System.out.println("WalletC's balance is: " + walletC.getBalance((String) value5.get("id")));
		
		
		
		addBlock(block1); //블록 2개
		
		System.out.println("blockchain : \n" + blockchain.toString());
		
		
		/*
		System.out.println("\nWalletB is Attempting to send funds (90) to WalletA...");
		block1.addTransaction(walletB.sendFunds(walletA.publicKey, 90f));
		System.out.println("\nWalletA's balance is: " + walletA.getBalance());
		System.out.println("WalletB's balance is: " + walletB.getBalance());
		
		addBlock(block1);
		
		System.out.println("blockchain : \n" + blockchain.toString());
		
		
		
		/*
		Block block2 = new Block(block1.hash);
		System.out.println("\nWalletA Attempting to send more funds (1000) than it has...");
		block2.addTransaction(walletA.sendFunds(walletB.publicKey, 1000f));
		addBlock(block2);
		System.out.println("\nWalletA's balance is: " + walletA.getBalance());
		System.out.println("WalletB's balance is: " + walletB.getBalance());
		
		Block block3 = new Block(block2.hash);
		System.out.println("\nWalletB is Attempting to send funds (20) to WalletA...");
		block3.addTransaction(walletB.sendFunds( walletA.publicKey, 20));
		System.out.println("\nWalletA's balance is: " + walletA.getBalance());
		System.out.println("WalletB's balance is: " + walletB.getBalance());
		*/
		//isChainValid();
		
	}
	
	public static Boolean isChainValid() {
		Block currentBlock; 
		Block previousBlock;
		String hashTarget = new String(new char[difficulty]).replace('\0', '0');
		HashMap<String,TransactionOutput> tempUTXOs = new HashMap<String,TransactionOutput>(); //a temporary working list of unspent transactions at a given block state.
		tempUTXOs.put(genesisTransaction.outputs.get(0).id, genesisTransaction.outputs.get(0));
		
		//loop through blockchain to check hashes:
		for(int i=1; i < blockchain.size(); i++) {
			
			currentBlock = blockchain.get(i);
			previousBlock = blockchain.get(i-1);
			//compare registered hash and calculated hash:
			if(!currentBlock.hash.equals(currentBlock.calculateHash()) ){
				System.out.println("#Current Hashes not equal");
				return false;
			}
			//compare previous hash and registered previous hash
			if(!previousBlock.hash.equals(currentBlock.previousHash) ) {
				System.out.println("#Previous Hashes not equal");
				return false;
			}
			//check if hash is solved
			if(!currentBlock.hash.substring( 0, difficulty).equals(hashTarget)) {
				System.out.println("#This block hasn't been mined");
				return false;
			}
			
			//loop thru blockchains transactions:
			TransactionOutput tempOutput;
			for(int t=0; t <currentBlock.transactions.size(); t++) {
				Transaction currentTransaction = currentBlock.transactions.get(t);
				
				if(!currentTransaction.verifySignature()) {
					System.out.println("#Signature on Transaction(" + t + ") is Invalid");
					return false; 
				}
				if(currentTransaction.getInputsValue() != currentTransaction.getOutputsValue()) {
					System.out.println("#Inputs are note equal to outputs on Transaction(" + t + ")");
					return false; 
				}
				
				for(TransactionInput input: currentTransaction.inputs) {	
					tempOutput = tempUTXOs.get(input.transactionOutputId);
					
					if(tempOutput == null) {
						System.out.println("#Referenced input on Transaction(" + t + ") is Missing");
						return false;
					}
					
					if(input.UTXO.value != tempOutput.value) {
						System.out.println("#Referenced input Transaction(" + t + ") value is Invalid");
						return false;
					}
					
					tempUTXOs.remove(input.transactionOutputId);
				}
				
				for(TransactionOutput output: currentTransaction.outputs) {
					tempUTXOs.put(output.id, output);
				}
				
				if( currentTransaction.outputs.get(0).reciepient != currentTransaction.reciepient) {
					System.out.println("#Transaction(" + t + ") output reciepient is not who it should be");
					return false;
				}
				if( currentTransaction.outputs.get(1).reciepient != currentTransaction.sender) {
					System.out.println("#Transaction(" + t + ") output 'change' is not sender.");
					return false;
				}
				
			}
			
		}
		System.out.println("Blockchain is valid");
		return true;
	}
	
	public static void addBlock(Block newBlock) {
		newBlock.mineBlock(difficulty);
		blockchain.add(newBlock);
	}
}

/*
 * public static void main(String[] args) {	
		//add our blocks to the blockchain ArrayList:
		Security.addProvider(new org.bouncycastle.jce.provider.BouncyCastleProvider()); //Setup Bouncey castle as a Security Provider
		
		//walletA = new Wallet();
		//walletB = new Wallet();
		
		//System.out.println("Private and public keys:");
		//System.out.println(StringUtil.getStringFromKey(walletA.privateKey));
		//System.out.println(StringUtil.getStringFromKey(walletA.publicKey));
		
		createGenesis();
		
		//Transaction transaction = new Transaction(walletA.publicKey, walletB.publicKey, 5);
		//transaction.signature = transaction.generateSignature(walletA.privateKey);
		
		//System.out.println("Is signature verified:");
		//System.out.println(transaction.verifiySignature());
		
	}
 */

//System.out.println("Trying to Mine block 1... ");
//addBlock(new Block("Hi im the first block", "0"));