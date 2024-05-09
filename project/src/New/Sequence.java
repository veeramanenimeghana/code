package New;

public class Sequence {
	public void meth(int x,char a) {
		System.out.println("int value="+x);
		System.out.println("char value="+a);
	}
	
	public void meth(char a,int x) {
		System.out.println("char value="+a);
		System.out.println("int value="+x);
	}
	public static void main(String args[]) {
		Sequence s=new Sequence();
		s.meth(5, 'm');
		s.meth('a', 6);
	}

}
