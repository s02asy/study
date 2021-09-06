package X0_02_스택_미로;

import java.util.ArrayList;
import java.util.Stack;
class Node{
	int x;
	int y;
	int dir;
}
class Maze{
	 final int NORTH = 0;
	 final int EAST = 1;
	 final int SOUTH = 2;
	 final int WEST = 3;
	int map [][];
	boolean check[][];
	int low;
	int col;
	Maze(){
		init();
		print();
		run();
	}
	Node findStart() {
		Node node = new Node();
		for(int i = 0; i < map.length; i++) {
			for(int j = 0; j < map[i].length; j++) {
				if(map[i][j] == 2) {
					node.x = j;
					node.y = i;
					
					node.dir = NORTH;
					return node;
				}
			}
		}
		return node;
	}
	
	boolean checkRoad(int x , int y) {
		if(x  < 0 || y < 0 || x >= col || y >= low ) {
			return false;
		}
		if(map[y][x] == 1) {
			return true;
		}
		return false;
	}
	
	void run() {
		Stack<Node> stack = new Stack<Node>();
		Node start = findStart();
		stack.push(start);
		
		while(true) {
			Node node = stack.pop();		
			check[node.y][node.x] = true;			
			print();
			for(int i = node.dir ; i < 4; i++) {
				int xx = 0;
				int yy = 0;
				if(node.dir == NORTH) {
					xx = node.x;
					yy = node.y-1;
				}
				if(node.dir == EAST) {
					xx = node.x + 1;
					yy = node.y;
				}
				if(node.dir == SOUTH) {
					xx = node.x;
					yy = node.y + 1;
				}
				if(node.dir == WEST) {
					xx = node.x - 1;
					yy = node.y;
				}
			//	System.out.println(checkRoad(xx , yy) + " " + check[yy][xx]);
				if(checkRoad(xx , yy) && check[yy][xx] == false) {
					Node road = new Node();
					road.x = xx;
					road.y = yy;
					road.dir = NORTH;			
					stack.push(road);
				}
				if(map[yy][xx] == 3) {
					System.out.println("도착");
					break;
				}
				node.dir += 1;
			}
			if(stack.size() == 0) {
				break;
			}
		}
	}
	
	
	void print() {
		System.out.println("----------------------------------");
		for(int i = 0; i < map.length; i++) {
			for(int j = 0; j < map[i].length; j++) {
				if(check[i][j] == true) {
					System.out.print("# ");
				}else {
					System.out.print(map[i][j] + " ");
				}
				
			}
			System.out.println();
		}
	}
	
	void init() {
		String data = "";
		data +=	"0,0,0,0,0,0,0,0,0,0\n";
		data += "0,2,1,0,0,0,0,1,1,0\n";
		data += "0,0,1,0,1,1,1,1,0,0\n";
		data += "0,0,1,0,0,0,1,0,0,0\n";
		data += "0,0,1,0,0,0,1,0,0,0\n";
		data += "0,0,1,1,1,1,1,1,1,0\n";
		data += "0,0,1,0,0,1,0,0,0,0\n";
		data += "0,0,1,0,0,1,0,0,0,0\n";
		data += "0,0,0,0,0,3,0,0,0,0\n";
		data += "0,0,0,0,0,0,0,0,0,0\n";
		
		String token[] = data.split("\n");
		low = token.length;
		map = new int[low][];
		check = new boolean[low][];
		for(int i = 0; i < low; i++ ) {
			String token2[] = token[i].split(",");
			col = token2.length;
			map[i] = new int[col];
			check[i] = new boolean[col];
			for(int j = 0; j < col; j++) {
				map[i][j] = Integer.parseInt(token2[j]);
				check[i][j] = false;
			}
		}	
	}
}



public class 미로 {
	public static void main(String[] args) {
		new Maze();
	}
}