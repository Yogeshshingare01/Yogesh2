package string;

public class swipe_with_3variable {

	public static void main(String[] args) {
	int a=20;
	int b=30;
		
	{
		System.out.println("a="+20); 
		System.out.println("b="+30);
		int c=a;
		    a=b;
		    b=c;
	}
	{
		System.out.println("after swipe");
		System.out.println("a="+a);
		System.out.println("b="+b);
	}
	}

}
