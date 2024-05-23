package New;
import java.util.stream.Collectors;
import java.util.List;
import java.util.Arrays;
import java.util.ArrayList;
public class Streamss {
	public static void main(String args[]) {
		
		List<String> names = Arrays.asList("Sam", "Peter","ballon","Sam");
		
		long c=names.stream().filter(s->s.length()>3).count();
		System.out.println(c);//len >than 3
		
		List<String> s=names.stream().map(String::toUpperCase).
				collect(Collectors.toList());//upper case prgm
		System.out.println(s);
		System.out.println("-----------");
		
		List<String> cityList = Arrays.asList("chennai", "mumbai", "bangalore", "", "delhi", "chicago");

    List<String> city=cityList.stream().map(String::toUpperCase).
     collect(Collectors.toList());//upper case
     System.out.println(city);

   long cou=cityList.stream().filter(ci->ci.length()>6).count();
   System.out.println(cou);//len >than 6
   
 List<String> ns=cityList.stream().filter(n->n.startsWith("c")).
collect(Collectors.toList());//starts with c
 System.out.println(ns);
 
 List<String> ai=cityList.stream().filter(n->n.contains("ai")).
		 collect(Collectors.toList());//ai in cities
 System.out.println(ai);
 
 List<String> append=cityList.stream().map(n->n+"metro")
		 .collect(Collectors.toList());//adding metro
 System.out.println(append);
 
 long n=cityList.stream().filter(ci->ci.startsWith("c")).count();
 System.out.println(n);//count of c
 
 long empty=cityList.stream().filter(ci->ci.isEmpty()).count();
 System.out.println(empty);//empty strings
		 
	
	}

}
