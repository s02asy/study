package X1_02_전화번호목록;
import java.util.Arrays;
//https://programmers.co.kr/learn/courses/30/lessons/42577?language=java

class Solution {
    public boolean solution(String[] phone_book) {
        boolean answer = true;
        
        
        Arrays.sort(phone_book);
        
   //     System.out.println(Arrays.toString(phone_book));
        String temp = phone_book[0];
        int size = temp.length();      
        for(int i = 1; i < phone_book.length; i++) {          	      	
        	for(int j = 0; j < phone_book[i].length() - size + 1; j++) {     
        		Boolean check = false;
        		for(int k = 0; k < temp.length(); k++) {
        		//	System.out.print("[" + temp.charAt(k) + " " + phone_book[i].charAt(j + k) + "]");
        			if(temp.charAt(k) != phone_book[i].charAt(j + k)) {
            			check = true;
            		}
        		}
        		if(check == false) {
        			return false; 
        		}        		    		
        	}
        }
        return answer;
    }
}
public class Test01 {
	public static void main(String[] args) {
		//String [] phone_book = {"119", "97674223", "1195524421"};
		String [] phone_book = {
				"0", "87", "4544"
		};
		Solution sol = new Solution();
		Boolean re = sol.solution(phone_book);
		System.out.println(re);
	}
}