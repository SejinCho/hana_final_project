package kr.ac.kopo.vo;

public class AccountInfoVO {
	private String account_number;
	private String account_password;
	private String balance; //잔액
	private String account_type; //(1. 수시입출금, 2. 예적금, 6. 수익증권 등...)
	private String bank_code; //은행 코드
	private String reg_date; //계좌 등록 날짜
	private String account_state; //1. 정상, 2. 휴면계좌, 3. 거래중지
	private String fintech_use_no ; //24자리 랜덤수
	public String getAccount_number() {
		return account_number;
	}
	public void setAccount_number(String account_number) {
		this.account_number = account_number;
	}
	public String getAccount_password() {
		return account_password;
	}
	public void setAccount_password(String account_password) {
		this.account_password = account_password;
	}
	public String getBalance() {
		return balance;
	}
	public void setBalance(String balance) {
		this.balance = balance;
	}
	public String getAccount_type() {
		return account_type;
	}
	public void setAccount_type(String account_type) {
		this.account_type = account_type;
	}
	public String getBank_code() {
		return bank_code;
	}
	public void setBank_code(String bank_code) {
		this.bank_code = bank_code;
	}
	public String getReg_date() {
		return reg_date;
	}
	public void setReg_date(String reg_date) {
		this.reg_date = reg_date;
	}
	public String getAccount_state() {
		return account_state;
	}
	public void setAccount_state(String account_state) {
		this.account_state = account_state;
	}
	public String getFintech_use_no() {
		return fintech_use_no;
	}
	public void setFintech_use_no(String fintech_use_no) {
		this.fintech_use_no = fintech_use_no;
	}
	@Override
	public String toString() {
		return "AccountInfoVO [account_number=" + account_number + ", account_password=" + account_password
				+ ", balance=" + balance + ", account_type=" + account_type + ", bank_code=" + bank_code + ", reg_date="
				+ reg_date + ", account_state=" + account_state + ", fintech_use_no=" + fintech_use_no + "]";
	}
	
	
}
