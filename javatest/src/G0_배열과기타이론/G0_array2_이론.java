package G0_배열과기타이론;

public class G0_array2_이론 {

	public static void main(String[] args) {

		// 1.배열 사용법(1)
		int[] arr = null;
		arr = new int[3];
		arr[0] = 10;
		arr[2] = 20;
		arr[3] = 30;
		
		for (int i = 0; i < 3; i++) {
			System.out.println(arr[i]);
		}
		
		int[] arr2 = new int[3];
		arr2[0] = 10;
		arr2[1] = 20;
		arr2[2] = 30;

		for (int i = 0; i < 3; i++) {
			System.out.println(arr2[i]);
		}
		System.out.println("-----------------------------");
		// 2.배열 사용법(2) : 축약형
		int[] temp = { 10, 20, 30 }; // 위와 동일하다.

		for (int i = 0; i < 3; i++) {
			System.out.println(temp[i]);
		}

	}

}