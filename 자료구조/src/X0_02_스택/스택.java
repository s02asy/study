package X0_02_스택;


class Node{
	String data;
	Node next;
}
class Stack{
	int size;
	Node top;
	
	void push(String data) {
		Node node= new Node();
		node.data = data;
		if (size == 0) {
			top = node;
		}else {
			node.next = top;
			top = node;
		}
		size += 1;
	}
	void pop() {
		if(size == 0)return;
		top = top.next;
		size -= 1;
	}
	Node peek() {
		return top;
	}
	void print() {
		System.out.println("----------");
		Node cur = top;
		for(int i = 0; i < size; i++) {
			System.out.println(cur.data);
			cur = cur.next;
		}
		System.out.println("----------");
	}
}
public class 스택 {
	public static void main(String[] args) {
		Stack stack = new Stack();
		stack.push("a");
		stack.push("b");
		stack.push("c");
		stack.push("d");
		stack.push("e");
		stack.print();
		stack.pop();
		stack.pop();
		Node peek = stack.peek();
		System.out.println(peek.data);
		stack.print();
	}
}