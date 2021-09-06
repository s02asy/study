package X1_06_K��°��;
//https://programmers.co.kr/learn/courses/30/lessons/42748?language=java

import java.util.Arrays;
import java.util.Collections;
import java.util.Vector;
class Solution {
    public int[] solution(int[] array, int[][] commands) {
        int[] answer = {};
        answer =new int[commands.length];       
        for(int i = 0; i < commands.length; i++) {
        	int start = commands[i][0]-1;
        	int end = commands[i][1];
        	Vector<Integer> vec = new Vector<Integer>();
        	
        	for(int n = start; n < end; n++) {
             	vec.add(array[n]);
            }
            Collections.sort(vec);
           // System.out.println(vec);
            int index = commands[i][2] -1;
            answer[i] = vec.get(index);
        }    
        return answer;
    }
}
public class Test01 {
	public static void main(String[] args) {
		int array[] = {1,5,2,6,3,7,4};
		int commands[][] = {
				{2,5,3},
				{4,4,1},
				{1,7,3}};
		Solution sol = new Solution();
		
		int [] re = sol.solution(array, commands);
		System.out.println(Arrays.toString(re));
	}
}