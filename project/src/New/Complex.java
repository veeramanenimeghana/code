package New;
import java.util.Scanner;
public class Complex {
	
	double real;
	double img;
	
	      public Complex(double real, double img){
		    this.real=real;
		    this.img=img;
		    
	      }
	      
	  public Complex add(Complex other)  {
		  double realsum=(this.real+other.real);
		  double imgsum=(this.real+other.real);
		  return new Complex(realsum,imgsum);
	  }
	  public Complex diff(Complex other)  {
		  double realdiff=(this.real-other.real);
		  double imgdiff=(this.real-other.real);
		  return new Complex(realdiff,imgdiff);
	  }
	  public Complex prod(Complex other)  {
		  double realprod=(this.real*other.real)-(this.img*other.img);
		  double imgprod=((this.real * other.img) + (this.img * other.real));
		  return new Complex(realprod,imgprod);
	  }
	  public static void main(String args[]) {
		  Scanner sc=new Scanner(System.in);
		  System.out.println("real of complex1");
		  double real1=sc.nextDouble();
		  System.out.println("img of complex1");
		  double img1=sc.nextDouble();
		  
		  System.out.println("real of complex2");
		  double real2=sc.nextDouble();
		  System.out.println("img of complex2");
		  double img2=sc.nextDouble();
		  
		  Complex c=new Complex(real1,img1);
		  Complex c1=new Complex(real2,img2);
		  
		  Complex sum=c.add(c1);
		  Complex diff=c.diff(c1);
		  Complex prod=c.prod(c1);
		  
		  System.out.println("sum="+sum.real+"+"+sum.img);
		  System.out.println("diff="+diff.real+"+"+diff.img);
		  System.out.println("prod="+prod.real+"+"+prod.img);
		  
       
	  }
} 
	  