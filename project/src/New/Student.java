package New;

public class Student {
	String name;
	Student()
	{
		this.name="unknown";
		System.out.println(name);
	}
      Student(String name)

  {
	this.name=name;
	System.out.println(name);
  }
public static void main(String args[])
{
	Student s=new Student();
	Student s1=new Student("meghana");
	}}