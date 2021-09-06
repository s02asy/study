package X1_16_Ä«Ä«¿ÀÇÁ·»ÁîÄÃ¸®¸µºÏ;
//https://programmers.co.kr/learn/courses/30/lessons/1829?language=java

import java.util.Arrays;
import java.util.Stack;

class MyPoint {
	int y;
	int x;
	MyPoint(int y , int x){
		this.y =y;
		this.x = x;
	}
}

class Solution {
	boolean check(int y , int x , int num , int[][] picture) {
		if(y < 0 || x < 0 ||
				y >= picture.length ||
				x >= picture[y].length) {
			return false;
		}
		if(picture[y][x] == num) {
			return true;
		}
		return false;
	}
	int setColor(int y , int x, int[][] picture) {
		
		int max = 0;
		Stack<MyPoint> vec = new Stack<>();
		int num = picture[y][x];	
	//	System.out.println("num : " + num + " x " + x + " y " + y);
		MyPoint pos = new MyPoint(y , x);
		vec.add(pos);
		while(true) {	
			if(vec.size() == 0) {
				break;
			}
			pos = vec.get(0);
			picture[pos.y][pos.x] = 0;
			vec.remove(0);		
			max += 1;
			y = pos.y;
			x = pos.x;
			if(check(y -1 , x , num , picture)) {
				pos = new MyPoint(y -1 , x );
				vec.add(pos);
			}
			if(check(y  , x - 1, num , picture)) {
				pos = new MyPoint(y  , x - 1);
				vec.add(pos);
			}
			if(check(y + 1 , x , num , picture)) {
				pos = new MyPoint(y + 1 , x);
				vec.add(pos);
			}
			if(check(y  , x  + 1, num , picture)) {
				pos = new MyPoint(y  , x  + 1);
				vec.add(pos);
			}	
		}		
		return max;
	}
	void print(int m , int n,  int[][] picture) {
		System.out.println("---------------");
		  for(int i = 0; i< m; i++) {
	        	for(int j = 0; j < n; j++) {
	        		System.out.print(picture[i][j] + " ");
	        	}
	        	System.out.println();
		  }
		  System.out.println("---------------");
	}
	
    public int[] solution(int m, int n, int[][] picture) {
        int numberOfArea = 0;
        int maxSizeOfOneArea = 0;
       
        
        
        for(int i = 0; i< m; i++) {
        	for(int j = 0; j < n; j++) {
        		
        		if(picture[i][j] != 0) {
        		//	print(m , n  , picture);
        			int max = setColor(i , j , picture);
        			numberOfArea += 1;       			
        			if(maxSizeOfOneArea < max) {
        				maxSizeOfOneArea = max;
        			}
        			
        		}
        	}
        //	return null;
        }
       
        int[] answer = new int[2];
        answer[0] = numberOfArea;
        answer[1] = maxSizeOfOneArea;
              
        System.out.println(Arrays.toString(answer));
        return answer;
    }
}
public class Test01 {
	public static void main(String[] args) {
		int picture[][] = {
				{ 1, 1, 1, 0 },
				{ 1, 2, 2, 0 },
				{ 1, 0, 0, 1 },
				{ 0, 0, 0, 1 },
				{ 0, 0, 0, 3 },
				{ 0, 0, 0, 3 }
			};
			int m = 6; int n = 4;
			
			Solution sol = new Solution();
			sol.solution(m, n, picture);
	}
}