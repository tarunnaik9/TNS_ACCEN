package collectionpack.queues;


import java.util.PriorityQueue;

public class PriorityQueueDemo {

	public static void main(String[] args) {
		PriorityQueue<Integer> pq = new PriorityQueue<>();

        pq.add(30);
        pq.add(10);
        pq.add(50);
        pq.add(20);

        System.out.println("Queue: " + pq);
        //View head element
        System.out.println("Peek: " + pq.peek());
        //Remove head element
        System.out.println("Poll: " + pq.poll());

        System.out.println("After Poll: " + pq);
        //offer()-Insert element
        System.out.println("Offers: " + pq.offer(100));
        System.out.println("Queue " + pq);
	}

}