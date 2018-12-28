package prob5;

public class Account 
{
	private String accountNo;
	private int balance;
	
	public int getBalance() {
		return balance;
	}

	public void setBalance(int balance) {
		this.balance = balance;
	}

	public Account(String accountNo)
	{
		this.accountNo = accountNo;
	}

	public String getAccountNo() {
		return accountNo;
	}

	public void setAccountNo(String accountNo) {
		this.accountNo = accountNo;
	}
	
	public void save(int saveMoney)
	{
		balance += saveMoney;
	}
	
	public void deposit(int depositMoney)
	{
		balance -= depositMoney;
	}
	
	
}