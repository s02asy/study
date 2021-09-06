package I1_테스트_배열_level2;
public class I1_테스트_배열2_간격1등찾기 {
	public static void main(String[] args) {
		int arr[] = {1001, 20, 30, 1002, 43, 23, 1003, 45, 1};
		
		// 위 데이터는 학생번호 1개 점수2 개 가 한세트이다. 		
		// 번호는 1001부터시작이고 , 점수는 1~100 사이이다. 
		// 예) 1001 , 20, 30
		
		// 위 데이터는 3세트의 데이터를 저장한 배열이다.
		// 1등 번호 출력 (2점수의 합)
		int total = 0;
		int max = 0;
		int index = 0;
		for(int i = 0; i < 9; i++) {
			if(i % 3 == 0) {
				total = arr[i + 1] + arr[i + 2];
				if(max < total) {
					max = total;
					index = i;
				}
			}
		}
		System.out.println("1등 번호 : " + arr[index]);
		System.out.println("1등 점수 합 : " + max);
	}
}