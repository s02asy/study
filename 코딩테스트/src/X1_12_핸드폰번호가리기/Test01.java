package X1_12_핸드폰번호가리기;
//https://programmers.co.kr/learn/courses/30/lessons/12948?language=java
class Solution {
    public String solution(String phone_number) {
        String answer = "";
        for(int i = 0;i < phone_number.length(); i++) {
        	if(phone_number.length() - 4 > i) {
        		answer += "*";
        	}else {
        		answer += phone_number.charAt(i);
        	}
        }
        
        
        return answer;
    }
}
public class Test01 {
	public static void main(String[] args) {
		Solution sol = new Solution();
		String re = sol.solution("01033334444");
		System.out.println(re);
	}
}