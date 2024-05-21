package New;

public class BankC extends Bank {
	public void getBalance() {
		System.out.println("200 deposited");
	}
	public static void main(String args[]) {
		BankC c =new BankC();
		c.getBalance();
	}

}
