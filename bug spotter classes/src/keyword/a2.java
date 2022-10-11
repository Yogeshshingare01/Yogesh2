package keyword;

public class a2 {
	public void m1(int c) {
		
		System.out.println("i am m1");
	}
	public void m2() {
		this.m1(10);
		System.out.println("i am m2");
	}

	public static void main(String[] args) {
      a2 t=new a2();
      t.m2();
      

	}

}
