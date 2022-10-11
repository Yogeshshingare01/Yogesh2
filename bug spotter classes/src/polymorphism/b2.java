package polymorphism;

public class b2 {
	void b3(int a,char b) {
		System.out.println("coach");
	}
    void b3(char b,int a) {
    	System.out.println("hi");
    }
	public static void main(String[] args) {
		b2 p=new b2();
		p.b3( 'a',1);
		p.b3(1,'c');
		
	}

}
