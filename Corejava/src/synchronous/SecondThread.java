package synchronous;

public class SecondThread extends Thread{

	Table t;
	
	public SecondThread(Table t) {
		this.t = t;
	}

	public void run()
	{
		t.printTable(3);
	}
}