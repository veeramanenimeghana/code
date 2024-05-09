package New;

public class Rectangle {
	int a;
	int b;
	public Rectangle(int a,int b)
	{
		System.out.println("area="+a*b);
	}
	public int area() {
		
		return a*b;
	}
	public static void main(String args[])
	{
		Rectangle r1= new Rectangle(4,5);
		Rectangle r2= new Rectangle(5,8);
}
}







/*.Write a program to print the area of two rectangles having sides (4,5) and (5,8)
respectively by creating a class named 'Rectangle' with a method named 'Area' which returns
the area and length and breadth passed as parameters to its constructor.*/