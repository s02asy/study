package M3_문자열_level1;

public class M3_문자열1_주민번호검사 {
	public static void main(String[] args) {

		String jumin = "890101-1012932";
		// 문제 1) 성별 출력
		// 정답 1) 여성
		char gender = jumin.charAt(7);
		if(gender == '2' || gender == '4') {
			System.out.println("여성");
		}else if(gender == '1' || gender == '3') {
			System.out.println("남성");
		}
		// 문제 2) 나이 출력
		// 정답 2) 32세
		String age = jumin.substring(0,2);
		int age2 = 1900 + Integer.parseInt(age);
		int year = 2021;
		System.out.println((year - age2 + 1) + "세");
	}
}