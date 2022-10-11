package string;

import java.util.Scanner;

public class reverse_string {

	public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str;
        String revstr="";
        System.out.println("enter a string :- ");
        str=sc.nextLine();
        
        int lenght=str.length();
        for(int i=lenght-1;i>=0;i--) {
        	
        	revstr=revstr+str.charAt(i);
        	System.out.println("the reverse string is :- "+revstr);
        }
	}

}
