package G1_array_기본;

public class G1_array1_기본정답 {

	public static void main(String[] args) {

		int[] arr = new int[5];
		
		// 문제1) 10부터 50까지 arr 배열에 저장
		// 정답1) 10 20 30 40 50
		System.out.println(">>>문제1");
		for(int i=0; i<5; i++) {
			arr[i] = 10 * (i+1);
		}
				
		for(int i=0; i<5; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
		System.out.println(arr[0]);
		System.out.println(arr[1]);
		System.out.println(arr[2]);
		System.out.println(arr[3]);
		System.out.println(arr[4]);
		System.out.println();
		// 문제2) 전체 합 출력
		// 정답2) 150
		System.out.println(">>>문제2");			
		int total = 0;
		for(int i=0; i<5; i++) {
			total += arr[i];
		}
		System.out.println("전체 합 : " + total);

	}

}