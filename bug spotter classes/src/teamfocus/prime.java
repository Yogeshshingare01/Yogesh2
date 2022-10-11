package teamfocus;

public class prime {

	public static void main(String[] args) {
int a=7;
int b=0;
for(int c=2;c<=a-1;c++) {
	if(a%c==0) {
		b=b+1;
		
	}
}
if(b==0) {
	System.out.println("prime no");
}else {
	System.out.println("not prime no");
}
	}

}
