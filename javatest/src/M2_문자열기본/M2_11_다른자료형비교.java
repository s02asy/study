package M2_���ڿ��⺻;

public class M2_11_�ٸ��ڷ����� {
	public static void main(String[] args) {
		
		int a = 10;
		char c = '��';
		String s = "��";
		
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