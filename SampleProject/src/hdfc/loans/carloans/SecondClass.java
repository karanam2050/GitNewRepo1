package hdfc.loans.carloans;

public class SecondClass
{
	//data Properties
	int a=100,b=200,result;
	//Behaviours
	public void add()
	{
		result = a+b;
		System.out.println("Add of A & B is:" + result);
	}
	  public void sub()
	  {
		  result = a-b;
		  System.out.println("Sub of A & B is:" + result);
	  }
	//Constructors

	public static void main(String[] args)
	{
		System.out.println("hello");
		 SecondClass obj = new SecondClass();
		 obj.add();
		 obj.sub();
		}

}
