package features;

public class RunnableExp {

	public static void main(String[] args) {
		Runnable r = ()->{
			for(int i=1;i<=5;i++)
			{
				System.out.println("thread"+i);
			}
		};
		
		Thread t = new Thread(r);
		t.start();

	}

}