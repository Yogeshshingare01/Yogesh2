package a9_polymorphism;

public class a1_types_of_argument {
	
	public void login (String email, int pass) {
		System.out.println("navigate to home page");
	}
	
	
	
	
	public void login (int mob, int p) {
		System.out.println("navigate to home page");
	}

	public static void main(String[] args) {
		a1_types_of_argument login=new a1_types_of_argument();
	     login.login(1234, 1234);
		 login.login("abc",1234);
	}

}
