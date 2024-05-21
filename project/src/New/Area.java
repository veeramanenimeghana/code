package New;

public class Area {
	int x;
	int y;
	int a;
	public void area1(int x,int y) {
		System.out.println("area of rectangle="+x*y);
	}
public void area1( int a) {
	System.out.println("area of square="+a*a);
	
}
public static void main(String args[]) {
	Area ar=new Area();
	ar.area1(2,3);
	ar.area1(2);
}
}

