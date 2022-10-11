package array;

public class array_2d {

	public static void main(String[] args) {
	//int[][] b;
	//b=new int[5][5];
	// or
	int[][] b=new int[5][8];
	b[0][0]=10;                 //   0  1  2  3 {{10,20,30}{60,70,80}}
	b[0][1]=20;                 //0 10  20 30
	b[0][2]=30;                 //1 40  50  60 
	b[1][0]=40;                 //2
	b[1][1]=50;                 //3
	b[1][2]=60;
	
	System.out.println(b[0][1]);
	//System.out.println(b[1].length);
	System.out.println(b.length);
	System.out.println(b[1][2]);
	System.out.println(b.length);
	System.out.println(b.length);
	}
}
