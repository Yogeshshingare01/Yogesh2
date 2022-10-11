package a2_loopstatement;

public class swipe_with_2variable {

	public static void main(String[] args) {
		int a=10;
		int b=20;
		{
			System.out.println("a="+a);
			System.out.println("b="+b);
			
		}
         System.out.println("after swipe");
         {
        	 a=a+b; //a=10+20=30
        	 b=a-b; //b=30-20=10
        	 a=a-b; //a=30-10=20
        	 
        	 System.out.println("a="+a);
        	 System.out.println("b="+b);
         }
	}

}
