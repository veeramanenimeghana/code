package New;

public class TaskClass implements Task {
	
public void  m1() {
	System.out.println("abstract method implementation");
	
}

public static void main(String args[]) {
	TaskClass tc =new TaskClass();
	tc.m1();
	tc.accept();
	Task.m2();
	
			
		}
		
	

}
