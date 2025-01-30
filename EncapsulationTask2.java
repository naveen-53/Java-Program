package OOPs;

class BankAccount{
	private String accountNo;
	private double balance;
	
	public String getAccountNo() {
		return accountNo;
	}
	public void setAccountNo(String accountNo) {
		this.accountNo = accountNo;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	
}
public class EncapsulationTask2 {

	public static void main(String[] args) {
		BankAccount b = new BankAccount();
		b.setAccountNo("33932925977");
		b.setBalance(3000);
		
		System.out.println("Account No: "+b.getAccountNo());
		System.out.println("Balance: "+b.getBalance());

	}

}
