package a9_polymorphism;

public class a2_sequence_of_argument {

	public void m1(int a,String b) {
		System.out.println("hello1");
		
	}
	public void m1(String b, int a) {
		System.out.println("hello2");
		
	}
	public static void main (String[] args) {
		a2_sequence_of_argument p=new a2_sequence_of_argument();
		p.m1(10, "abc");
		p.m1("abc", 10);
		
	}
}
