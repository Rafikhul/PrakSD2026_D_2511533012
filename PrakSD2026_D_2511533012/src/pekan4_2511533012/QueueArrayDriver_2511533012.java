package pekan4_2511533012;

public class QueueArrayDriver_2511533012 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		QueueArray_2511533012 queue = new QueueArray_2511533012(1000);
		queue.enqueue_3012(10);
		queue.enqueue_3012(20);
		queue.enqueue_3012(30);
		queue.enqueue_3012(40);
		System.out.println("Item di depan " + queue.front_3012());
		System.out.println("Item paling belakang " + queue.rear_3012());
		System.out.println("tampilan queue");
		queue.display_3012();
		System.out.println();
		System.out.println(queue.dequeue_3012() + " dihapus dari queue");
		System.out.println("Item di depan " + queue.front_3012());
		System.out.println("Item di belakang " + queue.rear_3012());
		System.out.println("tampilan queue setelah satu data dihapus");
		queue.display_3012();
		
	}

}
