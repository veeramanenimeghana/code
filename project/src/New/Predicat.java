package New;
import java.util.List;
import java.util.function.Predicate;
public class Predicat {
	public static void main(String args[]) {
		Predicate<String> p=(s)->(s.length())>3;
		System.out.println(p.test("meghana"));
		
		Predicate<Personn> t=(person)->person.getGender().equals("female") && person.getSalary()>2000));
		List<Personn> personList=PersonRep.getAllPersons();
		personList.forEach(person->per.accept(person,person));
		
	}

}
