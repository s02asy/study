package L1_테스트_배열심화_level2;

import java.util.Arrays;
import java.util.Scanner;

public class L1_테스트_배열심화2_티켓 {

	/* [영화관좌석예매]
	 * (1)회원가입 (2)로그인  (0) 종료
	 * 
	 * [회원가입] ==> id 만 가입 ==> 중복처리 
	 * [로그인후] ==> (1) 로그아웃 (2) 예매 (3) 예매확인(본인것만 좌석번호출력 ) 
	 *             (4) 예매취소(본인것만) (0) 뒤로가기 
	 *
	 * 1) 회원가입은 20명까지 가능하다.
	 * 2) idList 에는 회원들의 id를 저장 
	 * 3) 로그인이후 좌석을 구매하면 seatList 는 구매한사람의 id 를저장 
	 * 4) checkList 에는 좌석을 구매했는지 여부 
	 * 
	 */
	public static void main(String[] args) {
		int max = 20;
		int idList[] = new int[max];
		int count = 0;
		int seatList[][]= new int[3][4];
		int seatList2[][]= new int[3][4];
		int checkList[][] = new int[3][4];
		Scanner scan = new Scanner(System.in);
		int num = 1;
		for(int i = 0; i < seatList.length; i++) {
			for(int j = 0; j < seatList[i].length; j++) {
				seatList[i][j] += num;
				seatList2[i][j] += num;
				num += 1;
			}
		}
		while(true) {
			System.out.println("(1)회원가입 (2)로그인  (0) 종료");
			int sel = scan.nextInt();
			
			if(sel == 1) {
				if(count == max) {
					System.out.println("더이상 가입 불가.");
					continue;
				}
				while(true) {
					System.out.println("가입 id 입력 (3자리 이상)");
					int id = scan.nextInt();
					boolean check = false;
					if(id >= 100) {
						for(int i = 0; i < idList.length; i++) {
							if(idList[i] == id) {
								check = true;
								break;
							}
						}
						if(check == false) {
							idList[count] = id;
							count += 1;
							System.out.println("회원가입완료.");
							break;
						}else {
							System.out.println("중복된 아이디입니다.");
						}
					}else {
						System.out.println("아이디를 3자리 이상으로 입력해주세요.");
					}
				}
			}
			else if(sel == 2) {
				System.out.println("아이디 입력");
				int id = scan.nextInt();
				boolean check = false;
				int index = -1;
				for(int i = 0; i < idList.length; i++) {
					if(idList[i] == id) {
						check = true;
						index = i;
						break;
					}
				}
				if(check == true) {
					System.out.println(idList[index] + "님 환영합니다.");
					while(true) {
						System.out.println("(1) 로그아웃 (2) 예매 (3) 예매확인(본인것만 좌석번호출력) (4) 예매취소(본인것만) (0) 뒤로가기");
						int sel2 = scan.nextInt();
						if(sel2 == 1) {
							System.out.println("로그아웃");
							break;
						}
						else if(sel2 == 2) {
							for(int i = 0; i < seatList.length; i++) {
								for(int j = 0; j < seatList[i].length; j++) {
									if(checkList[i][j] == 0) {
										System.out.print("[ ]");
									}else {
										System.out.print("[X]");
									}
								}
								System.out.println();
							}
							System.out.println("예매하실 자리를 선택해주세요.");
							int sel3 = scan.nextInt();
							if(sel3 < 1 || sel3 > 12) {
								System.out.println("좌석 번호가 아닙니다.");
								continue;
							}
							int index1 = -1;
							int index2 = -1;
							for(int i = 0; i < seatList.length; i++) {
								for(int j = 0; j < seatList[i].length; j++) {
									if(seatList2[i][j] == sel3) {
										index1 = i;
										index2 = j;
										break;
									}
								}
							}
							if(checkList[index1][index2] == 0) {
								checkList[index1][index2] = 1;
								seatList[index1][index2] = idList[index];
								for(int i = 0; i < seatList.length; i++) {
									for(int j = 0; j < seatList[i].length; j++) {
										if(checkList[i][j] == 0) {
											System.out.print("[ ]");
										}else {
											System.out.print("[X]");
										}
									}
									System.out.println();
								}
								System.out.println("예매 완료.");
							}else {
								System.out.println("이미 예매가 완료된 자리입니다.");
							}
						}else if(sel2 == 3) {
							System.out.println(idList[index] + "님의 예매 좌석을 확인합니다.");
							for(int i = 0; i < seatList.length; i++) {
								for(int j = 0; j < seatList[i].length; j++) {
									if(seatList[i][j] == idList[index]) {
										System.out.println(seatList2[i][j] + "번석" + " ");
									}
								}
							}
						}else if(sel2 == 4) {
							System.out.println(idList[index] + "님의 예매 좌석을 확인합니다.");
							for(int i = 0; i < seatList.length; i++) {
								for(int j = 0; j < seatList[i].length; j++) {
									if(seatList[i][j] == idList[index]) {
										System.out.println(seatList2[i][j] + "번석" + " ");
									}
								}
							}
							System.out.println("취소하실 좌석 번호를 입력해주세요.");
							int sel3 = scan.nextInt();
							boolean check1 = false;
							int index1 = -1;
							int index2 = -1;
							for(int i = 0; i < seatList.length; i++) {
								for(int j = 0; j < seatList[i].length; j++) {
									if(seatList2[i][j] == sel3 && idList[index] == seatList[i][j]) {
										check1 = true;
										index1 = i;
										index2 = j;
										break;
									}
								}
							}
							if(check1 == true) {
								checkList[index1][index2] = 0;
								seatList[index1][index2] = sel3;
								System.out.println("취소완료.");
							}else {
								System.out.println(idList[index] + "님이 예매하신 좌석이 아닙니다.");
							}
						}else if(sel2 == 0) {
							System.out.println("뒤로가기");
							break;
						}
					}
				}else {
					System.out.println("아이디를 확인해주세요.");
				}
			}else if(sel == 0) {
				System.out.println("종료");
				break;
			}
		}
		
	}

}