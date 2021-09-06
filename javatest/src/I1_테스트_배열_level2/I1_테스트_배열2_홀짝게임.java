package I1_테스트_배열_level2;

import java.util.Random;
import java.util.Scanner;

public class I1_테스트_배열2_홀짝게임 {
	public static void main(String[] args) {
		int arr[] = new int[6];
		Random ran = new Random();
		Scanner scan = new Scanner(System.in);
		// 배열 홀짝게임 
		// 1) arr 배열에 1~100사이의 랜덤값을 6개 저장한다.
		
		// 예) arr = {7,45,3,6,78,1}
		
		// 2) 배열의 값을  차례대로  출력한다.
		
		// 예) 첫번째 :   7  (1)홀 , (2)짝
		// 예) 두번째 :   45  (1)홀 , (2)짝
		
		// 3) 제시된문제가 홀수면 1  , 짝수면 2 를 선택한다.
		
		// 4) 6번 반복하고 정답갯수 출력 
		
		// [응용조건] 
		// 틀리면 다음문제로 넘어가지않고
		// 같은문제를 계속제시하도록 변경 
		for(int i = 0; i < 6; i++) {
			arr[i] = ran.nextInt(100) + 1;
		}
		int count = 0;
		String a[] = {"첫번째 : ","두번째 : ","세번째 : ","네번째 : ","다섯번째 : ","여섯번째 : "};
		for(int i = 0; i < 6;) {
			System.out.println(a[i] + arr[i] + " (1)홀 (2)짝");
			int num = scan.nextInt();
			if(num == 1) {
				if(arr[i] % 2 == 1) {
					System.out.println("정답");
					count += 1;
				}else {
					System.out.println("오답");
					continue;
				}
			}else if(num == 2) {
				if(arr[i] % 2 == 0) {
					System.out.println("정답");
					count += 1;
				}else {
					System.out.println("오답");
					continue;
				}
			}else {
				System.out.println("입력숫자를 다시 확인해주세요.");
				continue;
			}
			i += 1;
		}
		System.out.println("정답개수 : " + count + "개");
	}
}