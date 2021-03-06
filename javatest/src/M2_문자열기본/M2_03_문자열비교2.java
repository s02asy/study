package M2_문자열기본;


public class M2_03_문자열비교2 {

	public static void main(String[] args) {
		String str1 = "가";
		String str2 = "나";
		String str3 = "가";
		
		// 문자들은 기본적으로 숫자를 가지고있다.
		// compareTo 는  빼기 를 뜻한다. 
		
		// 만약에 "a" 가  숫자 10이라면 "b" 는 11이다.
		// a에서 b를 뺀다면 ==> 음수가 나올것이다.
		
		
		int rs1 = str1.compareTo(str2);
		System.out.println(rs1);			// 음수
		
		int rs2 = str2.compareTo(str1);
		System.out.println(rs2);			// 양수
		
		int rs3 = str1.compareTo(str3);
		System.out.println(rs3);			// 0
		
		

	}

}