package kr.ac.arttech.artscan.vo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class TransactionVO {
	public String transactionId; //Contains a hash of transaction*
    public String artId;
    public String sender; //Senders address/public key.
    public String reciepient; //Recipients address/public key.
    public float value; //Contains the amount we wish to send to the recipient.
    public byte[] signature; //This is to prevent anybody else from spending funds in our wallet.
}
