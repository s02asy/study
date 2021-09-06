package X0_04_3_트리_삭제;

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
	void remove(int key) {
		if(findKey(key) == false) {
			System.out.println("삭제 불가 ");
			return;
		}
		
		Node par = root;
		Node cur = root;
		while(true) {
			if(cur.key == key) {
				break;
			}
			if(cur.key > key) {
				par =cur;
				cur  = cur.left;
			}
			if(cur.key < key) {
				par = cur;
				cur = cur.right;
			}
		}
		
		if(cur.left == null && cur.right == null){
			if(cur == root) {
				root = null;
				return;
			}
			
			if(par.left == cur) {
				par.left = null;
			}
			else if(par.right == cur) {
				par.right = null;
			}
			
		}else if(cur.left == null || cur.right == null) {
			if(cur == root) {
				if(root.left != null) {
					root = root.left;
				}else if(root.right != null) {
					root = root.right;
				}
				return;
			}
			
			if(par.left == cur){
				if(cur.left != null) {
					par.left = cur.left;
				}
				else if(cur.right != null) {
					par.left = cur.right;
				}
			}

			else if(par.right == cur){
				if(cur.left != null) {
					par.right = cur.left;
				}
				else if(cur.right != null) {
					par.right = cur.right;
				}
			}
			
			
		}else {
			Node par2 = cur;
			Node cur2 = cur.right;
			while(true) {
				if(cur2.left == null) {
					break;
				}
				par2 = cur2;
				cur2 = cur2.left;
			}
			System.out.println("후보키 : " + cur2.key );
			if(par2.left == cur2) {
				par2.left = cur2.right;
			}else if(par2.right == cur2) {
				par2.right = cur2.right;
			}
			cur.key = cur2.key;
			cur = cur2;
			cur = null;
		}		
	}
}


public class 트리_삭제 {
	public static void main(String[] args) {
		Tree tree = new Tree();
		tree.insert(10);
		tree.insert(10);
		tree.insert(13);
		tree.insert(43);
		tree.insert(33);
		tree.insert(47);
		tree.insert(45);
		tree.insert(46);
		tree.printTree();
		//tree.printTree();
		tree.remove(43);
		tree.printTree();
		
	}
}