package New;
import java.util.function.Consumer;

public class Consumerdemo {
	public static void main(String[]args)
	{
		Consumer<Integer> c=(a)->System.out.println(a+4);
		c.accept(4);
		Consumer<String> st=(name)->System.out.println("hello"+name);
		st.accept("meghana");
		Consumer<Integer> c1=(a)->System.out.println(a);
		c1.accept(5);
		c.andThen(c1).accept(10);
		
		
	
	}

}
