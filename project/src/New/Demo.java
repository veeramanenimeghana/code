package New;


import java.util.function.Consumer;
import java.util.List;

public class Demo {
	
	public static void main(String args[])
	{
		Consumer<Personn> gen=(gender)->System.out.println(gender.getGender().toUpperCase());
	List<Personn> personList=PersonRep.getAllPersons();
		personList.forEach(gen);
		
		
		Consumer<Personn> sal=(salary)->System.out.println(salary.getSalary()+1000);
		personList.forEach(sal);
	}

}
