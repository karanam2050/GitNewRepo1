package hdfc.loans.personalloans;

public class ExceptionDemo 
{

	public static void main(String[] args)
	{
	   int nr =100,dr=0, result;
	    Scanner sc =new scanner(System.in);
	   {
		while (true)
		{
			try {
				result = nr / dr;
				System.out.println(result);
			} catch (ArithmeticException e) {

				e.printStackTrace();
			} 
		} 
	}
	}

}
