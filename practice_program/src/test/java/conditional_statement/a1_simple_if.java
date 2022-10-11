package conditional_statement;

import java.util.Scanner;

public class a1_simple_if {

	public static void main(String[] args) {
   int age;
   System.out.println("enter your age");
   Scanner sc=new Scanner(System.in);
   age=sc.nextInt();
   
   if(age>=18) {
	   System.out.println("eligible for votes...!");
   }
  // if(age<=70) {
	 //  System.out.println("not eligible for votes...!");
   //}
   
   
   System.out.println("Thank you....!");
	}

}
