package J5_테스트_배열_level4;

public class J5_테스트_배열4_배열비교3 {

	public static void main(String[] args) {
		
		int arr[] = {10, 20, 30, 40};		
		int input[] = {30, 40, 1, 10, 2};
		
		int b[] = {-1, -1, -1, -1, -1};
		
		// 1) arr 배열안에 input 배열 안 의 값이 있을때마다 
		// 2) b배열안에 input 값의 인덱스를 b의 같은자리에 저장할려고 한다. 
		// 조건) 만약에 input 숫자가 arr 에 없으면 인덱스 대신 -1 저장 
	
		// 예)  input[] ==> { 30, 40, 1, 10, 2 }
		//   1) 30 은 arr[2] 이므로 2저장 
		//   2) 40 은 arr[3] 이므로 3저장
		//   3) 1 은 arr에 없으므로 -1 저장
		//   4) 10 은 arr[0] 이므로 0 저장
		//   5) 2는 arr에 없으므로 -1  저장 
		
		
		// [조건] 단 앞에서 부터 저장 
		// b = { 2, 3, -1, 0, -1}
					
		// b = { 2, 3, 0, -1, -1}
				
		int index = 0;
		for(int i = 0; i < 5; i++) {
			for(int j = 0; j < 4; j++) {
				if(arr[j] == input[i]) {
					b[index] = j;
					index += 1;
				}
			}
		}
		for(int i = index; i < b.length; i++) {
			b[i] = -1;
		}
		for(int i = 0; i < 5; i++) {
			System.out.print(b[i] + " ");
		}
	}
}