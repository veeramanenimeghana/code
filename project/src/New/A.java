package New;

public class A extends Marks{
	int a;
	int b;
	int c; 
    int d;
	public double getPercentage() {
		
	         return (a+b+c+d)/100;
	}
	public A(int a,int b,int c,int d) {
		
		this.a=a;
		this.b=b;
		this.c=c;
		this.d=d;
	}
	public  static void main(String args[]) {
		A a=new A(50,20,79,87);
		System.out.println(a.getPercentage());
	}

}
