package M2_���ڿ��⺻;

public class M2_04_���ڿ����� {

	public static void main(String[] args) {
		// ����) ���� ������ �̸� ����
		String[] names = { "ȫ�浿", "������", "������", "�ڹ�ŷ", "������" };

		for (int i = 0; i < names.length; i++) {
			String minName = names[i];
			int minIdx = i;
			for (int j = i; j < names.length; j++) {
				if (minName.compareTo(names[j]) > 0) {
					minName = names[j];
					minIdx = j;
				}
			}
			String temp = names[i];
			names[i] = names[minIdx];
			names[minIdx] = temp;
		}

		for (int i = 0; i < names.length; i++) {
			System.out.print(names[i] + " ");
		}

	}

}