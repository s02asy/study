package X1_04_주식가격;
//https://programmers.co.kr/learn/courses/30/lessons/42584?language=java

import java.util.Arrays;

class Solution {
    public int[] solution(int[] prices) {
        int[] answer = {};
        answer = new int[prices.length];
        for(int i = 0; i < prices.length; i++) {
        	int count = 0;     	
        	for(int n = i + 1; n < prices.length; n++) {
        		count += 1;
        		if(prices[i] > prices[n]) {        			  			
        			break;
        		}       		
        	}
        	answer[i] = count;
        }           
        return answer;
    }
}
public class Test01 {
	public static void main(String[] args) {
		int [] prices = {1,2,3,2,3};
		
		Solution sol = new Solution();
		int [] re = sol.solution(prices);
		System.out.println(Arrays.toString(re));
	}
}