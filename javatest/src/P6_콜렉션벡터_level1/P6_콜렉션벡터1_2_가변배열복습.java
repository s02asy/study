package P6_콜렉션벡터_level1;

import java.util.Arrays;
import java.util.Scanner;
import java.util.Vector;

public class P6_콜렉션벡터1_2_가변배열복습 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);		
		
		// 가변배열 직접만들기 
		int arr[] = null;
		int count = 0;
		while(true) {
			System.out.println(Arrays.toString(arr));
			System.out.println("--가변배열만들기--");
			System.out.println("1) 추가");
			System.out.println("0) 종료");
			int sel = scan.nextInt();
			if(sel == 1) {
				System.out.println("[추가] 숫자 입력 : ");
				int num = scan.nextInt();
				if(count == 0) {
					arr = new int[1];
					arr[0] = num;
				}else if(count > 0) {
					int temp[] = arr;
					arr = new int[count +1];
					for(int i = 0; i < count; i++) {
						arr[i] = temp[i];
					}
					temp = null;
					arr[count] = num;
				}
				count += 1;
			}else if(sel == 0) {
				System.out.println("--가변배열종료--");
				break;
			}
		}
		
		System.out.println("---------------------------------------");

	}
}