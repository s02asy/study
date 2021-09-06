package X0_04_2_트리_출력;

import java.util.Stack;

import java.util.Stack;

class Node{
	int key;
	Node  left;
	Node  right;
	boolean check;
	Node(int key){
		this.key = key;
	}
}
class Tree{
	Node root;
	Tree(){
		
	}
	void insert(int key) {
		if(root == null) {
			root = new Node(key);
			System.out.println("root : " + key);
			return;
		}
		if(findKey(key)) {
			System.out.println("중복키 : " + key);
			return;
		}
		
		Node cur = root;
		while(true) {
			if(cur.key > key) {
				if(cur.left ==null) {
					cur.left = new Node(key);
					System.out.println("left : " + key);
					return;
				}
				cur = cur.left;
			}
			if(cur.key < key) {
				if(cur.right == null) {
					cur.right = new Node(key);
					System.out.println("right : " + key);
					return ;
				}
				cur = cur.right;
			}
		}
		
		
	}
	boolean findKey(int key) {
		Node cur = root;
		while(true) {
			if(cur.key == key) {
				return true;
			}
			if(cur.key > key) {
				if(cur.left != null) {
					cur =cur.left;
				}else {
					return false;
				}
			}
			if(cur.key < key) {
				if(cur.right != null) {
					cur = cur.right;
				}else {
					return false;
				}
			}
		}
	}
	void printTree() {
		System.out.println("------------------------");
		Stack<Node> stack = new Stack<Node>();
		stack.add(root);
		while(true) {
			if(stack.size() == 0) {
				break;
			}
			Node top = stack.peek();
			while(true) {
				if(top.left == null) {
					break;
				}
				if(top.check == true) {
					break;
				}
				top.check = true;
				top = top.left;
				stack.push(top);
			}
			top = stack.peek();
			System.out.println(top.key + " ");
			top.check = false;
			stack.pop();
			if(top.right != null) {
				top = top.right;
				stack.push(top);
			}
		}
		System.out.println("------------------------");
	}
	
}



public class 트리_출력 {
	public static void main(String[] args) {
		Tree tree = new Tree();
		tree.insert(10);
		tree.insert(10);
		tree.insert(13);
		tree.insert(43);
		tree.insert(33);
		tree.insert(47);
		tree.printTree();
		tree.printTree();
	}
}