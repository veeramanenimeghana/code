package New;

import java.util.function.Consumer;

public class Consumers {
	{

	public static void main(String args[]) {
   Consumer<Integer> c = (a)->System.out.println(a+19);
   c.accept(4);
   }
	}}


