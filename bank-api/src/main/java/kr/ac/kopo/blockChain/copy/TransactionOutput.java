package kr.ac.kopo.blockChain.copy;

import java.security.PublicKey;
import java.util.Map;

public class TransactionOutput {
	public String id;
	public PublicKey reciepient ; //also known as the new owner of these coins.
								 //코인의 새로운 주인
	public Map<String, Object> value; //the amount of coins they own
	public String parentTransactionId; //the id of the transaction this output was created in
									   //이 output이 생성된 트랜잭션 id
	
	
	public TransactionOutput(PublicKey reciepient, Map<String, Object> value, String parentTransactionId) {
		this.reciepient = reciepient;
		this.value = value;
		this.parentTransactionId = parentTransactionId;
		this.id = StringUtil.applySha256(StringUtil.getStringFromKey(reciepient) + value + parentTransactionId);
	}
	
	//check if coin belongs to you
	public boolean isMine(PublicKey publicKey) {
		return (publicKey == reciepient);
	}
}
