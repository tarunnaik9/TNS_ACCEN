package exceptions;

public class ThrowExample {
	public void display() throws Exception
	{
		try {
			int age=12;
			if(age<18)
			{
				throw new Exception("Not eligible");
			}
			
		}finally {
			System.out.println("Program executed successfully");
		}
	}
}