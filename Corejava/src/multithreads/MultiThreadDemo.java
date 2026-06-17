package multithreads;

public class MultiThreadDemo {

	public static void main(String[] args) {
		MultiThread t1 = new MultiThread();
		t1.start();
		
		for(int i=1;i<=10;i++)
		{
			System.out.println("Main thread :"+i);
		}
	}
}