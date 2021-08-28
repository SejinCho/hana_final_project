package kr.ac.kopo.blockChain.copy;

public class TransactionInput {
	public String transactionOutputId ; //reference to transactionOutput -> transactionId
	public TransactionOutput UTXO; //contains the unspent transaction output
	
	public TransactionInput(String transactionOutputId) {
		this.transactionOutputId = transactionOutputId;
	}

}
