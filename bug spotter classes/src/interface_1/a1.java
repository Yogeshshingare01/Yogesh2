package interface_1;
interface a2{
	abstract void b1();
}
interface a3{
	abstract void b2();
}
interface a4{
	abstract void b3();
}

public class a1 implements a2,a3,a4 {

	@Override
	public void b3() {
		System.out.println("shree swami samarth");
		
	}

	@Override
	public void b2() {
	System.out.println("ram krushna hari");
		
	}

	@Override
	public void b1() {
		System.out.println("om namha shivay");
		
	}
	public static void main(String[] args) {
		a2 l=new a1();
		a3 m=new a1();
        a4 n=new a1 ();
        l.b1();
        m.b2();
        n.b3();
	}
}
