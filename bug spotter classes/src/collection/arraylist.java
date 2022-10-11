package collection;

import java.util.ArrayList;
import java.util.List;

public class arraylist  {

	public static void main(String[] args) {
	 List list=new ArrayList();
	 list.add(10);
	 list.add("dnyanu");
	 list.add('a');
	 
	 System.out.println(list);
	 System.out.println(list.contains(10));
	 System.out.println(list.get(2));
     list.remove(2);
     System.out.println(list);
	}

}
