package inheritance_1;

    class a3 {
    	void boxing() {
    		System.out.println("i am doing boxing");
    	}
    }


public class a4 extends a3 {
	void dancing() {
		System.out.println("d is dancing");
	}
	
	

	public static void main(String[] args) {
		a4 a=new a4();
		a.boxing();
		a.dancing();

	}

}
