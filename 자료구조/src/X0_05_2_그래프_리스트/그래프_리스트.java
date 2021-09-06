package X0_05_2_그래프_리스트;

import java.util.Stack;
import java.util.Vector;

class Node{
	int id;
	Node link;
	Node(int id , Node link){
		this.id = id;
		this.link = link;
	}
}
class Graph{
	Vector<String> vertexList = new Vector<String>();
	Vector<Node> edgeList =new Vector<Node>();
	String data = "abcdefghi";
	int size = 0;
	Graph(int size){
		this.size = size;
		for(int i = 0; i< size; i++) {
			edgeList.add(new Node(i , null));
			vertexList.add(data.charAt(i) + "");
		}
	}
	
	void insertEdge(int u , int v) {
		//edgeList.set(u, new Node(v , edgeList.get(u)));
		Node node = edgeList.get(u);
		while(true) {
			if(node.link == null) {
				node.link = new Node(v , null);
				break;
			}
			node = node.link;
		}	
	}
	void printGraph() {
		for(int i = 0; i < size; i++) {
			Node node = edgeList.get(i);
			System.out.print(vertexList.get(i) + " : ");
			while(true) {
				if(node == null) break;
				System.out.print(node.id + " ");
				node = node.link;
			}
			System.out.println();
		}		
	}
	void DFS(int u) {
		System.out.println("-----------------------");
		Stack<Node> stack = new Stack<Node>();
		stack.add(edgeList.get(u));
		boolean [] check = new boolean[size];
		while(true) {
			Node node = stack.peek();
			while(true) {
				if(node == null) {
					stack.pop();
					break;
				}
				if(node!= null && check[node.id] == false) {
					System.out.print(node.id + " ");
					stack.add(edgeList.get(node.id));
					check[node.id] = true;
					break;
				}
				node = node.link;
			}
			
			if(stack.size() == 0) {
				break;
			}
		}
		System.out.println();
		System.out.println("-----------------------");
	}
}
	
public class 그래프_리스트 {
	public static void main(String[] args) {
		Graph g = new Graph(5);		
		g.insertEdge(0, 1);
		g.insertEdge(1, 4);
		g.insertEdge(0, 3);
		g.printGraph();
		g.DFS(0);
		
	}
}