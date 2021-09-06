package P2_클래스심화_level3_5_게시판;

import java.util.Random;
import java.util.Scanner;

public class MemberDAO {
	Scanner scan = new Scanner(System.in);
	Random ran = new Random();
	Member memberlist[];
	int memcount;
	int index;
	void init(int size) {
		memberlist = new Member[size];
		memcount = 0;
	}
	
	boolean checkid(String id) {
		for(int i = 0; i < memcount; i++) {
			if(memberlist[i].id.equals(id)) {
				index = i;
				return true;
			}
		}
		return false;
	}
	
	boolean checkidandpw(String id , String pw) {
		for(int i = 0; i < memcount; i++) {
			if(memberlist[i].id.equals(id) && memberlist[i].pw.equals(pw)) {
				return true;
			}
		}
		return false;
	}
	
	void insertmember(Member member) {
		memberlist[memcount] = member;
	}
	
	void phonenum(String phone) {
		memberlist[memcount].phonenum = phone;
	}
	
	void setname(String name) {
		memberlist[memcount].name = name;
	}
	
	void sethint() {
		for(int i = 0; i < memberlist[memcount].hint.length; i++) {
			System.out.println(memberlist[memcount].hint[i]);
		}
		System.out.println("[회원가입]비밀번호 복구 힌트 질문을 선택해주세요.");
		int sel = scan.nextInt();
		memberlist[memcount].hintnum = sel - 1;
	}
	
	void hintlist() {
		for(int i = 0; i < memberlist[index].hint.length; i++) {
			System.out.println(memberlist[index].hint[i]);
		}
	}
	
	boolean checkhint() {
		System.out.println("회원가입시 선택한 힌트질문을 선택해주세요.");
		int sel = scan.nextInt();
		sel -= 1;
		if(sel == memberlist[index].hintnum) {
			return true;
		}else {
			return false;
		}
	}
	
	boolean checkhint2(String answer) {
		if(memberlist[index].hintanswer.equals(answer)) {
			return true;
		}
		return false;
	}
	void answerhint(String answer) {
		memberlist[memcount].hintanswer = answer;
		memcount += 1;
	}
	
	void setemail(String email) {
		memberlist[memcount].email = email;
	}
	
	boolean checkphonenumandname(String num , String name) {
		if(memberlist[index].phonenum.equals(num) && memberlist[index].name.equals(name)) {
			return true;
		}
		return false;
	}
	
	int code() {
		int r = ran.nextInt(8999) + 1000;
		return r;
	}
	
	void delid(String id) {
		int index = 0;
		for(int i = 0; i < memcount; i++) {
			if(memberlist[i].id.equals(id)) {
				index = i;
				break;
			}
		}
		for(int i = index; i < memcount - 1; i++) {
			memberlist[i] = memberlist[i + 1];
		}
		memcount -= 1;
		memberlist[memcount] = null;
	}
	
	void pwchange(String pw) {
		memberlist[index].pw = pw;
		memberlist[index].cnt = 0;
		memberlist[index].cnt2 = 0;
		memberlist[index].cnt3 = 0;
	}
	
}
