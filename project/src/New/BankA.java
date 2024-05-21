package New;

public class BankA extends Bank {
	public void getBalance() {
		System.out.println("100 deposited");
	}
public static void main(String args[]) {
	BankA a=new BankA();
	a.getBalance();
}
}
