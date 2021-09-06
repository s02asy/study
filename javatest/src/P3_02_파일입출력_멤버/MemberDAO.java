package P3_02_���������_���;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.Scanner;

public class MemberDAO {
	int max;
	Member[] memberList;
	int memberCount;
	Scanner scan;
	String path;
	void init(String path , int size) {
		this.path =  path;
		max = size;
		memberList = new Member[max];
		memberCount = 0;
		scan = new Scanner(System.in);
	}
	
	void insertMember(Member member) {
		
		memberList[memberCount] = member;
		memberCount += 1;
	}
	
	boolean checkMemberId(String id) {
		for(int i = 0; i < memberCount; i++) {
			if(memberList[i].id.equals(id)) {
				return true;
			}
		}		
		return false;
	}
	boolean checkMemberIdAndPw(String id , String pw) {
		for(int i = 0; i < memberCount; i++) {
			if(memberList[i].id.equals(id) &&
					memberList[i].pw.equals(pw)) {
				return true;
			}
		}		
		return false;
	}
	void updateMember(int index , Member member) {
		memberList[index] = member;		
	}
	int getMemberIndex(String id) {
		int index = 0;
		for(int i = 0; i < memberCount; i++) {
			if(memberList[i].id.equals(id)) {
				index = i;
				break;
			}
		}
		return index;
	}
	void removeMember(int index) {
		for(int i = index; i < memberCount - 1 ; i++) {
			memberList[i] = memberList[i + 1];
		}
		memberCount -= 1;
	}
	
	Member getMember(String id) {
		Member member = null;
		for(int i = 0; i < memberCount; i++) {
			if(memberList[i].id.equals(id)) {
				member = memberList[i];
				break;
			}
		}
		return member;
	}
	void printMemberList() {
		for(int i = 0; i < memberCount; i++) {
			memberList[i].printMember();
		}
	}
	
	String getSaveFile() {
		String data = "";
		if(memberCount == 0) {
			return null;
		}
		for(int i = 0; i < memberCount; i++) {
			data += memberList[i].id;
			data += ",";
			data += memberList[i].pw;
			data += ",";
			data += memberList[i].name;
			data += "\n";
		}
		System.out.println(data);		
		data = data.substring(0 , data.length()-1);		
		return data;
	}
	
	boolean saveMember() {
		
		String data = getSaveFile();
		
		if(data == null) {
			return false;
		}
		try {
			FileWriter fw = new FileWriter(path);
			fw.write(data);
			fw.close();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return true;
	}
		
	boolean loadMember() {			
		
		try {
			FileReader fr = new FileReader(path);
			BufferedReader br = new BufferedReader(fr);
			String data = br.readLine();
			memberCount = 0;
			while(data != null) {
				String [] tokens = data.split(",");
				memberList[memberCount] = new Member();
				memberList[memberCount].id = tokens[0];
				memberList[memberCount].pw = tokens[1];
				memberList[memberCount].name = tokens[2];
				memberCount += 1;
				data = br.readLine();
			}
			br.close();
			fr.close();
			return true;
			
		} catch (Exception e) {
			e.printStackTrace();
		}		
		return false;
	}
	
	void join() {
		System.out.println("[�߰�] ���̵��Է� : ");
		String id = scan.next();
		boolean result = checkMemberId(id);
		if (result == true) {
			System.out.println("[�ߺ����̵�]");
		} else {
			System.out.println("[�߰�] ��й�ȣ�Է� : ");
			String pw = scan.next();
			System.out.println("[�߰�] �̸��Է� : ");
			String name = scan.next();
			Member member = new Member();
			member.id = id;
			member.pw = pw;
			member.name = name;
			insertMember(member);
			System.out.println("[�߰�����]");
		}
	}

	void delete() {
		System.out.println("[����] ���̵��Է� : ");
		String id = scan.next();
		boolean result = checkMemberId(id);
		if (result == false) {
			System.out.println("[���̵� ã���� �����ϴ�]");
		} else {
			int index = getMemberIndex(id);
			removeMember(index);
			System.out.println("[��������]");
		}
	}

	void update() {
		System.out.println("[����] ���̵��Է� : ");
		String id = scan.next();
		System.out.println("[����] ��й�ȣ�Է� : ");
		String pw = scan.next();
		boolean result = checkMemberIdAndPw(id, pw);
		if (result == false) {
			System.out.println("[���̵� ã���� �����ϴ�]");
		} else {

			System.out.println("[����] �̸��Է� : ");
			String name = scan.next();
			Member member = getMember(id);
			member.name = name;
			System.out.println("[�����Ϸ�]");
		}
	}

	
	
	void save() {
		boolean result = saveMember();
		if(result == false) {
			System.out.println("[�������]");
		}else {
			System.out.println("[���强��]");
		}
	}
	void load() {
		boolean result = loadMember();
		if(result == false) {
			System.out.println("[�ҷ����� ����]");
		}else {
			System.out.println("[�ҷ����� ����]");
		}
	}
	
}