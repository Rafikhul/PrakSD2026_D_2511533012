package pekan4_2511533012;

public class QueueArray_2511533012 {
	int front, rear, size;
	int capacity;
	int array[];
	
	public QueueArray_2511533012(int capacity) {
		this.capacity = capacity;
		front = this.size = 0;
		rear = capacity - 1;
		array = new int [this.capacity];
	}
	
	boolean isFull(QueueArray_2511533012 queue) {
		return (queue.size == queue.capacity);
	}
	
	boolean isEmpty(QueueArray_2511533012 queue) {
		return (queue.size == 0);
	}
	
	void enqueue_3012(int item) {
		if (isFull(this))
			return;
		this.rear = (this.rear + 1) % this.capacity;
		this.array[this.rear] = item;
		this.size = this.size + 1;
		System.out.println(item + " enqueue to queue");
	}
	
	int dequeue_3012() {
		if (isEmpty(this))
			return Integer.MIN_VALUE;
		int item = this.array[this.front];
		this.front = (this.front + 1) % this.capacity;
		this.size = this.size + 1;
		return item;
	}
	
	int front_3012() {
		if (isEmpty(this))
			return Integer.MIN_VALUE;
		
		return this.array[this.front];
	}
	
	int rear_3012() {
		if (isEmpty(this))
			return Integer.MIN_VALUE;
		
		return this.array[this.rear];
	}
	
	void display_3012() {
		int i;
		if(front == rear) {
			System.out.printf("\nAntrian Kosong\n");
			return;
		}
		
		for (i = front; i < rear; i++) {
			System.out.printf("%d <-- ", array[i]);
		}
	}
}
