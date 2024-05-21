package New;
import java.util.ArrayList;
public class ArrayListt {
	
	public static void main(String args[]) {
		ArrayList d=new ArrayList();
		d.add("maggie");
		d.add(1);
		d.add(true);
		System.out.println(d);
		System.out.println(d.size());
	
	
	ArrayList foodlist=new ArrayList();
	foodlist.add("biryani");
	foodlist.add("burger");
	foodlist.add("pizza");
	d.addAll(foodlist);
	System.out.println(d);
	System.out.println(d.contains("pizza"));
	
	
	System.out.println("traversing");
	for(Object list:d) {
	System.out.println(list);
	}
	
	
	System.out.println("adding of the data using index no");
	d.add(4,"ice cream");
	System.out.println(d);
	
	System.out.println("removing using index ");
	d.remove(3);
	System.out.println(d);
	d.remove(true);
	System.out.println(d);
	System.out.println(d.subList(2, 5));
	
	
	
}}