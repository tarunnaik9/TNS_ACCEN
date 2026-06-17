package multithreads;

class TDemo{
	
	public void display()
	{
		System.out.println("Parent thread :");
	}
}

public class MultiThread extends Thread{
	public void run()
	{
		for(int i=1;i<=10;i++)
		{
			System.out.println("child thread :"+i);
		}
	}

	
}
