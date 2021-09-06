package X1_11_두개뽑아서더하기;
//https://programmers.co.kr/learn/courses/30/lessons/68644?language=java
import java.util.Arrays;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

class Solution {
    public int[] solution(int[] numbers) {
        int[] answer = {};
        Set<Integer> sumNumber = new TreeSet<>();
        for(int i = 0; i < numbers.length; i++) {
        	for(int j = i + 1; j < numbers.length; j++) {
        		System.out.println(numbers[i] + " "  + numbers[j]);
        		int sum = numbers[i] + numbers[j];
        		sumNumber.add(sum);     		
        	}
        }
     
        answer = new int[sumNumber.size()];
        int i = 0;
        Iterator<Integer> itor = sumNumber.iterator();
        while(itor.hasNext()){
            answer[i] = itor.next();
            i++;
        }
        return answer;
    }
}
public class Test01 {

	public static void main(String[] args) {
		
		Solution sol = new Solution();
		
	//	int [] numbers = {2,1,3,4,1};
		int [] numbers = {5,0,2,7};
		int [] result = sol.solution(numbers);
		System.out.println(Arrays.toString(result));
	}

}