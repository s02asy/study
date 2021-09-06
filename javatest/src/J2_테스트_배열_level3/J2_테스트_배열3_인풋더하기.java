package J2_테스트_배열_level3;

public class J2_테스트_배열3_인풋더하기 {

	public static void main(String[] args) {
		
		int arr1[] = {4, 65, 23, 1, 45, 7};
		int arr2[] = {61, 2, 54, 3, 5, 6};
		
		// 민수는 학교에서 산수시험을 봤다. 
		// arr1의 숫자와 arr2의 숫자의 합을 구하는 시험이다.
		// 시험은 인덱스 순차적으로 제시된다.
		
		// 4 + 61
		// 65 + 2
		// 23 + 54
		// 1 + 3
		// 45 + 5
		// 7 + 6
		
		// 아래 답안지는 민수가 작성한답이다. 
		// 민수는 답을 순차적으로 적지 않고 뒤섞여서 적었다.
		// 위 더하기문제의  답을 답안지에서 찾아서 민수는 몇문제 맞췄는지 출력 
		// 65 , 67  , 4,  13 // 4문제 정답이므로 4출력  
		
		int input [] = {67, 13, 2, 22, 65, 4};
		int count = 0;
		for(int i = 0; i < 6; i++) {
			int sum = arr1[i] + arr2[i];
			for(int j = 0; j < 6; j++) {
				if(input[j] == sum) {
					count += 1;
				}
			}
		}
		System.out.println(count);
	}
}