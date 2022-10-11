package string;

public class string1 {
	 String name="dnyanu";
	 String name1="  samadhan ";
	 String name2="dnyanu&yogesh&samadhan";
	 String name3="DNYANU";
	 
	 

	public static void main(String[] args) {
		string1 p=new string1();
		System.out.println(p.name.equalsIgnoreCase(p.name1));
        System.out.println(p.name.equals(p.name3));
        System.out.println(p.name1.concat(p.name3));
        System.out.println(p.name2.length());
        System.out.println(p.name.toUpperCase());
        System.out.println(p.name3.toLowerCase());
        System.out.println(p.name.startsWith("dny"));
        System.out.println(p.name1.endsWith("sh"));
        System.out.println(p.name.replaceAll("samadhan", "dnyanu"));
        System.out.println(p.name1.trim());
        
        String[]k=p.name2.split("&");
        String c1=k[0];
        String c2=k[1];
        String c3=k[2];
        System.out.println(c3);
	}

}
