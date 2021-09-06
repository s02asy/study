package P5_1_����Ŭ�����迭_���;

import java.util.Scanner;

public class MemberDAO {
	int num;
	Member[] memberList;
	int memberCount;
	Scanner scan;

	void init() {
		scan = new Scanner(System.in);
		num = 1000;
		memberList = null;
		memberCount = 0;
	}

	int checkId(String id) {
		for (int i = 0; i < memberCount; i++) {
			if (id.equals(memberList[i].id)) {
				return i;
			}
		}
		return -1;
	}

	int getNextNum() {
		num += 1;
		return num;
	}

	void addMember(Member member) {

		if (memberCount == 0) {
			memberList = new Member[1];
			memberList[0] = member;
			memberCount += 1;
		} else if (memberCount > 0) {
			Member[] temp = memberList;
			memberList = new Member[memberCount + 1];
			for (int i = 0; i < temp.length; i++) {
				memberList[i] = temp[i];
			}
			memberList[memberCount] = member;
			memberCount += 1;
			temp = null;
		}
	}

	void removeMember(int removeIndex) {
		if (memberCount == 1) {
			memberList = null;
			memberCount = 0;
		} else if (memberCount > 1) {
			Member[] temp = memberList;
			memberList = new Member[memberCount - 1];
			int index = 0;
			for (int i = 0; i < temp.length; i++) {
				if (i != removeIndex) {
					memberList[index] = temp[i];
					index += 1;
				}
			}
			memberCount -= 1;
			temp = null;
		}
	}

	void printMember() {
		for (int i = 0; i < memberCount; i++) {
			memberList[i].printMember();
		}
	}

	void join() {

		System.out.println("[�߰�] ���̵��Է� : ");
		String id = scan.next();
		int checkId = checkId(id);
		if (checkId == -1) {
			Member member = new Member();
			member.id = id;
			member.num = getNextNum();
			addMember(member);
		} else {
			System.out.println("[�޼���] �ߺ����̵� �Դϴ�.");
		}
	}

	void remove() {

		if (memberCount == 0) {
			System.out.println("[�޼���] �����ҵ����Ͱ������ϴ�.");
			return;
		}
		System.out.println("[����] ���̵��Է� : ");
		String id = scan.next();
		int checkId = checkId(id);
		if (checkId == -1) {
			System.out.println("[�޼���] ã�¾��̵� �����ϴ�.");
		} else {
			removeMember(checkId);
		}
	}
}