package exceptions;

public class ExceptionHandle {

	public void show()
	{
			
		try {
				//NullPointerException
				String s = "null";  
				System.out.println(s.length()); 
				
				//ArithmeticException
				int a = 10;
				int b = 20;
				int c = a/b;
				System.out.println(c); 
				
				int[] arr = {10,20,30,40,50};
				System.out.println(arr.length);
				System.out.println(arr[2]); 
		
		}
		catch(ArrayIndexOutOfBoundsException e2)
		{
			System.out.println("You are retriving exceed value");
		}
		catch(ArithmeticException e1)
		{
			System.out.println("the div is not possible bcoz the num is divided by zero");
		}
		catch(NullPointerException e)
		{
			System.out.println("The string null doesnt contain any length");
		}
		finally {
			System.out.print("This is finally block");
		}
		
	}
}
