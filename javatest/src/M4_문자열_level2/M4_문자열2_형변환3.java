package M4_���ڿ�_level2;

public class M4_���ڿ�2_����ȯ3 {
	public static void main(String[] args) {
		
		// ����) �̸��� ������ �Ʒ��Ͱ��� �ϳ��� ���ڿ��� ����
		// ����) "��ö��/87,�̸���/42,�̿���/95"
		
		String[] name = { "��ö��", "�̸���", "�̿���" };
		int[] score = { 87, 42, 95 };
		
		String str = "";
		for(int i = 0; i < name.length; i++) {
			str += name[i];
			str += "/";
			str += String.valueOf(score[i]);
			if(i < name.length - 1) {
				str += ",";
			}
		}
		System.out.println(str);
	}
}