package O0_Ŭ�����迭;

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
public class O0_14_Ŭ�����迭����2 {
	public static void main(String[] args) {
		Random ran = new Random();
		Scanner scan = new Scanner(System.in);
		//��Ʈ�ѷ� ����� (�л����� ��� ������� �ٸ��� �����ʹ�)	
		// 1) �л��߰� 2) �л����� 3) ���� �߰� 4) ������� 5) ��ü ��� 
		// �л� �ִ� 100��  , ������ �ִ� 100�� 
		//[����] �л������� ==> �л��� �߰��ߴ� ���� ���� ���� 
		//[����] �л��߰��� ==> �л���ȣ�� 3000������ �ڵ����� 1���� 
		//[����] ���� �߰��� ==> ������ 1~100���� ����������
		//[����] ��ü  ��� ==> �л��̸���  ��°��� + ���� �� ��� ���
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
			System.out.println("1) �л��߰� 2) �л����� 3) ���� �߰� 4) ������� 5) ��ü ���");
			int sel = scan.nextInt();
			if(sel == 1) {
				System.out.println("1) �л��߰�");
				System.out.println("�̸� �Է� : ");
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
					System.out.println("�й� : " + studentnum);
					studentnum += 1;
					aid += 1;
				}else {
					System.out.println("���ڸ� �Է����ּ���.");
				}
			}else if(sel == 2) {
				if(aid > 0) {
					int id = 0;
					System.out.println("2) �л�����");
					System.out.println("�й� �Է� : ");
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
							System.out.println("��������.");
						}else {
							System.out.println("�Է��Ͻ� �й��� �����ϴ�.");
						}
					}
				}else if(aid == 0) {
					System.out.println("�л��߰� �� �̿�ٶ��ϴ�.");
				}
			}else if(sel == 3) {
				if(aid > 0) {
					System.out.println("3) �����߰�");
					System.out.println("�й� �Է� : ");
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
							System.out.println(a[id].number + "�� " + a[id].name + "��");
							System.out.println("�߰��Ͻ� ������ �Է����ּ���.");
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
								System.out.println("�����߰� ����.");
							}else {
								System.out.println("�̹� �ִ� �����Դϴ�.");
							}
						}else {
							System.out.println("�Է��Ͻ� �й��� �����ϴ�.");
						}
					}else {
						System.out.println("���ڸ� �Է����ּ���.");
					}
				}else if(aid == 0) {
					System.out.println("�л��߰� �� �̿�ٶ��ϴ�.");
				}
			}else if(sel == 4) {
				if(bid > 0) {
					System.out.println("3) �������");
					System.out.println("�й� �Է� : ");
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
						System.out.println("���� �Է� : ");
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
							System.out.println("��������.");
						}else {
							System.out.println("�й��� �߸��ưų� ���� �����Դϴ�.");
						}
					}else {
						System.out.println("���ڸ� �Է����ּ���.");
					}
				}else if(bid == 0) {
					System.out.println("�����߰� �� �̿�ٶ��ϴ�.");
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
					System.out.print(a[i].number + "�� ");
					System.out.print(a[i].name + "�� ");
					for(int j = 0; j < bid; j++) {
						if(a[i].number == b[j].studentNumber) {
							System.out.print(b[j].subject + " " + b[j].score + "�� " + b[j].rank + "�� ");
						}
					}
					System.out.println();
				}
				
			}
		}
	}
}
