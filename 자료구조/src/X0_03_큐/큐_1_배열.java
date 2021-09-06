package X0_03_큐;

interface Queue{
	public boolean isEmpty();
	public void enQueue(int data);
	public int deQueue();
	public int peek();
}
class ArrayCircleQueue implements Queue{
	public int front;
	public int rear;
	public int queueSize;
	public int arr[];
	
	public ArrayCircleQueue(int size) {
		front = 0;
		rear = 0;
		queueSize = size;
		arr =new int[queueSize];
	}
	
	public boolean isEmpty() {
		return (front == rear);
	}
	public boolean isFull() {
		return (((rear +1) % queueSize) == front);
	}
	public void enQueue(int data) {
		if(isFull()) {
			System.out.println("가득참");
		}else {
			rear = (rear + 1) % queueSize;
			arr[rear] = data;
		}
	}
	public int deQueue() {
		if(isEmpty()) {
			System.out.println("비어있음");
		}else {
			front = (front + 1) % queueSize;
			return arr[front];
		}
		return 0;
	}
	
	public int peek() {
		if(isEmpty()) {
			System.out.println("비어있음");
		}else {
			return arr[(front + 1)% queueSize];
		}
		return 0;
	}
	public void printQueue() {
		System.out.println("-------------------");
		if(isEmpty()) {
			System.out.println("비어있음");
		}else {
			int f = (front + 1) % queueSize;
			int r = (rear + 1)% queueSize;
			for(int i = f; i != r; i = (++i % queueSize)) {
				System.out.println(arr[i]);
			}
		}
		System.out.println("-------------------");
	}
}




public class 큐_1_배열 {
	public static void main(String[] args) {
		// queue 배열은 1칸은 버린다.
		int size = 4;
		ArrayCircleQueue q = new ArrayCircleQueue(size);
		
		q.enQueue(10);
		q.enQueue(20);
		q.enQueue(30);
		q.enQueue(40);
		
		q.printQueue();
		
		q.deQueue();
		
		q.enQueue(50);
		
		q.printQueue();
	}
}