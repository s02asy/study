package J6_프로젝트_배열4;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class J6_프로젝트_배열4_더하기게임 {
	
	// 더하기 게임
	
	//1) 1~10 사이의 숫자를 랜덤으로 7개보여준다. (중복금지)
	//2) 그안에서 3개의 인덱스를 고를수있게해준다. (중복금지)
	//3) 임의의 숫자3개를 더한합을  하나 제시하는데  ,
     //   내가 고른 인덱스3개의 값의 합이 제시된 숫자랑 같으면 정답. 
	//   정답은 여러개 일수있다. 
	//4) 반드시 정답의 경우의 수는 있어야한다.
	
	// 예) 보기  = {1,5,8,6,4,2,9};
	// 예) 제시어 = 13
	
	// 정답) 0,2,4  ==>1 + 8 + 4
	// 오답) 5,5,6 ==> 답은 맞으나 중복인덱스선택
	
	public static void main(String[] args) {
		Random ran = new Random();
		Scanner scan = new Scanner(System.in);
		
		int arr[] = new int[10];
		
		for(int i = 0; i < arr.length; i++) {
			arr[i] = i + 1;
		}
		for(int i = 0; i < 100; i++) {
			int r1 = ran.nextInt(10);
			int r2 = ran.nextInt(10);
			int temp = arr[r1];
			arr[r1] = arr[r2];
			arr[r2] = temp;
		}
		
		int num7[] = new int[7];
		
		for(int i = 0; i < 7; i++) {
			num7[i] = arr[i];
		}
		System.out.println("보기 = " + Arrays.toString(num7));
		int sum = 0;
		boolean check2[] = new boolean[7];
		for(int i = 0; i < 3;) {
			int r = ran.nextInt(7);
			if(check2[r] == false) {
				check2[r] = true;
				sum += num7[r];
				i++;
			}
		}
		System.out.println("제시어 = " + sum);
		while(true) {
			int total = 0;
			boolean check[] = new boolean[7];
			for(int i = 0; i < 3;) {
				System.out.println("보기중 인덱스 3개를 골라 값을 합쳐 제시어를 완성하시오.(" + (i + 1) + "번째)");
				int index = scan.nextInt();
				if(index < 0 || index > 6) {
					System.out.println("인덱스 범위 초과.");
					continue;
				}
				if(check[index] == false) {
					System.out.println(num7[index] + "를 골랐습니다.");
					check[index] = true;
					total += num7[index];
					System.out.println("현재 합 : " + total);
					i++;
				}
				else {
					System.out.println("중복된 인덱스를 선택하셨습니다.");
				}
			}
			if(sum == total) {
				System.out.println("정답 입니다.");
				break;
			}else {
				System.out.println("오답 입니다.");
			}
		}
	}
}