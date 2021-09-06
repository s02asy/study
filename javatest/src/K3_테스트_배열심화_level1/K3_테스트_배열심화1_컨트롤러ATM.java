package K3_테스트_배열심화_level1;

import java.util.Scanner;

public class K3_테스트_배열심화1_컨트롤러ATM {

/*
 * # ATM[4단계] : 전체 기능구현
 * 1. 회원가입
 * . id와 pw를 입력받아 가입
 * . 가입 시 돈 1000원 부여
 * . id 중복체크
 * 2. 회원탈퇴
 * . 로그인시에만 이용가능
 * 3. 로그인
 * . id와 pw를 입력받아 로그인
 * . 로그아웃 상태에서만 이용가능
 * 4. 로그아웃
 * . 로그인시에만 이용가능
 * 5. 입금
 * . 로그인시에만 이용가능
 * 6. 이체
 * . 로그인시에만 이용가능
 * 7. 잔액조회
 * . 로그인시에만 이용가능
 */
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		int MAX = 5;
		int count = 0;
		int log = -1;
		int[] idList = new int[MAX];
		int[] pwList = new int[MAX];
		int[] moneyList = new int[MAX];
		
		//1.회원가입 2.회원탈퇴 3.로그인 4.로그아웃
		//5.입금 6.송금 7.조회 8.전체회원목록 0.종료.
		
		
		int index = 0;
		while(true) {
			System.out.println("1.회원가입");
			System.out.println("2.회원탈퇴");
			System.out.println("3.로 그 인");
			System.out.println("4.로그아웃");
			System.out.println("5.입     금");
			System.out.println("6.송     금");
			System.out.println("7.조     회");
			System.out.println("8.전체회원목록");
			System.out.println("0.종     료");
			int sel = scan.nextInt();
			
			if(sel == 1) {
				if(count < 5) {
					while(true) {
						System.out.println("아이디 입력");
						int id = scan.nextInt();
						boolean check = false;
						for(int i = 0; i < idList.length; i++) {
							if(id == idList[i]) {
								check = true;
								break;
							}
						}
						if(check == true) {
							System.out.println("이미 사용중인 아이디 입니다.");
							continue;
						}
						else if(check == false) {
							while(true) {
								System.out.println("비밀번호 입력");
								int pw = scan.nextInt();
								System.out.println("비밀번호 확인");
								int pw2 = scan.nextInt();
								if(pw == pw2) {
									idList[count] = id;
									pwList[count] = pw;
									moneyList[count] = 1000;
									count += 1;
									System.out.println("가입 성공");
									break;
								}else {
									System.out.println("비밀번호를 확인해주세요.");
									continue;
								}
							}
							break;
						}
					}
				}else {
					System.out.println("더이상 가입할수 없습니다.");
				}
			}
			else if(sel == 2) {
				if(log == 1) {
					System.out.println("정말 탈퇴 하시겠습니까?");
					System.out.println("1.예 2.아니오");
					int sel2 = scan.nextInt();
					if(sel2 == 1) {
						System.out.println("비밀번호를 입력해주세요.");
						int pw = scan.nextInt();
						if(pw == pwList[index]) {
							idList[index] = 0;
							pwList[index] = 0;
							moneyList[index] = 0;
							for(int i = index; i < idList.length - 1; i++) {
								idList[i] = idList[i + 1];
								pwList[i] = pwList[i + 1];
								moneyList[i] = moneyList[i + 1];
							}
							idList[count - 1] = 0;
							pwList[count - 1] = 0;
							moneyList[count - 1] = 0;
							count -= 1;
							log = -1;
							System.out.println("탈퇴 성공");
						}else {
							System.out.println("비밀번호를 확인해주세요.");
						}
					}else if(sel2 == 2) {
						continue;
					}
				}else {
					System.out.println("로그인 후 이용해주세요.");
				}
			}
			else if(sel == 3) {
				if(log == -1) {
					System.out.println("로그인 아이디 입력");
					int id = scan.nextInt();
					System.out.println("비밀번호 입력");
					int pw = scan.nextInt();
					boolean check = false;
					for(int i = 0; i < idList.length; i++) {
						if(id == idList[i] && pw == pwList[i]) {
							check = true;
							index = i;
							break;
						}
					}
					if(check == true) {
						log = 1;
						System.out.println(idList[index] + "님 환영합니다.");
					}else {
						System.out.println("아이디 또는 비밀번호가 틀립니다.");
					}
				}else {
					System.out.println("로그인 중입니다.");
				}
			}
			else if(sel == 4) {
				if(log == 1) {
					log = -1;
					index = 0;
					System.out.println("로그아웃 성공.");
				}else {
					System.out.println("로그인중이지 않습니다.");
				}
			}
			else if(sel == 5) {
				if(log == 1) {
					System.out.println("입금 하실 금액을 입력해주세요.");
					int money = scan.nextInt();
					moneyList[index] += money;
					System.out.println("입금 성공");
				}else {
					System.out.println("로그인 후 이용하세요.");
				}
			}
			else if(sel == 6) {
				if(log == 1) {
					System.out.println("이체하실 아이디를 입력해주세요.");
					int checkid = scan.nextInt();
					boolean check = false;
					int index2 = 0;
					for(int i = 0; i < idList.length; i++) {
						if(checkid == idList[i]) {
							check = true;
							index2 = i;
							break;
						}
					}
					if(check == true) {
						System.out.println("이체하실 금액을 입력해주세요.");
						int money = scan.nextInt();
						if(moneyList[index] >= money) {
							moneyList[index2] += money;
							moneyList[index] -= money;
							System.out.println("이체 성공.");
						}else {
							System.out.println("잔액이 부족합니다.");
						}
					}else {
						System.out.println("아이디를 확인해주세요.");
					}
				}else {
					System.out.println("로그인 후 이용하세요.");
				}
			}
			else if(sel == 7) {
				if(log == 1) {
					System.out.println("조회를 시작합니다.");
					System.out.println(idList[index] + "님");
					System.out.println("잔액 : " + moneyList[index]);
				}else {
					System.out.println("로그인 후 이용하세요.");
				}
			}
			else if(sel == 8) {
				System.out.println("전체 회원 목록");
				for(int i = 0; i < idList.length; i++) {
					System.out.println(idList[i]);
				}
			}
			else if(sel == 0) {
				System.out.println("종료합니다.");
				break;
			}
		}
	}
}