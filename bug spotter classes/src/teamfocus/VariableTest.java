package teamfocus;

public class VariableTest {
	int a=80;
	static int b=66;

	public static void main(String[] args) {
		int c=79;
		VariableTest teamfocus=new VariableTest();
		System.out.println(c); // 79
        System.out.println(teamfocus.a); // 80
        System.out.println(b); // 66
	}

}
