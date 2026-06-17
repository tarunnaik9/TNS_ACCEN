package synchronous;


public class FirstThread extends Thread{
	Table t ;

	public FirstThread(Table t) {
		this.t = t;
	}
	public void run()
	{
		t.printTable(2);
	}
	
}