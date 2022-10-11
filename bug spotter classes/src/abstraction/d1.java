package abstraction;
abstract class n1{
	abstract void j1();
	public void t1() {
		System.out.println("i am t1");
	}
}
class n2 extends n1{
	void j1() {
		System.out.println("jay shree ram");
	}
}
class n3 extends n1{
	void j1() {
		System.out.println("jay shree krishna");
	}
}
class n4 extends n1{
	void j1() {
		System.out.println("radhe radhe");
	}
}
public class d1 extends n1 {
	void j1() {
		System.out.println("ram ram");
	}

	public static void main(String[] args) {
		n1 c=new n2();
		n1 d=new n3();
		n1 e=new n4();
		n1 f=new d1();
		c.j1();
		d.j1();
		e.j1();
		f.j1();
		e.t1();

	}

}
