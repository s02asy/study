package I0_배열_level2;

import java.util.Scanner;

public class I0_배열2_추가1문제 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int[] arr = {0, 0, 0, 0, 0};
		int count = 0;
		while(true) {
			for(int i = 0; i < 5; i++) {
				System.out.print(arr[i] + " ");
			}
			System.out.println();
			System.out.println("1.추가");
			System.out.println("2.수정");
			System.out.println("0.종료");
			System.out.println("메뉴를 선택하세요.");
			int sel = scan.nextInt();
			if(sel == 1) {
				if(count == 5) {
					System.out.println("더이상 추가 할수 없습니다.");
					continue;
				}
				System.out.println("[추가] 값 입력 : ");
				int data = scan.nextInt();
				boolean check = false;
				for(int i = 0; i < count; i++) {
					if(arr[i] == data) {
						check = true;
						break; //결과를 얻었으면 더이상 반복할 필요가 없다. 과부하 방지.
					}
				}
				if(check == true) {
					System.out.println("중복된 값입니다.");
				}else {
					arr[count] = data;
					count += 1;
					System.out.println("추가성공.");
				}
			}else if(sel == 2) {
				if(count == 0) {
					System.out.println("수정할 값이 없습니다. 값을 추가 후 다시 시도하세요.");
					continue;
				}
				System.out.println("[수정] 값 입력 : ");
				int data = scan.nextInt();
				boolean check = false;
				int index = -1;
				for(int i = 0; i < count; i++) {
					if(arr[i] == data) {
						check = true;
						index = i;
						break;
					}
				}if(check == true) {
					System.out.println("[교체] 값 입력 : ");
					data = scan.nextInt();
					check = false;
					for(int i = 0; i < count; i++) {
						if(data == arr[i]) {
							check = true;
							break;
						}
					}
					if(check == true) {
						System.out.println("중복값. ");
					}else {
						arr[index] = data;
						System.out.println("수정완료. ");
					}
				}else {
					System.out.println("수정할 값을 다시 확인해주세요.");
					continue;
				}
			}else if(sel == 0) {
				System.out.println("종료");
				break;
			}
		}
	}
}
