package M0_배열의주소;

public class M0_주소_배열의길이 {
	public static void main(String[] args) {

		int[] arr = new int[5];
		
		// 배열의 길이 구하기
		int size = arr.length;
		System.out.println("size = " + size);
		
		for(int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
		
	}

}