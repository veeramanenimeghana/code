package New;

public class PrintNumber {
	public void printn(int x) {
		System.out.println(x);
	}
	public void printn(char a) {
		System.out.println(a);
	}
	public void printn(String s) {
		System.out.println(s);
	}
	public static void main(String args[]) {
		PrintNumber i=new PrintNumber();
		i.printn(9);
		i.printn('m');
		i.printn("meghana");
	}

}
