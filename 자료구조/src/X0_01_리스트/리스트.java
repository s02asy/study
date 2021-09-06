package X0_01_리스트;

class Node{
	String data;
	Node next;
}
class LinkedList{
	Node head;
	int size;
	
	void insertNodeLast(String data) {
		Node node = new Node();
		node.data = data;
		if(size == 0) {
			head = node;
		}else {
			Node pre = head;
			for (int i = 0; i < size -1; i++) {
				pre = pre.next;
			}
			pre.next = node;
		}
		size += 1;
	}
	
	void printLinkedList() {
		System.out.println("---------------------------");
		Node pre = head;
		for(int i = 0; i < size; i++) {
			System.out.println( i + 1 + " " + pre.data);
			pre = pre.next;
		}
		System.out.println();
		System.out.println("---------------------------");
	}
	void insertNodePos(String data , int pos) {
		if(pos < 0) return;
		if(pos > size) return;
		
		Node node = new Node();
		node.data = data;
		if (pos == 0) {
			node.next = head;
			head = node;
		}
		else {
			Node pre = head;
			for(int i = 0; i< pos - 1; i++) {
				pre = pre.next;
			}
			node.next = pre.next;
			pre.next = node;
		}	
		size += 1;
	}
	LinkedList reverseList() {
		LinkedList tempList = new LinkedList();
		Node pre = head;	
		for(int i = 0; i < size; i++) {
			tempList.insertNodePos(pre.data, 0);
			pre = pre.next;
		}
		return tempList;
	}
}
public class 리스트 {
	public static void main(String[] args) {
		// 자료구조는 총 3가지가 있다.
		// 1)배열 ==> 개수제한. (특징)
		// 2)벡터 ==> 가변배열. 단점 : 전체복사를 해야함.
		// 3)리스트 ==> 벡터의 단점을 보완.
		LinkedList list =new LinkedList();
		list.insertNodeLast("a");
		list.insertNodeLast("b");
		list.insertNodeLast("c");
		list.insertNodeLast("d");
		list.printLinkedList();
		list.insertNodePos("e" , 0);
		list.printLinkedList();
		list.insertNodePos("f" , 1);
		list.printLinkedList();
		list.insertNodePos("g" , 6);
		list.printLinkedList();
		list = list.reverseList();
		list.printLinkedList();
 
		//삭제 ,  정렬을 만들어보세요. 
	}
}