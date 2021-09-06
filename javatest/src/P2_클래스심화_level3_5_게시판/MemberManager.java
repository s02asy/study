package P2_클래스심화_level3_5_게시판;

import java.util.Random;
import java.util.Scanner;

public class MemberManager {
	String memberlog = "";
	Scanner scan = new Scanner(System.in);
	Random ran = new Random();
	MemberDAO DAO;
	
	void init(MemberDAO DAO) {
		this.DAO = DAO;
	}
	
	void join() {
		System.out.println("[회원가입]아이디를 입력하세요.");
		String id = scan.next();
		boolean result = DAO.checkid(id);
		if(result == true) {
			System.out.println("이미 사용중인 아이디입니다.");
		}else {
			System.out.println("[회원가입]비밀번호를 입력하세요.");
			String pw = scan.next();
			Member member = new Member();
			member.id = id;
			member.pw = pw;
			DAO.insertmember(member);
			System.out.println("[회원가입]성함을 입력하세요.");
			String name = scan.next();
			DAO.setname(name);
			System.out.println("[회원가입]핸드폰번호를 입력하세요.");
			String phone = scan.next();
			DAO.phonenum(phone);
			System.out.println("[회원가입]이메일을 입력하세요.");
			String email = scan.next();
			DAO.setemail(email);
			DAO.sethint();
			System.out.println("[회원가입]비밀번호 복구 힌트 정답을 입력해주세요.");
			String answer = scan.next();
			DAO.answerhint(answer);
		}
	}
	
	void del() {
		System.out.println("[회원탈퇴]아이디를 입력하세요.");
		String id = scan.next();
		System.out.println("[회원탈퇴]비밀번호를 입력하세요.");
		String pw = scan.next();
		boolean result = DAO.checkidandpw(id, pw);
		if(result == true) {
			System.out.println("정말 탈퇴 하시겠습니까? (yes , no)");
			String answer = scan.next();
			if(answer.equals("yes")) {
				DAO.delid(id);
			}else if(answer.equals("no")) {
				return;
			}
		}else {
			System.out.println("없는 아이디 이거나 비밀번호가 틀립니다.");
		}
	}
	
	void change() {
		System.out.println("[회원정보수정]아이디를 입력하세요.");
		String id = scan.next();
		System.out.println("[회원정보수정]비밀번호를 입력하세요.");
		String pw = scan.next();
		boolean result = DAO.checkidandpw(id, pw);
		if(result == true) {
			DAO.checkid(id);
			int index = DAO.index;
			System.out.println("[1]비밀번호수정 [2]이메일수정 [3]전화번호수정");
			int sel = scan.nextInt();
			if(sel == 1) {
				System.out.println("수정할 비밀번호 입력.");
				String pw1 = scan.next();
				System.out.println("비밀번호 재입력.");
				String pw2 = scan.next();
				if(pw1.equals(pw2)) {
					DAO.memberlist[index].pw = pw;
					System.out.println("성공!!");
				}else {
					System.out.println("변경하려는 비밀번호가 서로 다릅니다.");
				}
			}else if(sel == 2) {
				System.out.println("수정할 이메일을 입력해주세요.");
				String email = scan.next();
				DAO.memberlist[index].email = email;
			}else if(sel == 3) {
				System.out.println("수정할 전화번호를 입력해주세요.");
				String num = scan.next();
				DAO.memberlist[index].phonenum = num;
			}
		}else {
			System.out.println("없는 아이디 이거나 비밀번호가 틀립니다.");
		}
	}
	
	void login() {
		System.out.println("[로그인]아이디를 입력하세요.");
		String id = scan.next();
		boolean result = DAO.checkid(id);
		if(result == true) {
			int index = DAO.index;
			if(DAO.memberlist[index].cnt == 5) {
				System.out.println(id + "님 비밀번호 5회 틀리셨으므로 비밀번호 찾기를 해주세요.");
				return;
			}
			System.out.println("[로그인]비밀번호를 입력하세요.");
			String pw = scan.next();
			boolean result2 = DAO.checkidandpw(id, pw);
			if(result2 == true) {
				memberlog = id;
				DAO.memberlist[index].cnt = 0;
				System.out.println(memberlog + "님 환영합니다.");
			}else {
				DAO.memberlist[index].cnt += 1;
				System.out.println("로그인 시도 남은 횟수." + "[" + DAO.memberlist[index].cnt + "/5]");
			}
		}else {
			System.out.println("없는 아이디 입니다.");
		}
	}
	
	void findpw() {
			System.out.println("[비밀번호 찾기]아이디를 입력하세요.");
			String id = scan.next();
			boolean result = DAO.checkid(id);
			if(result == true) {
				int index = DAO.index;
				System.out.println("[1]질문과답 [2]휴대폰인증 [0]종료");
				int sel = scan.nextInt();
				if(sel == 1) {
					if(DAO.memberlist[index].cnt2 == 5) {
						System.out.println("다른 인증방법을 선택하시거나 관리자에게 문의해주세요.");
						System.out.println("문의 번호 : 1544 - 7777");
						return;
					}
					DAO.hintlist();
					if(DAO.checkhint() == true) {
						System.out.println("답을 입력해주세요.");
						String answer = scan.next();
						boolean result2 = DAO.checkhint2(answer);
						if(result2 == true) {
							while(true) {
								System.out.println("변경하실 비밀번호를 입력해주세요.");
								String pw2 = scan.next();
								System.out.println("비밀번호 재확인");
								String pw3 = scan.next();
								if(pw2.equals(pw3)) {
									DAO.pwchange(pw2);
									System.out.println("비밀번호를 변경하였습니다.");
									break;
								}else {
									System.out.println("비밀번호를 다시 입력해주세요.");
								}
							}
						}else {
							DAO.memberlist[index].cnt2 += 1;
							System.out.println("답이 틀렸습니다. [기회 " + DAO.memberlist[index].cnt2 + "/5]");
						}
					}else {
						System.out.println("회원가입시 선택한 질문이 아닙니다.");
					}
				}else if(sel == 2) {
					if(DAO.memberlist[index].cnt3 == 5) {
						System.out.println("다른 인증방법을 선택하시거나 관리자에게 문의해주세요.");
						System.out.println("문의 번호 : 1544 - 7777");
						return;
					}
					System.out.println("회원가입시 입력한 핸드폰번호를 입력하세요.");
					String num = scan.next();
					System.out.println("성함을 입력하세요.");
					String name = scan.next();
					boolean result2 = DAO.checkphonenumandname(num , name);
					if(result2 == true) {
						System.out.println(num + "으로 인증번호를 보냈습니다.");
						int code = DAO.code();
						while(true) {
							System.out.println("[1]인증번호 확인 [2]인증번호 입력 [0]종료");
							int sel2 = scan.nextInt();
							if(sel2 == 1) {
								System.out.println("인증번호 : " + code);
							}else if(sel2 == 2) {
								System.out.println("인증번호를 입력해주세요.");
								int code2 = scan.nextInt();
								if(code == code2) {
									while(true) {
										System.out.println("변경하실 비밀번호를 입력해주세요.");
										String pw2 = scan.next();
										System.out.println("비밀번호 재확인");
										String pw3 = scan.next();
										if(pw2.equals(pw3)) {
											DAO.pwchange(pw2);
											System.out.println("비밀번호를 변경하였습니다.");
											return;
										}else {
											System.out.println("비밀번호를 다시 입력해주세요.");
										}
									}
								}else {
									DAO.memberlist[index].cnt3 += 1;
									System.out.println("인증번호를 틀렸습니다. [기회 " + DAO.memberlist[index].cnt3 + "/5]");
									if(DAO.memberlist[index].cnt3 == 5) {
										System.out.println("다른 인증방법을 선택하시거나 관리자에게 문의해주세요.");
										System.out.println("문의 번호 : 1544 - 7777");
										return;
									}
								}
							}
							else if(sel2 == 0) {
								return;
							}
						}
					}else {
						System.out.println("전화번호가 틀리거나 성함이 틀렸습니다.");
					}
				}
		}else {
			System.out.println("없는 아이디 입니다.");
		}
	}
}
