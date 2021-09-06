package I0_배열_level2;


public class I0_배열2_배수저장문제 {
	
	/*
	 * # 4의 배수만 저장
	 * - arr 배열에서 4의 배수만 골라 temp 배열에 저장
	 * - 단! temp 의 길이를 4의 배수만큼만 설정한다. 
	 */

	public static void main(String[] args) {

		int[] arr = {44, 11, 29, 24, 76};
		int[] temp = null;
		int count = 0;
		for(int i = 0; i < 5; i++) {
			if(arr[i] % 4 == 0) {
				count += 1;
			}
		}
		temp = new int[count];
		System.out.println("4의 배수는 : " + count + "개");
		int index = 0;
		for(int i = 0; i < 5; i++) {
			if(arr[i] % 4 == 0) {
				temp[index] = arr[i];
				index += 1;
			}
		}
		for(int i = 0; i < count; i++) {
			System.out.print(temp[i] + " ");
		}
	}

}