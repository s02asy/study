package I0_배열_level2;

import java.util.Arrays;
import java.util.Scanner;

public class 연습 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int[] arr = {0, 0, 0, 0, 0};
		int count = 0;
		
		while(true) {
			System.out.println(Arrays.toString(arr));
			System.out.println("1.추가");
			System.out.println("2.수정");
			System.out.println("3.삭제[인덱스]");
			System.out.println("4.삭제[값]");
			System.out.println("5.삽입");
			System.out.println("0.종료");
			int sel = scan.nextInt();
			if(sel == 1) {
				if(count == 5) {
					System.out.println("추가불가");
					continue;
				}
				System.out.println("[추가] 값 입력");
				int data = scan.nextInt();
				boolean check = false;
				for(int i = 0; i < count; i++) {
					if(data == arr[i]) {
						check = true;
						break;
					}
				}
				if(check == true) {
					System.out.println("중복숫자");
				}
				else {
					arr[count] = data;
					count += 1;
					System.out.println("추가 성공.");
				}
			}
			else if(sel == 2) {
				if(count == 0) {
					System.out.println("값추가 후 다시 시도.");
					continue;
				}
				System.out.println("[수정] 값 입력");
				int data = scan.nextInt();
				boolean check = false;
				int index = -1;
				for(int i = 0; i < count; i++) {
					if(data == arr[i]) {
						check = true;
						index = i;
						break;
					}
				}
				if(check == true) {
					while(true) {
						System.out.println("[변경] 값 입력");
						int data2 = scan.nextInt();
						boolean check2 = false;
						for(int i = 0; i < count; i++) {
							if(data2 == arr[i]) {
								check2 = true;
							}
						}
						if(check2 == true) {
							System.out.println("중복 값");
							continue;
						}
						else {
							arr[index] = data2;
							break;
						}
					}
				}
				else {
					System.out.println("값 없음");
				}
			}
			else if(sel == 3) {
				if(count == 0) {
					System.out.println("삭제값 없음");
					continue;
				}
				System.out.println("[삭제] 인덱스 입력");
				int data = scan.nextInt();
				if(data < 0 || data >= count) {
					System.out.println("범위초과");
					continue;
				}
				for(int i = data; i < count - 1; i++) {
					arr[i] = arr[i + 1];
				}
				arr[count - 1] = 0;
				count -= 1;
				System.out.println("삭제 완료.");
			}
			else if(sel == 4) {
				if(count == 0) {
					System.out.println("삭제값 없음");
					continue;
				}
				System.out.println("삭제 값 입력");
				int data = scan.nextInt();
				int index = -1;
				boolean check = false;
				for(int i = 0; i < count; i++) {
					if(data == arr[i]) {
						index = i;
						check = true;
					}
				}
				if(check == true) {
					for(int i = index; i < count -1 ; i++) {
						arr[i] = arr[i + 1];
					}
					arr[count - 1] = 0;
					count -= 1;
					System.out.println("삭제 완료.");
				}
				else {
					System.out.println("삭제 값없음");
				}
			}
			else if(sel == 5) {
				if(count == 0 || count == 5) {
					System.out.println("삽입 불가");
					continue;
				}
				System.out.println("삽입 인덱스 입력.");
				int data = scan.nextInt();
				if(data < 0 || data > count) {
					System.out.println("범위 초과");
					continue;
				}
				while(true) {
					System.out.println("삽입 값 입력.");
					int data2 = scan.nextInt();
					boolean check = false;
					for(int i = 0; i < count; i++) {
						if(data2 == arr[i]) {
							check = true;
						}
					}
					if(check == true) {
						System.out.println("중복");
						continue;
					}
					else {
						int last = count;
						for(int i = data; i < count; i++) {
							arr[last] = arr[last - 1];
							last -= 1;
						}
						arr[data] = data2;
						count += 1;
						System.out.println("삽입성공.");
						break;
					}
				}
			}
			else if(sel == 0) {
				System.out.println("종료");
				break;
			}
		}
	}
}
