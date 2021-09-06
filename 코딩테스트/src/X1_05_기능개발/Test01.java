package X1_05_기능개발;

//https://programmers.co.kr/learn/courses/30/lessons/42586
import java.util.Arrays;
import java.util.Vector;
class Solution {
	int getCheck(int[] progresses  , int index , Vector<Integer> vec) {
		int count = 0;
		for(int i = index; i < progresses.length; i++) {
			if(progresses[i] == 100) {
				count += 1;
			}else {
				break;
			}
		}
		if(count > 0) {
			vec.add(count);
		}
		System.out.println("count : " + count);
		index += count;	
		printProgress(progresses);
		System.out.println("index : " + index);
		for (Integer value : vec) { // for each 반복문 이용 데이터 출력
			System.out.print(value + " ");
		}
		
		System.out.println();
		return index;
	}
	void printProgress(int[] progresses) {
		for(int i = 0; i < progresses.length; i++) {
			System.out.print(progresses[i] + " ");
		}
		System.out.println();
	}
    public int[] solution(int[] progresses, int[] speeds) {
        int[] answer = {0};
        int index = 0;
        Vector<Integer> vec = new Vector<Integer>();     
        int n = 0; 
        while(true) {       	
        	for(int i = 0; i < progresses.length; i++) {        		
        		progresses[i] += speeds[i];
        		if(progresses[i] >= 100) {
        			progresses[i] = 100;
        		}
        		
        	}
        	index = getCheck(progresses , index , vec);
        	
        	if(index == progresses.length) {
        		break;
        	}
        	n += 1;
        }
        answer = new int[vec.size()];
        int  i = 0;
        for (Integer value : vec) { // for each 반복문 이용 데이터 출력
        	answer[i] = value;
        	i += 1;
		}
        return answer;
    }
}
public class Test01 {
	public static void main(String[] args) {
		Solution sol = new Solution();
		int []progresses = {99,1,99,1};
		int [] speeds = {1,1,1,1};
		int [] re = {2,1};
		re = sol.solution(progresses, speeds);
		System.out.println(Arrays.toString(re));
	}
}