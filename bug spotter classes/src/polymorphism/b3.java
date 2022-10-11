package polymorphism;
 class b1{
	 void k1(int a,double  c) {
		System.out.println("hello"); 
	 }
 }




public class b3 extends b1 {
	void k1(int a,double c) {
		System.out.println("try");
	}
	

	public static void main(String[] args) {
		b3 x=new b3();
		x.k1(22, 3.14);
	}

}
