package New;

public class BankB extends Bank{
	public void getBalance() {
		System.out.println("150 deposited");
	}
	public static void main(String args[]) {
	BankB b=new BankB();
	b.getBalance();
}}
