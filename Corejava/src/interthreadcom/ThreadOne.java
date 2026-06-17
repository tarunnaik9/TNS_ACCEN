package interthreadcom;

public class ThreadOne extends Thread{
	ThreadDemo obj ; 
	
	ThreadOne(ThreadDemo obj)
	{
		this.obj=obj;
	}
	
	public void run()
	{
		for(int j=1;j<5;j++)
		{
			obj.deliver(j);
		}
	}
}