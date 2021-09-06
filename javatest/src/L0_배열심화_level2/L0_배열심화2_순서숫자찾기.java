package L0_배열심화_level2;

public class L0_배열심화2_순서숫자찾기 {
	public static void main(String[] args) {		
	int arr[] = {1,3,3,6,5,6,1,8,9};
		
		int input1[] = {6,1,8};
		int input2[] = {6,3};
		
		// input 의 배열안의 값들이   arr배열의 값들과 일치하고,
		//  그순서도 일치하면  true , 아니면 false 출력 
		
		//예) input1의 값들은  6,1,8  이고 arr 의  index 5~7(6,1,8) 의 값과 순서가 일치한다.
		//	  true
		boolean check = false;
		for(int i = 0; i < arr.length - input1.length + 1; i++) {
			int cnt = 0;
			for(int j = 0; j < input1.length; j++) {
				if(arr[i + j] == input1[j]) {
					cnt += 1;
				}
			}
			if(cnt == input1.length) {
				check = true;
			}
		}
		System.out.println(check);
		//예) input2의 값들을 arr 배열에 있는값들과 일치하지만 , 
		//  input2 순서가 6,3 이고  , arr 의 값은 3,6 으로 순서가 다르다.
		//   false
	
	}
}