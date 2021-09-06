package X1_10_Å¸°Ù³Ñ¹ö;
//https://programmers.co.kr/learn/courses/30/lessons/43165
import java.util.LinkedList;
import java.util.Queue;

class Solution {
	 Queue<Integer> q = new LinkedList<Integer>();
	    public int solution(int[] numbers, int target) {
	        int answer = 0;
	        q.offer(0);
	        q.offer(0);
	        
	        int i = 0;
	        while(q.peek()!=null){
	        	i += 1;
	            int level =q.poll();
	            int v = q.poll();
	            if(level==numbers.length){
	                if(v==target)
	                    answer++;
	            }else {

	                q.offer(level + 1);
	                q.offer(v + numbers[level]);

	                q.offer(level + 1);
	                q.offer(v - numbers[level]);
	            }
	        }
	        System.out.println(i);
	        return answer;
	    }   
}

public class Test01 {
	public static void main(String[] args) {
		int numbers[] = {1,1,1,1,1};
		int target = 3;
		Solution sol = new Solution();
		int re = sol.solution(numbers, target);
		System.out.println(re);
	}
}