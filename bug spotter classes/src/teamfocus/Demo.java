package teamfocus;

public class Demo {
     int a=77; // instance variable
     static int b=69; //static variable
     
     public void Display() {
    	System.out.println("I am Display Method");
    	  	 
     }
     public static void Show() {
     System.out.println("I am Static Show Method");
	
     }
     public void Addition(int p,int q) {
    	 int z=p+q; //30+40
    		System.out.println(z); // 70 
     } 
     public void Addition() {
    	 int t=10;
    	 int y=20;
    	 System.out.println(t+y);
     }
    	 public static void main(String[] args) {
		System.out.println(Demo.b);
		Demo d=new Demo();
		System.out.println(d.a);
		d.Display();
		Demo.Show();
		d.Addition(20,40); //60
		d.Addition(); //22
		d.Addition(19,37); // 56
	
    	 }

}