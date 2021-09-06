package X0_03_큐;

/*
interface Queue{
	boolean isEmpty();
	void enQueue(char item);
	char deQueue();
	char peek();
}
*/

class QNode{
	int data;
	QNode link;
}
class LinkedQueue implements Queue {
	QNode front;
	QNode rear;
	
	public LinkedQueue(){
		front = null;
		rear = null;		
	}
	
	public boolean isEmpty(){
		return (front == null);
	}
	
	public void enQueue(int item){
		QNode newNode = new QNode();
		newNode.data = item;
		newNode.link = null;
		if(isEmpty()){
			front = newNode;
			rear = newNode;
		}
		else {
			rear.link = newNode;
			rear = newNode;			
		}
		System.out.println("Inserted Item : " + item);
	}
	
	public int deQueue(){
		if(isEmpty()) {
			System.out.println("Deleting fail! Linked Queue is empty!!");
			return 0;
		}
		else{ 
			int item = front.data;
			front = front.link;
			if(front == null)
				rear = null;
			return item;
		}				
	}
	
	
	
	public int peek(){
		if(isEmpty()){
			System.out.println("Peeking fail! Linked Queue is empty!!");
			return 0;
		}
		else 
			return front.data;		
	}
	
	public void printQueue(){
		if(isEmpty())
			System.out.printf("Linked Queue is empty!! %n %n");
		else{
			QNode temp = front;
			System.out.println("Linked Queue>> ");
			while(temp != null){
				System.out.println(temp.data);
				temp = temp.link;
			}
			System.out.println();System.out.println();
		}
	}

}


public class 큐_2_리스트 {
	public static void main(String[] args) {
	LinkedQueue LQ = new LinkedQueue();
		
		LQ.enQueue(10);
		LQ.printQueue();
		
		LQ.enQueue(20);
		LQ.printQueue();
		
		
		LQ.deQueue();
		LQ.printQueue();
	}
}