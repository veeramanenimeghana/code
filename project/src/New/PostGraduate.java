package New;

public class PostGraduate extends Degree {
	public void getDegree() {
		System.out.println("im a post graduate");
	}
	public static void main(String args[]) {
		PostGraduate pg=new PostGraduate();
		UnderGraduate ug=new UnderGraduate();
		Degree d=new Degree();
		pg.getDegree();
		ug.getDegree();
		d.getDegree();
	}

}
