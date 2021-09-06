package F9_Mini_Project1;

import java.util.Random;
import java.util.Scanner;

public class F9_rpg던전탐험 {
	/*
	 * [던전탐험게임]
	 * 플레이어는 "무기" "방어구" "체력" "돈" "운" 등의 데이터가 있다. (추가 가능)
	 * 플레이어와 적은 각각 1명으로 하고 1명이상은 추후 배열에서 가능하다.
	 * 
	 * 1) 메인메뉴 ==> [마을] [1.여관] [2.대장간] [3.던전]
	 * 
	 * 2) [1.여관] 은 체력을 회복한다. [1.휴식][0.뒤로가기]
	 * 3) [2.대장간] 은 랜덤으로 무기와 방어구 업그레이드 시켜준다. [1.무기업][2.방어구업][0.뒤로가기]
	 * 4) [3.던전] 은 몬스터를 만난다. ==> [1.공격][2.스킬][0.뒤로가기]
	 */
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Random ran = new Random();
		int 무기 = 6;
		int 방어구 = 10;
		int 체력 = 30;
		int Money = 10000;
		int skill = 50;
		boolean run = true;
		while(run) {
			System.out.println("==마   을==");
			System.out.println("1.여      관");
			System.out.println("2.대  장  간");
			System.out.println("3.던      전");
			System.out.println("0.종      료");
			System.out.println("메뉴를 선택하세요.");
			int select = scan.nextInt();
			if(select == 1) {
				if(Money < 600) {
					System.out.println("돈이 부족합니다.");
					System.out.println("현재 돈 : " + Money);
					continue;
				}
				boolean run2 = true;
				while(run2) {
					System.out.println("==초!!특가 야놀자==");
					System.out.println(" 이용금액 : 600원 ");
					System.out.println("1.휴     식");
					System.out.println("0.뒤로가기");
					int select2 = scan.nextInt();
					if(select2 == 1) {
						System.out.println("체력을 6 회복합니다.");
						System.out.println("현재 체력 : " + 체력);
						체력 = 체력 + 6;
						System.out.println("회복된 체력 : " + 체력);
						System.out.println("현재 돈 : " + Money);
						Money -= 600;
						System.out.println("정산후 남은 돈 : " + Money);
						if(Money < 600) {
							System.out.println("돈이 부족합니다. 강제 퇴실");
							run2 = false;
						}
					}
					else if(select2 == 0) {
						System.out.println("뒤로가기");
						run2 = false;
					}
					else {
						System.out.println("메뉴를 다시 선택해주세요.");
					}
				}
			}
			else if(select == 2) {
				if(Money < 200) {
					System.out.println("돈이 부족합니다.");
					continue;
				}
				boolean run3 = true;
				while(run3) {
					System.out.println("==  대  장  간  ==");
					System.out.println("1.무   기   업");
					System.out.println("2.방 어 구 업");
					System.out.println("0.뒤 로 가 기");
					int select2 = scan.nextInt();
					if(select2 == 1) {
						int 강화 = ran.nextInt(2) + 1;
						System.out.println("무기를 50% 확률로 강화합니다.성공(공격력 + 6) 실패(공격력 - 2");
						System.out.println("무기 강화 비용 : 200원");
						if(강화 == 1) {
							System.out.println("현재 무기 공격력 : " + 무기);
							System.out.println("무기가 한순간 파랗게 빛나더니 강화에 성공했습니다.");
							무기 += 6;
							System.out.println("강화후 무기 공격력 :" + 무기);
							System.out.println("현재 돈 : " + Money);
							Money -= 200;
							System.out.println("강화후 남은 돈 : " + Money);
							if(Money < 200) {
								System.out.println("돈이 부족합니다. 강화 불가");
								run3 = false;
							}
						}
						else {
							System.out.println("현재 무기 공격력 : " + 무기);
							System.out.println("무기가 한순간 파랗게 빛나더니 강화에 실패했습니다.");
							무기 -= 2;
							System.out.println("강화후 무기 공격력 :" + 무기);
							System.out.println("현재 돈 : " + Money);
							Money -= 200;
							System.out.println("강화후 남은 돈 : " + Money);
							if(Money < 200) {
								System.out.println("돈이 부족합니다. 강화 불가");
								run3 = false;
							}
							if(무기 <= 0) {
								System.out.println("무기가 파괴 되었습니다.");
								무기 = 0;
								System.out.println("무기 공격력 : " + 무기);
							}
						}
					}
					else if(select2 == 2) {
						int 강화 = ran.nextInt(2) + 1;
						System.out.println("방어구를 50% 확률로 강화합니다.성공(방어력 + 6) 실패(방어력 - 2");
						System.out.println("방어구 강화 비용 : 200원");
						if(강화 == 1) {
							System.out.println("현재 방어구 방어력 : " + 방어구);
							System.out.println("방어구가 한순간 빨갛게 빛나더니 강화에 성공했습니다.");
							방어구 += 6;
							System.out.println("강화후 방어구 방어력 :" + 방어구);
							System.out.println("현재 돈 : " + Money);
							Money -= 200;
							System.out.println("강화후 남은 돈 : " + Money);
							if(Money < 200) {
								System.out.println("돈이 부족합니다. 강화 불가");
								run3 = false;
							}
						}
						else {
							System.out.println("현재 방어구 방어력 : " + 방어구);
							System.out.println("방어구가 한순간 빨갛게 빛나더니 강화에 실패했습니다.");
							방어구 -= 2;
							System.out.println("강화후 방어구 방어력 :" + 방어구);
							System.out.println("현재 돈 : " + Money);
							Money -= 200;
							System.out.println("강화후 남은 돈 : " + Money);
							if(Money < 200) {
								System.out.println("돈이 부족합니다. 강화 불가");
								run3 = false;
							}
							if(방어구 <= 0) {
								System.out.println("방어구가 파괴 되었습니다.");
								방어구 = 0;
								System.out.println("방어구 방어력 : " + 방어구);
							}
						}
					}
					else if(select2 == 0) {
						System.out.println("뒤로가기");
						run3 = false;
					}
					else {
						System.out.println("메뉴를 다시 선택해주세요.");
					}
				}
			}
			else if(select == 3) {
				if(체력 <= 0) {
					System.out.println("체력이 부족합니다. 여관에서 체력을 회복하세요.");
					System.out.println("현재 체력 : " + 체력);
					continue;
				}
				System.out.println("몬스터가 2마리 생성 되었습니다.");
				System.out.println("크하하하 !! 네가 나를 이길수 있을거라 생각하냐 !!");
				int 몬스터1 = 80;
				int 몬스터공격 = 3;
				int 몬스터2 = 80;
				boolean run4 = true;
				while(run4) {
					System.out.println("1.공        격");
					System.out.println("2.스        킬");
					System.out.println("0.뒤 로 가 기");
					int 선택 = scan.nextInt();
					if(선택 == 1) {
						System.out.println("몬스터를 공격 합니다.");
						System.out.println("몬스터1 체력 - " + 무기);
						몬스터1 -= 무기;
						System.out.println("몬스터1 남은 체력 : " + 몬스터1);
						System.out.println("몬스터2 체력 - " + 무기);
						몬스터2 -= 무기;
						System.out.println("몬스터2 남은 체력 : " + 몬스터2);
						System.out.println("몬스터1,2가 공격 해옵니다.");
						System.out.println("50% 확률로 방어구 내구도가 체력 대신 감소합니다.");
						int 방어 = ran.nextInt(2) + 1;
						if(방어 == 1) {
							방어구 -= 몬스터공격*2;
							System.out.println("방어 하였습니다. 방어구 : " + 방어구);
							if(방어구 <= 0) {
								System.out.println("방어구가 파괴 되었습니다.");
								방어구 = 0;
								System.out.println("방어구 : " + 방어구);
							}
						}
						if(방어 == 2) {
							체력 -= 몬스터공격*2;
							System.out.println("체력이 감소 하였습니다. 체력 : " + 체력);
							if(체력 <= 0) {
								System.out.println("사망 하였습니다. 여관으로 가세요.");
								체력 = 0;
								System.out.println("현재체력 : " + 체력);
								run4 = false;
							}
						}
						if(몬스터1 <= 0) {
							몬스터1 = 0;
							System.out.println("몬스터 1 남은 체력 : " + 몬스터1);
							몬스터2 = 0;
							System.out.println("몬스터 1 남은 체력 : " + 몬스터1);
							System.out.println("몬스터를 해치웠습니다. (전리품 20,000원)");
							Money += 20000;
							System.out.println("현재 돈 : " + Money);
							System.out.println("던전을 떠납니다.");
							run4 = false;
						}
					}
					else if(선택 == 2) {
						System.out.println("스킬을 사용 합니다.");
						System.out.println("헬파이어 ~!!!!~~");
						System.out.println("몬스터1 체력 - " + skill);
						몬스터1 -= skill;
						System.out.println("몬스터1 남은 체력 : " + 몬스터1);
						System.out.println("몬스터2 체력 - " + skill);
						몬스터2 -= skill;
						System.out.println("몬스터2 남은 체력 : " + 몬스터2);
						System.out.println("몬스터1,2가 공격 해옵니다.");
						System.out.println("50% 확률로 방어구 내구도가 체력 대신 감소합니다.");
						int 방어 = ran.nextInt(2) + 1;
						if(방어 == 1) {
							if(방어구 <= 0) {
								System.out.println("방어구가 파괴 되었습니다.");
								방어구 = 0;
								System.out.println("방어구 : " + 방어구);
							}
							방어구 -= 몬스터공격*2;
							System.out.println("방어 하였습니다. 방어구 : " + 방어구);
						}
						if(방어 == 2) {
							if(체력 <= 0) {
								System.out.println("사망 하였습니다. 여관으로 가세요.");
								체력 = 0;
								System.out.println("현재체력 : " + 체력);
								run4 = false;
							}
							체력 -= 몬스터공격*2;
							System.out.println("체력이 감소 하였습니다. 체력 : " + 체력);
						}
						if(몬스터1 <= 0) {
							몬스터1 = 0;
							System.out.println("몬스터 1 남은 체력 : " + 몬스터1);
							몬스터2 = 0;
							System.out.println("몬스터 1 남은 체력 : " + 몬스터1);
							System.out.println("몬스터를 해치웠습니다. (전리품 20,000원)");
							Money += 20000;
							System.out.println("현재 돈 : " + Money);
							System.out.println("던전을 떠납니다.");
							run4 = false;
						}
					}
					else if(선택 == 0) {
						System.out.println("뒤로가기");
						run4 = false;
					}
					else {
						System.out.println("메뉴를 다시 선택해주세요.");
					}
				}
			}
			else if(select == 0) {
				System.out.println("게임을 종료합니다.");
				run = false;
			}
			else {
				System.out.println("메뉴를 다시 선택해주세요.");
			}
			
		}
		
	}
}