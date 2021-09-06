package M1_테스트_배열의주소;

public class M1_테스트_주소개념2 {
	public static void main(String[] args) {
		int arr[] = {10,20,30};
		
		int darr[][] = {
				{10,20,30},
				{20,30,40},
				{30,40,50}
		};
		
		darr[0] = arr;
		darr[1] = arr;
		darr[2] = arr;
		
        arr[1] = 100;

		// 문제) 아래 실행했을때 어떤결과가 나올지 예상하시요.
		/*
		for(int i = 0; i < 3; i++) {
			for(int j = 0; j < 3; j++) {
				System.out.print(darr[i][j] + " ");
			}
			System.out.println();
		}
		*/
	}
}