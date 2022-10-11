package logical_program;

public class swipe_2variable {

	public static void main(String[] args) {
    int a=20,b=25;
    System.out.println("before swipe "+a+" "+b);
    a=a+b;
    b=a-b;
    a=a-b;
    System.out.println("after swipe "+a+" "+b);
    
	}

}
