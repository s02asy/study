package P2_클래스심화_level3_5_게시판;

public class Member {
	String id;
	String pw;
	String name;
	String email;
	String hint[] = {"1.나의 보물 제 1호는?" , "2.나의 졸업 초등학교는?" , "3.나의 아버지 성함은?" , "4.나의 별명은?" , "5.첫사랑의 이름은?"};
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
