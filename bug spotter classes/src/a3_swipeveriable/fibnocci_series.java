package a3_swipeveriable;

public class fibnocci_series {

	public static void main(String[] args) {
		// 0 1 1 2 3 5 8 13 .....
         int a=0;
         int b=1;
         int z;
         System.out.println(a);
         System.out.println(b);
         
         for(int c=1;c<=20;c++) {
        	 
        	z=a+b;
        	System.out.println(z);
        	a=b;
        	b=z;
         }
         
	}

}
