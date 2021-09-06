package J4_배열_level4;
import java.util.Arrays;
public class J4_배열4_개수찾기 {
	public static void main(String[] args) {
		
		// 가장많이 들어있는 숫자개수와
		// 가장 적개 들어있는 숫자의 개수의 합을 구하시요.
		
		// 1 : 2개
		// 2 : 3개
		// 3 : 5개 
		
		// 답 : 7
		int[] arr = { 1, 2, 3, 3, 1, 3, 3, 2, 3, 2 };
		System.out.println(Arrays.toString(arr));
		int count = 0;
		int [] temparr = new int[10];
		
		for(int i = 0; i < 10; i++) {		
			boolean check = false;
			for(int j= 0; j < i; j++) {
				if(arr[i] == temparr[j]) {				
					check = true;
					break;
				}						
			}
			if(check == false) {
				temparr[count] = arr[i];
				count += 1;
			}
		}
		System.out.println(Arrays.toString(temparr));
		
		int [] countarr = new int[count];
		for(int i = 0; i < 10; i ++) {
			for(int j = 0; j < count; j++) {
				if(arr[i] == temparr[j]) {
					countarr[j] += 1;
					break;
				}
			}
		}
		System.out.println(Arrays.toString(countarr));
		
		for(int i = 0; i < count - 1; i++) {
			for(int j = i + 1; j < count; j++) {
				if(countarr[i] > countarr[j]) {
					int temp = countarr[i];
					countarr[i] = countarr[j];
					countarr[j] = temp;
				}
			}
		}
		System.out.println(Arrays.toString(countarr));
		int total = countarr[0] + countarr[count-1];
		System.out.println(total);
	}
}