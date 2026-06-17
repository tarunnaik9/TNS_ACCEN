package synchronous;


public class ThreadMain {

	public static void main(String[] args) {
		Table t = new Table();
		FirstThread t1 = new FirstThread(t);
		SecondThread t2 = new SecondThread(t);
		
		t1.start();
		t2.start();
	}

}