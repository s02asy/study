package O0_클래스배열;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

/*
class Student{
	int number;
	String name;
}

class Subject{
	int studentNumber;
	String subject;
	int score;
	int rank;
}
*/
public class O0_14_클래스배열과목2 {
	public static void main(String[] args) {
		Random ran = new Random();
		Scanner scan = new Scanner(System.in);
		//컨트롤러 만들기 (학생마다 듣는 과목수를 다르게 만들고싶다)	
		// 1) 학생추가 2) 학생삭제 3) 과목 추가 4) 과목삭제 5) 전체 출력 
		// 학생 최대 100명  , 과목은 최대 100개 
		//[조건] 학생삭제시 ==> 학생이 추가했던 과목 전부 삭제 
		//[조건] 학생추가시 ==> 학생번호는 3000번부터 자동으로 1증가 
		//[조건] 과목 추가시 ==> 점수는 1~100사이 랜덤값저장
		//[조건] 전체  출력 ==> 학생이름별  듣는과목 + 점수 와 등수 출력
		Student a[] = new Student[100];
		Subject b[] = new Subject[100];
		for(int i = 0; i < a.length; i++) {
			a[i] = new Student();
			b[i] = new Subject();
		}
		int aid = 0;
		int bid = 0;
		int studentnum = 3000;
		String ch = "0123456789";
		while(true) {
			System.out.println("1) 학생추가 2) 학생삭제 3) 과목 추가 4) 과목삭제 5) 전체 출력");
			int sel = scan.nextInt();
			if(sel == 1) {
				System.out.println("1) 학생추가");
				System.out.println("이름 입력 : ");
				String name = scan.next();;
				boolean check = false;
				for(int i = 0; i < name.length(); i++) {
					for(int j = 0; j < ch.length(); j++) {
						if(name.charAt(i) == ch.charAt(j)) {
							check = true;
							break;
						}
					}
					if(check == true) {
						break;
					}
				}
				if(check == false) {
					a[aid].name = name;
					a[aid].number = studentnum;
					System.out.println("학번 : " + studentnum);
					studentnum += 1;
					aid += 1;
				}else {
					System.out.println("글자만 입력해주세요.");
				}
			}else if(sel == 2) {
				if(aid > 0) {
					int id = 0;
					System.out.println("2) 학생삭제");
					System.out.println("학번 입력 : ");
					String hakbun = scan.next();
					int cnt = 0;
					for(int i = 0; i < hakbun.length(); i++) {
						for(int j = 0; j < ch.length(); j++) {
							if(hakbun.charAt(i) == ch.charAt(j)) {
								cnt += 1;
							}
						}
					}
					if(cnt == hakbun.length()) {
						boolean check = false;
						for(int i = 0; i < a.length; i++) {
							if(a[i].number == Integer.parseInt(hakbun)) {
								id = i;
								check = true;
								break;
							}
						}if(check == true) {
							for(int i = id; i < aid - 1; i++) {
								a[i].name = a[i + 1].name;
								a[i].number = a[i + 1].number;
							}
							aid -= 1;
							a[aid].name = null;
							a[aid].number = 0;
							for(int i = 0; i < bid; i++) {
								if(b[i].studentNumber == Integer.parseInt(hakbun)) {
									b[i].studentNumber = 0;
									b[i].subject = null;
									b[i].score = 0;
								}
							}
							cnt = 0;
							for(int i = 0; i < bid; i++) {
								if(b[i].studentNumber != 0) {
									b[cnt].studentNumber = b[i].studentNumber;
									b[cnt].subject = b[i].subject;
									b[cnt].score = b[i].score;
									cnt += 1;
								}
							}
							bid = cnt;
							System.out.println("삭제성공.");
						}else {
							System.out.println("입력하신 학번이 없습니다.");
						}
					}
				}else if(aid == 0) {
					System.out.println("학생추가 후 이용바랍니다.");
				}
			}else if(sel == 3) {
				if(aid > 0) {
					System.out.println("3) 과목추가");
					System.out.println("학번 입력 : ");
					String hakbun = scan.next();
					int cnt = 0;
					for(int i = 0; i < hakbun.length(); i++) {
						for(int j = 0; j < ch.length(); j++) {
							if(hakbun.charAt(i) == ch.charAt(j)) {
								cnt += 1;
							}
						}
					}
					if(cnt == hakbun.length()) {
						boolean check = false;
						int id = 0;
						for(int i = 0; i < aid; i++) {
							if(a[i].number == Integer.parseInt(hakbun)) {
								check = true;
								id = i;
								break;
							}
						}
						if(check == true) {
							System.out.println(a[id].number + "번 " + a[id].name + "님");
							System.out.println("추가하실 과목을 입력해주세요.");
							String subject = scan.next();
							boolean check2 = false;
							for(int i = 0; i < bid; i++) {
								if(b[i].subject.equals(subject) && b[i].studentNumber == Integer.parseInt(hakbun)) {
									check2 = true;
									break;
								}
							}
							if(check2 == false) {
								b[bid].subject = subject;
								b[bid].studentNumber = Integer.parseInt(hakbun);
								b[bid].score = ran.nextInt(100) + 1;
								bid += 1;
								System.out.println("과목추가 성공.");
							}else {
								System.out.println("이미 있는 과목입니다.");
							}
						}else {
							System.out.println("입력하신 학번이 없습니다.");
						}
					}else {
						System.out.println("숫자만 입력해주세요.");
					}
				}else if(aid == 0) {
					System.out.println("학생추가 후 이용바랍니다.");
				}
			}else if(sel == 4) {
				if(bid > 0) {
					System.out.println("3) 과목삭제");
					System.out.println("학번 입력 : ");
					String hakbun = scan.next();
					int cnt = 0;
					for(int i = 0; i < hakbun.length(); i++) {
						for(int j = 0; j < ch.length(); j++) {
							if(hakbun.charAt(i) == ch.charAt(j)) {
								cnt += 1;
							}
						}
					}
					if(cnt == hakbun.length()) {
						System.out.println("과목 입력 : ");
						String subject = scan.next();
						boolean check = false;
						int id = 0;
						for(int i = 0; i < bid; i++) {
							if(b[i].subject.equals(subject) && b[i].studentNumber == Integer.parseInt(hakbun)) {
								check = true;
								id = i;
								break;
							}
						}
						if(check == true) {
							b[id].studentNumber = 0;
							b[id].score = 0;
							b[id].subject = null;
							cnt = 0;
							for(int i = 0; i < bid; i++) {
								if(b[i].studentNumber != 0) {
									b[cnt].score = b[i].score;
									b[cnt].subject = b[i].subject;
									b[cnt].studentNumber = b[i].studentNumber;
									cnt += 1;
								}
							}
							bid = cnt;
							System.out.println("삭제성공.");
						}else {
							System.out.println("학번이 잘못됐거나 없는 과목입니다.");
						}
					}else {
						System.out.println("숫자만 입력해주세요.");
					}
				}else if(bid == 0) {
					System.out.println("과목추가 후 이용바랍니다.");
				}
			}else if(sel == 5) {
				for(int i = 0; i < bid; i++) {
					int cnt = 1;
					for(int j = 0; j < bid; j++) {
						if(i == j) {
							continue;
						}
						if(b[i].subject.equals(b[j].subject) && b[i].score < b[j].score) {
							cnt += 1;
						}
					}
					b[i].rank = cnt;
				}
				for(int i = 0; i < aid; i++) {
					System.out.print(a[i].number + "번 ");
					System.out.print(a[i].name + "님 ");
					for(int j = 0; j < bid; j++) {
						if(a[i].number == b[j].studentNumber) {
							System.out.print(b[j].subject + " " + b[j].score + "점 " + b[j].rank + "등 ");
						}
					}
					System.out.println();
				}
				
			}
		}
	}
}
