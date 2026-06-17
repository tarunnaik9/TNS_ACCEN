package multithreads;

public class RunnableT implements Runnable{
	//function interface - having only 1 Abstract method
	//Marker interface - having 0 abstract method
	
	@Override
	public void run() {    //Running
		for(int i=1;i<=10;i++)
		{
			System.out.println("child runnable thread :"+i);
		}
		
	}
}