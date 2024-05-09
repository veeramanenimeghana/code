package New;
public class Pyramidd {
public static void main(String args[])
{
 int n=5;
	int i;
	for(i=0;i<=n;i++)
	{

	for(int k=1; k<=(n-i); k++) {
		System.out.print(" ");
	}
	for(int j=0; j<=i; j++) {
		System.out.print(" *");
	}
	System.out.println();
}}}