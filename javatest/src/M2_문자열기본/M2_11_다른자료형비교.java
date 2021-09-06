package M2_문자열기본;

public class M2_11_다른자료형비교 {
	public static void main(String[] args) {
		
		int a = 10;
		char c = '박';
		String s = "박";
		
		if(s.equals(c)) {
			System.out.println("o");
		}
		else {
			System.out.println("x");
		}
		
		if(s.equals(c + "")) {
			System.out.println("o2");
		}else {
			System.out.println("x2");
		}
		
		String num = "10";	
		if(num.equals(String.valueOf(a))) {
			System.out.println("o3");
		}else {
			System.out.println("x3");
		}
		
		if(a == Integer.parseInt(num)) {
			System.out.println("o4");
		}else {
			System.out.println("x4");
		}
	}
}