package New;

public class Dogs extends Animals {
	public void dogs() {
		System.out.println("dogs bark");
	}
	public void cats() {
		
	}
	public static void main(String args[]) {
		Dogs d =new Dogs();
		Cats c=new Cats();
		d.dogs();
		c.cats();
	}

}
