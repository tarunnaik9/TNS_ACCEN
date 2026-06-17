package interthreadcom;

public class ThreadMain {

	public static void main(String[] args) {
		ThreadDemo obj = new ThreadDemo();
		ThreadOne t1 = new ThreadOne(obj);
		ThreadTwo t2 = new ThreadTwo(obj);
		
		t1.start();
		t2.start();
	}

}
