package interthreadcom;

public class ThreadDemo {

	int i; //message
	boolean flag = false;
	
	synchronized void deliver(int i)
	{
		if(flag)
		{
			try {
				wait();
			}catch(InterruptedException e)
			{
				System.err.println("Exception caught");
			}
		}
		this.i=i;
		flag=true;
		System.out.println("Data delivered :"+i); 
		notify();
	}
	synchronized int receiver()
	{
		if(!flag)
		{
			try {
				wait();
			}catch(Exception e)
			{
				System.err.println("Exception caught");
			}
		}
		System.out.println("Data received :"+i);
		flag=false;
		notify();
		return i;
	}

}