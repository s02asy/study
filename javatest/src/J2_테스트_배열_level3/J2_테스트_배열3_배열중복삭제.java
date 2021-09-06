package J2_테스트_배열_level3;

import java.util.Arrays;
import java.util.Scanner;

public class J2_테스트_배열3_배열중복삭제 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int data[] = {5,5,6,8,2,6};
		int b [] = {0,0,0,0,0,0};
	// 값을 입력받고 삭제 
	// 조건) 만약에 같은값이 있으면 전부 삭제 후 b 에 순차적으로 저장 
	// 예) 2 ==> b [] = {5,5,6,8,6,0};
	// 예) 5 ==> b [] = {6,8,2,6,0,0};
		/*System.out.println(Arrays.toString(data));
		System.out.println("삭제할 값 입력 : ");
		int remove = scan.nextInt();
		int index = 0;
		for(int i = 0; i < 6; i++) {
			if(data[i] != remove) {
				b[index] = data[i];
				index += 1;
			}
		}
		System.out.println(Arrays.toString(b));*/
		
		//앞에꺼 삭제
		/*System.out.println(Arrays.toString(data));
		System.out.println("삭제할 값 입력 : ");
		int num = scan.nextInt();
		int index = 0;
		boolean check = false;
		for(int i = 0; i < 6; i++) {
			if(data[i] == num && check == false) {
				check = true;
			}
			else {
				b[index] = data[i];
				index += 1;
			}
		}
		System.out.println(Arrays.toString(b));*/
		
		//뒤에꺼 삭제
		/*System.out.println(Arrays.toString(data));
		System.out.println("삭제할 값 입력 : ");
		int remove = scan.nextInt();
		int index = 4;
		boolean check = false;
		for(int i = 5; i >= 0; i--) {
			if(data[i] == remove && check == false) {
				check = true;
			}
			else {
				b[index] = data[i];
				index -= 1;
			}
		}
		System.out.println(Arrays.toString(b));*/
		
		System.out.println(Arrays.toString(data));
		System.out.println("삭제할 값 입력 : ");
		int remove = scan.nextInt();
		int index = 0;
		int bindex = 0;
		for(int i = 0; i < 6; i++) {
			if(data[i] == remove) {
				index = i;
				//break;
			}
		}
		for(int i = 0; i < 6; i++) {
			if(i != index) {
				b[bindex] = data[i];
				bindex += 1;
			}
		}
		System.out.println(Arrays.toString(b));
	}
}