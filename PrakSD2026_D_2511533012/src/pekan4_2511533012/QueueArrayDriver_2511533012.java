package pekan4_2511533012;

public class QueueArrayDriver_2511533012 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		QueueArray_2511533012 queue_3012 = new QueueArray_2511533012(1000);
		queue_3012.enqueue_3012(10);
		queue_3012.enqueue_3012(20);
		queue_3012.enqueue_3012(30);
		queue_3012.enqueue_3012(40);
		System.out.println("Item di depan " + queue_3012.front_3012());
		System.out.println("Item paling belakang " + queue_3012.rear_3012());
		System.out.println("tampilan queue");
		queue_3012.display_3012();
		System.out.println();
		System.out.println(queue_3012.dequeue_3012() + " dihapus dari queue");
		System.out.println("Item di depan " + queue_3012.front_3012());
		System.out.println("Item di belakang " + queue_3012.rear_3012());
		System.out.println("tampilan queue setelah satu data dihapus");
		queue_3012.display_3012();
		
	}

}
