package inheritance_1;
 class d1{
	 void shy() {
		 System.out.println("i am shy");
	 }
 }
 class d2 extends d1{
	 void speak() {
		 System.out.println("i am speaking");
	 }
 }
 class d3 extends d2{
	 void sleep() {
		 System.out.println("dnyanu is sleeping at time 12 hr");
	 }
 }
 class d4 extends d3{
	 void rain() {
		 System.out.println("it's raining");
	 }
 }




public class d5 extends d4 {
void sleep1() {
System.out.println("i am sleeping");
}
	public static void main(String[] args) {
		
	 d5 a=new d5();
	 a.shy();
	 a.speak();
	 a.sleep();
	 a.rain();
	 a.sleep1();
	}

}
