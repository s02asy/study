package M3_���ڿ�_level1;

public class M3_���ڿ�1_�ֹι�ȣ�˻� {
	public static void main(String[] args) {

		String jumin = "890101-1012932";
		// ���� 1) ���� ���
		// ���� 1) ����
		char gender = jumin.charAt(7);
		if(gender == '2' || gender == '4') {
			System.out.println("����");
		}else if(gender == '1' || gender == '3') {
			System.out.println("����");
		}
		// ���� 2) ���� ���
		// ���� 2) 32��
		String age = jumin.substring(0,2);
		int age2 = 1900 + Integer.parseInt(age);
		int year = 2021;
		System.out.println((year - age2 + 1) + "��");
	}
}