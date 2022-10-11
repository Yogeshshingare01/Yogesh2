package inheritance_1;
  class b1{
	  void painting () {
		  System.out.println("i am painting");
	  }
  }
 class b2 extends b1{
	 void studing() {
		 System.out.println("i am studing");
	 }
 }
 class b3 extends b1{
	 void playing() {
		 System.out.println("i am playing");
	 }
 }
 

public class b4 extends b1 {
	void boxing () {
		System.out.println("i doing boxing");
	}

	public static void main(String[] args) {
		b1 a=new b1();
		b2 b=new b2();
		b3 c=new b3();
		b4 d=new b4();
		
		a.painting();
		b.studing();
		c.playing();
		d.boxing();

	}

}
