package multithreads;

public class PriorityDemo {
	public static void main(String[] args) {

        Mythread t1 = new Mythread("Low Priority");
        Mythread t2 = new Mythread("Medium Priority");
        Mythread t3 = new Mythread("High Priority");

        t1.setPriority(Thread.MIN_PRIORITY);   // 1
        t2.setPriority(Thread.NORM_PRIORITY);  // 5
        t3.setPriority(Thread.MAX_PRIORITY);   // 10

        t1.start();
        t2.start();
        t3.start();
    }
}
