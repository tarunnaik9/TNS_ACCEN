package multithreads;

public class RunMain {

	public static void main(String[] args) {
		RunnableT rt = new RunnableT();
		Thread t = new Thread(rt);
		t.start();  //Runnable
		
		for(int i=1;i<=10;i++)
		{
			System.out.println("Main thread :"+i);
		}
	}

}
