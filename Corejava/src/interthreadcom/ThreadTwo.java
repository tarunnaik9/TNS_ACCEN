package interthreadcom;

public class ThreadTwo  extends Thread{
	ThreadDemo obj ; 
	
	ThreadTwo(ThreadDemo obj)
	{
		this.obj=obj;
	}
	
	public void run()
	{
		for(int k=1;k<5;k++)
		{
			obj.receiver();
		}
	}

}
