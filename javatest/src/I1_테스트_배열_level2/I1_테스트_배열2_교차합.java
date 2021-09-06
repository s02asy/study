package I1_테스트_배열_level2;
public class I1_테스트_배열2_교차합 {
	public static void main(String[] args) {
		int arr1[] = {1,2,3,4,5};
		int arr2[] = {1,2,3,4,5};
		int b[] = new int[5];
		
		//배열을 5번반복한다. 
		//arr1은 앞에서부터 진행하고
		//arr2는 거꾸로 진행해서 
		//b에 각 값 의 합을 저장후 출력 
		
		// 예) b[0] = arr1[0] + arr2[4] 
		// 예) b[1] = arr1[1] + arr2[3] 
		int lastindex = 4;
		for(int i = 0; i < 5; i++) {
			b[i] = arr1[i] + arr2[lastindex];
			lastindex -= 1;
		}
		for(int i = 0; i < 5; i++) {
			System.out.print(b[i] + " ");
		}
	}
}