package abstraction;
abstract class a2{
	abstract void b1();
	public void c1() {
		System.out.println("i am c1");
	}
}
class a3 extends a2{
	void b1(){
		System.out.println("i am b1");
	}
}
class a4 extends a2{
	void b1() {
		System.out.println("jay shri krushna");
	}
}
public class a1 extends a2{
void b1() {
	System.out.println("yogesh");
}
	public static void main(String[] args) {
		a2 k=new a3();
		a2 m=new a1();
		a2 n=new a4();
		k.b1();
		m.b1();
		m.c1();
		n.b1();

	}

}
