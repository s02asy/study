package X1_01_완주하지못한선수;

import java.util.Arrays;


//https://programmers.co.kr/learn/courses/30/lessons/42576?language=java
class Solution {
    public String solution(String[] participant, String[] completion) {
        String answer = "";
        
       Arrays.sort(participant);
       Arrays.sort(completion);
       
       for(int i = 0; i < participant.length; i++) {
    	   if(participant[i].equals(completion[i])) {
    		   
    	   }else {
    		   answer = participant[i];
    		   break;
    	   }
       }
       
        
        return answer;
    }
}
public class Test01 {
	public static void main(String[] args) {
		String [] participant = {
				"a"  , "b" , "c" ,"a"
		};
		String [] completion = {
				"c"  , "b" , "a"
		};
		Solution sol = new Solution();
		String re = sol.solution(participant, completion);
		System.out.println(re);
		
		for(String s : completion) {
			System.out.println(s);
		}
	}
}