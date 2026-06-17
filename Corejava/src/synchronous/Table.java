package synchronous;

public class Table {
	
	//non-synchronized
	
	synchronized void printTable(int n) 
	{
		for(int i=1;i<=10;i++)
		{
			System.out.println(n+"*"+i+"="+n*i); //2*1=2
		}
		try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
