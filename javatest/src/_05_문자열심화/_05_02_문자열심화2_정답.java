package _05_���ڿ���ȭ;

public class _05_02_���ڿ���ȭ2_���� {
	public static void main(String[] args) {
	
		String data = "1001/��ö��\n";
			   data += "1002/�̸���\n";
			   data += "1003/�̿���";
		System.out.println(data);
		
		int numList[];
		String nameList[];
		/*
			1) data �� �л���ȣ�� , �̸��� ���ڿ��� �����س������̴�.
			2) �Ʒ� �迭�� ���� �� �����ؼ� ��� 
		 */
		
		String token[] = data.split("\n");
		int size= token.length;
		
		numList = new int[size];
		nameList = new String[size];
		
		for(int i =0; i < size; i++) {
			String [] token2 = token[i].split("/");
			numList[i] = Integer.parseInt(token2[0]);
			nameList[i] = token2[1];
		}
		
		
	}
}