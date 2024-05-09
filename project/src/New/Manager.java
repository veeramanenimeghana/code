package New;

public class Manager extends Member{

	String specalization;
	String department;
	
	public static void main(String args[]){
		Manager m=new Manager();
		m.name="meghana";
		m.age=23;
		m.phno="1234567890";
		m.addr="hyderabad";
		m.sal=30000;
		m.specalization="devlper";
		m.department="it";
		
		Employee e=new Employee();
		e.name="meghana";
		e.age=23;
		e.phno="1234567890";
		e.addr="hyderabad";
		e.sal=30000;
		e.specailization="devlper";
		
		System.out.println("manager details:"+m.name+" "+m.age+" "+m.phno+" "+e.sal);
		System.out.println("employee details:"+e.name+" "+e.age+" "+e.phno+" "+e.sal+" "+e.addr+" "+e.specailization);
		
	}
}
