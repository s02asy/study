package M1_테스트_배열의주소;

public class M1_테스트_주소개념1 {
	public static void main(String[] args) {

		int arr1[] = {10,20,30,40};
		int arr2[] = {10,20,30,40};
			
		//문제1) 아래 주석을 풀고 실행했을때 어떤값이 나올지 예상하고 
		//      실행해보시요.
		/*
		if(arr1 == arr2) {
			System.out.println("같다.1");
		}else {
			System.out.println("다르다.1");
		}
		*/
			
		//문제2) 아래 주석을 풀고 실행했을때 어떤값이 나올지 예상하고 
		//      실행해보시요.
		int arr3[] = {10,20,30,40};
		int temp[] = arr3;
		int arr4[] = temp;
		/*
		if(arr3 == arr4) {
			System.out.println("같다.2");
		}else {
			System.out.println("다르다.2");
		}
		*/
	}
}