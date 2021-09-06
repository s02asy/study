package X1_07_가장큰수;
//https://programmers.co.kr/learn/courses/30/lessons/42746

class Solution {
	int getMax(String a, String b) {
		String c = a + b;
		String d = b + a;
		if (c.compareTo(d) > 0) {
			return 1;
		} else if (c.compareTo(d) == 0) {
			return 0;
		} else {
			return -1;
		}
	}

	public String solution(int[] numbers) {
		String answer = "";
		sort(numbers , 0 , numbers.length-1);
		
		for(int i = 0; i < numbers.length; i++) {
			answer += numbers[i];
		}		
		return answer;
	}
	
	
	public void sort(int[] data, int l, int r) {
		int left = l;
		int right = r;
		int pivot = data[(l + r) / 2];
		do {			
			while (getMax(data[left] + "" , pivot + "") > 0)		
				left++;
			while (getMax(data[right] + "" , pivot + "") < 0)		
				right--;
			if (left <= right) {
				int temp = data[left];
				data[left] = data[right];
				data[right] = temp;
				left++;
				right--;
			}
		} while (left <= right);

		if (l < right)
			sort(data, l, right);
		if (r > left)
			sort(data, left, r);
	}

}

public class Test01 {
	public static void main(String[] args) {
		int[] numbers = { 0, 0, 0, 0, 0 };
		Solution sol = new Solution();

		String re = sol.solution(numbers);
		System.out.println(re);
	}
}