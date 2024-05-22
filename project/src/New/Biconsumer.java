package New;
import java.util.List;
import java.util.function.BiConsumer;

public class Biconsumer {
	
	public static void main(String args[]) {
		BiConsumer<Integer,Integer> in=(a,b)->System.out.println(a+b);
		in.accept(10, 9);
		
		BiConsumer<String,String> on=(a,b)->System.out.println(a+b);
		on.accept("hello ","meghana");
		
		BiConsumer<Integer,Integer> nn=(a,b)->System.out.println(a-b);
		in.accept(4,5);
		
		
		nn.andThen(in).accept(2,3);
		
		System.out.println("-------------------");
		
		
		BiConsumer<Personn,Personn> per=(sal,hob)->
		{
			System.out.println(sal.getSalary());
	     System.out.println(hob.getHobbies());
		};
		
		List<Personn> personList=PersonRep.getAllPersons();
		personList.forEach(person->per.accept(person,person));
		
	
	   BiConsumer<Personn,Personn> per1=(name,sal)->{
		System.out.println("name:"+name.getName());
		System.out.println("salary:"+sal.getSalary());
	};
	
	
	
	}
}
	
	

