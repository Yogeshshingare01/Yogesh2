package keyword;
class a12{
	int a;
	public void a14(int a) {
		System.out.println("i am a14");
	}
}


public class a11 extends a12 {
	public void a13(int a) {
		super.a=a;
		
	}

	public static void main(String[] args) {
		a11 w=new a11();
		w.a13(30);

	}

}
