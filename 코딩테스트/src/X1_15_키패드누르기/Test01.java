package X1_15_키패드누르기;

//https://programmers.co.kr/learn/courses/30/lessons/67256?language=java
class Solution {
	
	int [] getPos(int[][] pos , int number) {
		int []finger = new int[2];
		for(int i = 0; i < pos.length; i++) {
			for(int j = 0; j < pos[i].length; j++) {
				if(pos[i][j] == number) {
					finger[0] = i;
					finger[1] = j;
					return finger;
				}
			}
		}
		return null;
	}
	
	int[] swap(int a , int b) {
		int sw[] = new int[2];
		if(a < b) {
			int temp = a;
			a = b;
			b = temp;
		}
		sw[0] = a;
		sw[1] = b;
		return sw;
	}
	
	
	int getColse(int [] lfinger , int[] rfinger , int[][] pos , int number) {
		int numPos[] = getPos(pos , number);
		
		int ly[] = swap(lfinger[0] , numPos[0]);
		int lx[] = swap(lfinger[1] , numPos[1]);
		int lDis = (ly[0] + lx[0]) - (ly[1] + lx[1]);
		
		int ry[] = swap(rfinger[0] , numPos[0]);
		int rx[] = swap(rfinger[1] , numPos[1]);
		int rDis = (ry[0] + rx[0]) - (ry[1] + rx[1]);
		//System.out.println();
		//System.out.println(lDis + " " + rDis);
		int re = 0;
		if(lDis < rDis) {
			re = -1;
		}else if(lDis > rDis) {
			re = 1;
		}
		return re;
	}
	String getAnswer(int close , String hand) {
		String answer = "";
		if(close  == -1) {
			answer = "L";
		}else if(close == 1) {
			answer = "R";
		}else if(close == 0) {
			if(hand.equals("right")) {
				answer = "R";
			}else {
				answer = "L";
			}
		}
		return answer;
	}
		
    public String solution(int[] numbers, String hand) {
        String answer = "";
        int lfinger[] =  {3,0};
        int rfinger[] = {3,2};
        int pos[][] = {
        		{ 1, 2, 3},
        		{ 4, 5, 6},
        		{ 7, 8, 9},
        		{-1, 0,-2}
        };
        for(int i = 0; i < numbers.length; i++) {
        	int number = numbers[i];
        	if(number == 1 || number == 4  || number == 7 ) {
        		lfinger = getPos(pos , number);        		
        		answer += "L";
        	}
        	else if(number == 3 || number == 6 || number == 9 ) {
        		rfinger = getPos(pos , number);
        		answer += "R";
        	}else {
        		int close = getColse(lfinger , rfinger , pos , number);       		
        		String a = getAnswer(close , hand);
        		answer += a;
        		if(a.equals("L")) {
        			lfinger = getPos(pos , number);        	
        		}
        		else if(a.equals("R")) {
        			rfinger = getPos(pos , number);        	
        		}
        		
        	}      
        }       
        System.out.println(answer);
        return answer;
    }
}
public class Test01 {
	public static void main(String[] args) {
		Solution sol = new Solution();
		int numbers[] = {1, 3, 4, 5, 8, 2, 1, 4, 5, 9, 5};
		String hand = "right";
		sol.solution(numbers, hand);
	}
}