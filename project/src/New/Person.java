package New;

public class Person extends polymorphism {
	public void meth() {
		System.out.println("if person enters,ask him to show ID ");
	}
	public static void main(String args[]) {
		Person p=new Person();
		Employee e=new Employee();
		Boss b=new Boss();
		b.meth();
		p.meth();
		
		
	}

}
