package encapsulation;

public class m1 {
	private int rollno;
	public void setrollno(int rollno) {
		this.rollno=rollno;
	}
	public  int getrollno() {
		return rollno;
		
	}

	public static void main(String[] args) {
		m1 g=new m1();
		g.setrollno(201);
	System.out.println(g.getrollno());
	g.setrollno(202);
	System.out.println(g.getrollno());

}

}
