package _03_2차원배열;
import java.util.Scanner;
public class _03_04_2차원종합_문제 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);		
		int seatList[][] = {
				{0,   0,   0,1001,1001},
				{0,1003,1002,1002,   0},
				{0,1005,1004,   0,   0}
		};
		
		int user[] = {1001,1002,1003,1004,1005};
		
		/*
		 * 1) seatList 는 영화관 크기이다.  3 * 5 크기이다.
		 * 2) 현재 이미 많은 회원이 예매를 한 상황이다.
		 * 3) user 는 회원 5명의 정보이다
		 */
		int log = -1;
		while(true) {
			String menu = "";
			menu += "[1]로그인 [2]로그아웃 [3]예매\n";
			menu += "[4]취소 [5]확인 [6]종료";
			System.out.println(menu);
			int sel = scan.nextInt();
			if(sel == 6) {
				break;
			}else if(sel == 1) {
				if(log == -1) {
					System.out.println("아이디 입력 : ");
					int id = scan.nextInt();
					boolean check = false;
					for(int i = 0; i < user.length; i++) {
						if(id == user[i]) {
							check = true;
							break;
						}
					}
					if(check == false) {
						System.out.println("없는 아이디");
					}else {
						log = id;
						System.out.println("로그인성공.");
					}
				}else {
					System.out.println("로그인중");
				}
			}else if(sel == 2) {
				if(log != -1) {
					log = -1;
					System.out.println("로그아웃");
				}else {
					System.out.println("로그인중");
				}
			}else if(sel == 3) {
				if(log != -1) {
					System.out.println("y : ");
					int y = scan.nextInt();
					System.out.println("x : ");
					int x = scan.nextInt();
					if(seatList[y][x] == 0) {
						seatList[y][x] = log;
						System.out.println("예매 성공");
					}else {
						System.out.println("이미 예매된 자리");
					}
				}else {
					System.out.println("로그인 먼저");
				}
			}else if(sel == 4) {
				if(log != -1) {
					System.out.println("y : ");
					int y = scan.nextInt();
					System.out.println("x : ");
					int x = scan.nextInt();
					if(seatList[y][x] == log) {
						seatList[y][x] = 0;
						System.out.println("취소완료");
					}else {
						System.out.println("내가 예매 x");
					}
				}else {
					System.out.println("로그인 먼저");
				}
			}else if(sel == 5) {
				if(log != -1) {
					for(int i = 0; i < seatList.length; i++) {
						for(int j = 0; j < seatList[i].length; j++) {
							if(log == seatList[i][j]) {
								System.out.println(i + "," + j + " ");
							}
						}
					}
				}else {
					System.out.println("로그인 먼저");
				}
			}
		
		}
		
		
	}
}