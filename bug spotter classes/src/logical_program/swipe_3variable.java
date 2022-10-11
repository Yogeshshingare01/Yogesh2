package logical_program;

public class swipe_3variable {

	public static void main(String[] args) {
    int a=30,b=20,c;
    System.out.println("before swipe  "+a+" "+b);
    c=a;
    a=b;
    b=c;
    System.out.println("after swipe   "+a+" "+b);
	}

}
