package P2_Ŭ������ȭ_level3_5_�Խ���;

public class Member {
	String id;
	String pw;
	String name;
	String email;
	String hint[] = {"1.���� ���� �� 1ȣ��?" , "2.���� ���� �ʵ��б���?" , "3.���� �ƹ��� ������?" , "4.���� ������?" , "5.ù����� �̸���?"};
	String hintanswer;
	String phonenum;
	int hintnum;
	int cnt;
	int cnt2;
	int cnt3;
	void printmem() {
		System.out.println("id : " + id + " " + "pw : " + pw + " " + "name : " + name + " " + "phonenum : " + phonenum + " " + "email : " + email);
	}
}
