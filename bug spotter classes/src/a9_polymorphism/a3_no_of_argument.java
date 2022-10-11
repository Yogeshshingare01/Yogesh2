       package a9_polymorphism;

      public class a3_no_of_argument {
	    
    	  public void m1(int a, String b) {
    		  System.out.println("hi1");
    	  }
    	  
    	  public void m1(int a, String b, int c) {
    		  System.out.println("hi2");
    		  
    	  }
	public static void main(String[] args) {
		a3_no_of_argument k=new a3_no_of_argument();
		k.m1(10,"abc" );
		k.m1(22, "xyz", 21);
		
		
	}

}
