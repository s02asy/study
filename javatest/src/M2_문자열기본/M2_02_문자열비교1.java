package M2_���ڿ��⺻;

import java.util.Scanner;

public class M2_02_���ڿ���1 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
//		String name = "ȫ�浿";
//
//		System.out.print("�̸��� �Է��ϼ��� : ");
//		String myName = scan.next();
//		
//		if(name == myName) {
//			System.out.println("== ������ : ��ġ");
//		}else {
//			System.out.println("== ������ : ����ġ");
//		}
//		
//		if(name.equals(myName)) {
//			System.out.println("equals() �޼��� : ��ġ");
//		}else {
//			System.out.println("equals() �޼��� : ����ġ");
//		}
		
		String [] datalist = {"aaa" , "bbb"};
		String data = "bbb";
		
		for(int i = 0; i < datalist.length; i++) {
			if(data == datalist[i]) {
				System.out.println("!!");
			}
		}
	}

}