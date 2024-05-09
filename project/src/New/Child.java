package New;

public class Child extends parent {
public void childm() {
	System.out.println("this is child class");
}
public static void main(string args[]) {
	Parent p=new Parent();
	Child c=new Child();
	p.parentm();
	c.childm();
	c.parentm();
}
}
