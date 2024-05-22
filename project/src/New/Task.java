package New;

public interface Task {
  void m1();
  default void accept() {
	  System.out.println("default method");
	  
  }
  static void m2() {
	  System.out.println("static method");
  }
}
