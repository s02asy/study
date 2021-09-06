package _02_배열심화;

import java.util.Arrays;
import java.util.Scanner;

public class _02_03_예매종합_문제 {
	public static void main(String[] args) {
			
		int seatList[] = {1003,1003,0,0,1002,0,1001};	
		int user [] = {1001,1002,1003,1004};
		
		/*
		 * 1) seatList 는 현제 영화관 예매상황 이다.
		 * 2) user 는 회원번호이다 
		 */
		
		Scanner scan = new Scanner(System.in);
		int log = -1;
		while(true) {
			System.out.println(Arrays.toString(seatList));
			System.out.println("[1]로그인 [2]로그아웃");
			System.out.println("[3]예매 [4]취소");
			System.out.println("[5]확인 [6]종료");
			int sel = scan.nextInt();
			if(sel == 6) {
				break;
			}else if(sel == 1) {
				if(log == -1) {
					System.out.println("아이디 입력 : ");
					int id = scan.nextInt();
					boolean check = false;
					for(int i = 0; i < user.length; i++) {
						if(user[i] == id) {
							check = true;
							break;
						}
					}
					if(check == true) {
						log = id;
						System.out.println("로그인 성공.");
					}else {
						System.out.println("없는 아이디 입니다.");
					}
				}else {
					System.out.println("로그아웃 후 이용 바랍니다.");
				}
			}else if(sel == 2) {
				if(log != -1) {
					log = -1;
					System.out.println("로그아웃 성공.");
				}else {
					System.out.println("로그인 후 이용바랍니다.");
				}
			}else if(sel == 3) {
				if(log != -1) {
					System.out.println("좌석 입력 : ");
					int num = scan.nextInt();
					if(num < 0 || num >= seatList.length) {
						System.out.println("없는 좌석입니다.");
						continue;
					}
					if(seatList[num] == 0) {
						seatList[num] = log;
						System.out.println("예매 성공.");
					}else {
						System.out.println("이미 예약중인 좌석입니다.");
					}
				}else {
					System.out.println("로그인 후 이용바랍니다.");
				}
			}else if(sel == 4) {
				if(log != -1) {
					System.out.println("취소할 좌석을 선택 : ");
					int num = scan.nextInt();
					if(num < 0 || num >= seatList.length) {
						System.out.println("없는 좌석입니다.");
						continue;
					}
					if(seatList[num] == log) {
						seatList[num] = 0;
						System.out.println("예매 취소성공.");
					}else {
						System.out.println(log + "님이 예매하신 좌석이 아닙니다.");
					}
				}else {
					System.out.println("로그인 후 이용바랍니다.");
				}
			}else if(sel == 5) {
				if(log != -1) {
					System.out.print(log + "님이 예매하신 좌석 : ");
					for(int i = 0; i < seatList.length; i++) {
						if(log == seatList[i]) {
							System.out.print(i + "번 ");
						}
					}
					System.out.println();
				}else {
					System.out.println("로그인 후 이용바랍니다.");
				}
			}
		}
		
	}
}