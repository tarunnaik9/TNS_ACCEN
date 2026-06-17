package multithreads;

public class SleepDemo extends Thread {
	 public void run() {
	        for(int i = 1; i <= 5; i++) {
	            System.out.println(i);
	            try {
	                Thread.sleep(1000); // 1 second pause
	            } catch(Exception e) {}
	        }
	    }

	    public static void main(String[] args) {
	        SleepDemo t = new SleepDemo();
	        t.start();
	    }
}