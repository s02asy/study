package X1_08_큰수만들기;

//https://programmers.co.kr/learn/courses/30/lessons/42883
class Solution {
    public String solution(String number, int k) {
        String answer = "";
        int size = number.length() - k;
        int start = 0;     
        int lastIndex = number.length() - size;
    //    System.out.println("size : " + size);
        while(true) {
        	if( 0 == size) {
        		break;
        	}       	
        	char max = number.charAt(start);
        	int index = start;
        	for(int i = start; i <= lastIndex; i++) {
        		char c = number.charAt(i);
        		
        		if(c > max) {
        			max = c;
        			index= i;
        		}       		
        	}
        	answer += max;
        	start = index + 1;   
        	size = size - 1;       
        	lastIndex = number.length() - size;        	     	  	
			
			/*
			 * System.out.println("max : " + max + " "); System.out.println("start : " +
			 * start); System.out.println("size : " + size);
			 * System.out.println("lastIndex : " + lastIndex);
			 * System.out.println("--------------------------");
			 */
			     
        }
        return answer;
    }
}
public class Test01 {
	public static void main(String[] args) {
		Solution sol = new Solution();
		String number = "4177252841";
		int k = 4;
		String re = sol.solution(number, k);
		System.out.println(re);
	}
}