package hdfc.loans.collections;

import java.util.ArrayList;

public class ListDemo
{

	public static void main(String[] args) 
	{
		 ArrayList a = new ArrayList();
		 a.add(10);
		 a.add("raji");
		 a.add(30.23);
		 a.add(10);
		 a.add(40);
		 System.out.println(a);
		 System.out.println(a.isEmpty());
		 System.out.println(a.size());
		 System.out.println(a.get(1));
		 System.out.println(a.hashCode());
		 
		 System.out.println(a);
		 a.add(54);
		 System.out.println(a);
		 a.add(1,"sai");
		 System.out.println(a);
		 a.set(1,"ramakrishna");
		 System.out.println(a);
		
		 System.out.println(a.subList(2, 6));
		 System.out.println(a);
		 System.out.println(a.contains("raji"));
		 }

}
