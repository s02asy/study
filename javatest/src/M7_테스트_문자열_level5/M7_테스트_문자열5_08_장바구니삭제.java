package M7_�׽�Ʈ_���ڿ�_level5;

import java.util.Arrays;

public class M7_�׽�Ʈ_���ڿ�5_08_��ٱ��ϻ��� {
	public static void main(String[] args) {
		
		String item = "ĭ��/�����/����/�ݶ�/���̴�";
		String id = "qwer/abcd/java";
		
		
		String cart = "";
		cart += "qwer/����\n";
		cart += "qwer/�����\n";
		cart += "abcd/�ݶ�\n";
		cart += "java/ĭ��\n";
		cart += "qwer/ĭ��\n";
		cart += "java/����\n";
		cart += "abcd/���̴�";
		
		 String input[][] = {{"qwer" , "3"} , {"abcd" , "1"}};


		// cart�����ʹ� ���� ��ٱ��� ��Ȳ�̴�.
		// input�����ʹ� ������ ��û�ѵ������̴�.
		
		// qwer�� ���̵��̰�  3 �� ������ȣ�̴�.
		// qwer ���忡���� ���ξ������� 3���ۿ� ������ ĭ�ݸ� ��������� 3�� 
		// ���������� ���� ��ü �����Ϳ����� 5��° �������̴�. 
		
		// ���������� abcd �� �ݶ�� ���̴� �� �����߰� ,
		// �ݶ� ��������� 1���� �����Ѱ��̰� �����δ�3���������� �����Ǿ���Ѵ�.
		
		/*
		 * ����
		    cart += "qwer/����\n";
			cart += "qwer/�����\n";
			cart += "java/ĭ��\n";
			cart += "java/����\n";
			cart += "abcd/���̴�";
		 */
		 String token[] = cart.split("\n");
		 String token2[][] = new String[token.length][];
		 for(int i = 0; i < token.length; i++) {
			   token2[i] = token[i].split("/");
		 }
		 for(int i = 0; i < input.length; i++) {
			 int cnt = 0;
			 for(int j = 0; j < token2.length; j++) {
				 if(token2[j][0].equals(input[i][0])) {
					 cnt += 1;
					if(Integer.parseInt(input[i][1]) == cnt) {
						for(int k = 0; k < token2[j].length; k++) {
							token2[j][k] = "";
						}
					}
				 }
			 }
		 }
		 cart = "";
		 for(int i = 0; i < token2.length; i++) {
			 if(token2[i][0] != "") {
				 cart += token2[i][0] + "/" + token2[i][1] + "\n";
			 }
		 }
		 cart = cart.substring(0,cart.length() - 1);
		 System.out.println(cart);
	}
}