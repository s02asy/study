package _05_���ڿ���ȭ;

public class _05_02_���ڿ���ȭ1_���� {
	public static void main(String[] args) {
	
		String data = "";
		
		int numList[] = {1001,1002,1003};
		String nameLsit[] = {"��ö��" , "�̸���" , "�̿���"};
		/*
			1) numList �� �л���ȣ�͸� �����Ѱ��̰� 
			2) nameLsit �� �̸��� ���ڿ��� �����س������̴�.
			3) �� �� �迭�� �Ʒ��� ���� data �� ���� 
				"1001/��ö��,1002/�̸���,1003/�̿���";
		 */
		
		for(int i = 0; i < numList.length; i++) {
			data += String.valueOf(numList[i]);
			data += "/";
			data += nameLsit[i];
			data += ",";
		}
		data = data.substring(0, data.length() - 1);
		System.out.println(data);
	}
}