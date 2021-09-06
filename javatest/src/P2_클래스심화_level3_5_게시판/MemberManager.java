package P2_Ŭ������ȭ_level3_5_�Խ���;

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
		System.out.println("[ȸ������]���̵� �Է��ϼ���.");
		String id = scan.next();
		boolean result = DAO.checkid(id);
		if(result == true) {
			System.out.println("�̹� ������� ���̵��Դϴ�.");
		}else {
			System.out.println("[ȸ������]��й�ȣ�� �Է��ϼ���.");
			String pw = scan.next();
			Member member = new Member();
			member.id = id;
			member.pw = pw;
			DAO.insertmember(member);
			System.out.println("[ȸ������]������ �Է��ϼ���.");
			String name = scan.next();
			DAO.setname(name);
			System.out.println("[ȸ������]�ڵ�����ȣ�� �Է��ϼ���.");
			String phone = scan.next();
			DAO.phonenum(phone);
			System.out.println("[ȸ������]�̸����� �Է��ϼ���.");
			String email = scan.next();
			DAO.setemail(email);
			DAO.sethint();
			System.out.println("[ȸ������]��й�ȣ ���� ��Ʈ ������ �Է����ּ���.");
			String answer = scan.next();
			DAO.answerhint(answer);
		}
	}
	
	void del() {
		System.out.println("[ȸ��Ż��]���̵� �Է��ϼ���.");
		String id = scan.next();
		System.out.println("[ȸ��Ż��]��й�ȣ�� �Է��ϼ���.");
		String pw = scan.next();
		boolean result = DAO.checkidandpw(id, pw);
		if(result == true) {
			System.out.println("���� Ż�� �Ͻðڽ��ϱ�? (yes , no)");
			String answer = scan.next();
			if(answer.equals("yes")) {
				DAO.delid(id);
			}else if(answer.equals("no")) {
				return;
			}
		}else {
			System.out.println("���� ���̵� �̰ų� ��й�ȣ�� Ʋ���ϴ�.");
		}
	}
	
	void change() {
		System.out.println("[ȸ����������]���̵� �Է��ϼ���.");
		String id = scan.next();
		System.out.println("[ȸ����������]��й�ȣ�� �Է��ϼ���.");
		String pw = scan.next();
		boolean result = DAO.checkidandpw(id, pw);
		if(result == true) {
			DAO.checkid(id);
			int index = DAO.index;
			System.out.println("[1]��й�ȣ���� [2]�̸��ϼ��� [3]��ȭ��ȣ����");
			int sel = scan.nextInt();
			if(sel == 1) {
				System.out.println("������ ��й�ȣ �Է�.");
				String pw1 = scan.next();
				System.out.println("��й�ȣ ���Է�.");
				String pw2 = scan.next();
				if(pw1.equals(pw2)) {
					DAO.memberlist[index].pw = pw;
					System.out.println("����!!");
				}else {
					System.out.println("�����Ϸ��� ��й�ȣ�� ���� �ٸ��ϴ�.");
				}
			}else if(sel == 2) {
				System.out.println("������ �̸����� �Է����ּ���.");
				String email = scan.next();
				DAO.memberlist[index].email = email;
			}else if(sel == 3) {
				System.out.println("������ ��ȭ��ȣ�� �Է����ּ���.");
				String num = scan.next();
				DAO.memberlist[index].phonenum = num;
			}
		}else {
			System.out.println("���� ���̵� �̰ų� ��й�ȣ�� Ʋ���ϴ�.");
		}
	}
	
	void login() {
		System.out.println("[�α���]���̵� �Է��ϼ���.");
		String id = scan.next();
		boolean result = DAO.checkid(id);
		if(result == true) {
			int index = DAO.index;
			if(DAO.memberlist[index].cnt == 5) {
				System.out.println(id + "�� ��й�ȣ 5ȸ Ʋ�������Ƿ� ��й�ȣ ã�⸦ ���ּ���.");
				return;
			}
			System.out.println("[�α���]��й�ȣ�� �Է��ϼ���.");
			String pw = scan.next();
			boolean result2 = DAO.checkidandpw(id, pw);
			if(result2 == true) {
				memberlog = id;
				DAO.memberlist[index].cnt = 0;
				System.out.println(memberlog + "�� ȯ���մϴ�.");
			}else {
				DAO.memberlist[index].cnt += 1;
				System.out.println("�α��� �õ� ���� Ƚ��." + "[" + DAO.memberlist[index].cnt + "/5]");
			}
		}else {
			System.out.println("���� ���̵� �Դϴ�.");
		}
	}
	
	void findpw() {
			System.out.println("[��й�ȣ ã��]���̵� �Է��ϼ���.");
			String id = scan.next();
			boolean result = DAO.checkid(id);
			if(result == true) {
				int index = DAO.index;
				System.out.println("[1]�������� [2]�޴������� [0]����");
				int sel = scan.nextInt();
				if(sel == 1) {
					if(DAO.memberlist[index].cnt2 == 5) {
						System.out.println("�ٸ� ��������� �����Ͻðų� �����ڿ��� �������ּ���.");
						System.out.println("���� ��ȣ : 1544 - 7777");
						return;
					}
					DAO.hintlist();
					if(DAO.checkhint() == true) {
						System.out.println("���� �Է����ּ���.");
						String answer = scan.next();
						boolean result2 = DAO.checkhint2(answer);
						if(result2 == true) {
							while(true) {
								System.out.println("�����Ͻ� ��й�ȣ�� �Է����ּ���.");
								String pw2 = scan.next();
								System.out.println("��й�ȣ ��Ȯ��");
								String pw3 = scan.next();
								if(pw2.equals(pw3)) {
									DAO.pwchange(pw2);
									System.out.println("��й�ȣ�� �����Ͽ����ϴ�.");
									break;
								}else {
									System.out.println("��й�ȣ�� �ٽ� �Է����ּ���.");
								}
							}
						}else {
							DAO.memberlist[index].cnt2 += 1;
							System.out.println("���� Ʋ�Ƚ��ϴ�. [��ȸ " + DAO.memberlist[index].cnt2 + "/5]");
						}
					}else {
						System.out.println("ȸ�����Խ� ������ ������ �ƴմϴ�.");
					}
				}else if(sel == 2) {
					if(DAO.memberlist[index].cnt3 == 5) {
						System.out.println("�ٸ� ��������� �����Ͻðų� �����ڿ��� �������ּ���.");
						System.out.println("���� ��ȣ : 1544 - 7777");
						return;
					}
					System.out.println("ȸ�����Խ� �Է��� �ڵ�����ȣ�� �Է��ϼ���.");
					String num = scan.next();
					System.out.println("������ �Է��ϼ���.");
					String name = scan.next();
					boolean result2 = DAO.checkphonenumandname(num , name);
					if(result2 == true) {
						System.out.println(num + "���� ������ȣ�� ���½��ϴ�.");
						int code = DAO.code();
						while(true) {
							System.out.println("[1]������ȣ Ȯ�� [2]������ȣ �Է� [0]����");
							int sel2 = scan.nextInt();
							if(sel2 == 1) {
								System.out.println("������ȣ : " + code);
							}else if(sel2 == 2) {
								System.out.println("������ȣ�� �Է����ּ���.");
								int code2 = scan.nextInt();
								if(code == code2) {
									while(true) {
										System.out.println("�����Ͻ� ��й�ȣ�� �Է����ּ���.");
										String pw2 = scan.next();
										System.out.println("��й�ȣ ��Ȯ��");
										String pw3 = scan.next();
										if(pw2.equals(pw3)) {
											DAO.pwchange(pw2);
											System.out.println("��й�ȣ�� �����Ͽ����ϴ�.");
											return;
										}else {
											System.out.println("��й�ȣ�� �ٽ� �Է����ּ���.");
										}
									}
								}else {
									DAO.memberlist[index].cnt3 += 1;
									System.out.println("������ȣ�� Ʋ�Ƚ��ϴ�. [��ȸ " + DAO.memberlist[index].cnt3 + "/5]");
									if(DAO.memberlist[index].cnt3 == 5) {
										System.out.println("�ٸ� ��������� �����Ͻðų� �����ڿ��� �������ּ���.");
										System.out.println("���� ��ȣ : 1544 - 7777");
										return;
									}
								}
							}
							else if(sel2 == 0) {
								return;
							}
						}
					}else {
						System.out.println("��ȭ��ȣ�� Ʋ���ų� ������ Ʋ�Ƚ��ϴ�.");
					}
				}
		}else {
			System.out.println("���� ���̵� �Դϴ�.");
		}
	}
}
