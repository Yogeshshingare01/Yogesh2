package inheritance;


     class bird{
	 public void fly() {
	System.out.println("i can fly");	 
	 }
 }






public class parrot extends bird {
	void speak() {
		System.out.println("i can speak");
	}
	
	

	public static void main(String[] args) {
		parrot a  =new parrot();
		a.fly();
		a.speak();
		

	}

}
