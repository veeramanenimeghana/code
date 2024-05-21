package New;

public class B extends Marks{
	int m1;
	int m2;
	int m3;
	
	public double getPercentage() {
		return (((m1+m2+m3)/3)*100)/100 ;
	}
 public B(int m1,int m2,int m3) {
	 this.m1=m1;
	 this.m2=m2; 
	 this.m3=m3;
 }
 public static void main(String args[]) {
	 B b=new B(80,90,80);
	 System.out.println(b.getPercentage());
	 
 }
}
