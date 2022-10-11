package encapsulation;

public class m2 {
private int id;
public void setid (int id) {
	this.id=id;
}
	public int getid() {
	 return id;
		
	}
	

	public static void main(String[] args) {
		m2 d=new m2();
		d.setid(22);
		System.out.println(d.getid());
	}

}
