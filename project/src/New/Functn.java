package New;
import java.util.function.Function;
public class Functn {
	public static void main(String args[]) {
		
		Function<String, String> fun =(name) -> name.toUpperCase();
		System.out.println(fun.apply("meghana"));
		
		Function<Integer, String> fu = (a) -> a+"18";
		System.out.println(fu.apply(7));


	}

}
