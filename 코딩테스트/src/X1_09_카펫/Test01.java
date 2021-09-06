package X1_09_Ä«Æê;
//https://programmers.co.kr/learn/courses/30/lessons/42842
import java.util.Arrays;

class Solution {
    public int[] solution(int brown, int yellow) {
        int[] answer = {};
        
        // b = 2x + 2y - 4
        // y = (x-2) * (y-2)
        // w >= h
        // h >= 3
        
        int w = 0;
        int h = 0;
        
        int mh = (int) ((brown + 4) / 2);
        
        for(h = 3; h < mh; h++) {
        	w = ((brown + 4) /2) - h;
        	
        	int yCount = (w - 2) * (h- 2);
        	if(yCount == yellow) {
        		break;
        	}
        }
        
        //System.out.println(w + " " + h);
        answer = new int[2];
        answer[0] = w;
        answer[1] = h;    
        return answer;
    }
}
public class Test01 {
	public static void main(String[] args) {
		Solution sol = new Solution();
		int brown = 24;
		int yellow = 24;
		int re[] =  sol.solution(brown, yellow);
		System.out.println(Arrays.toString(re));
	}
}