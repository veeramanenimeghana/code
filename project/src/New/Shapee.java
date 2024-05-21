package New;

public class Shapee {
	int x;
	int y;
	int a;
	int r;
	public void rectangle(int x,int y) {
		System.out.println("area of rectangle="+x*y);
	}
public void square( int a) {
	System.out.println("area of square="+a*a);
}
public void circle(int r) {
	System.out.println("area of circle="+3.14*r*r);
}
public static void main(String args[]) {
	Shapee s=new Shapee();
	s.rectangle(4,6);
	s.square(3);
	s.circle(2);
}
}



