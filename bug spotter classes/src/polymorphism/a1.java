package polymorphism;

public class a1 {
	
	void a2(int a,String b) {
		System.out.println("dnyana");
	}
 void a2(int c) {
	 System.out.println("cry");
 }
	public static void main(String[] args) {
		a1 p=new a1();
		p.a2(100, "abc");
		p.a2(20);
	}

}
