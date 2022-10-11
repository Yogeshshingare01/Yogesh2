package logical_program;

import java.util.Scanner;

public class reverse_string2 {

	public static void main(String[] args) {
Scanner sc=new Scanner(System.in);
System.out.println("ENTER THE VALUE");

int no=sc.nextInt();

int rev=0;

while(no!=0) {
	rev=rev*10+no%10;
    no=no/10;
}System.out.println("reverse the no. "+rev);

	}

}
