package M4_���ڿ�_level2;

public class M4_���ڿ�2_����ȯ4 {
	public static void main(String[] args) {
		
		String str = "��ö��/87,�̸���/42,�̿���/95";
		
		// �� �����Ϳ��� 1���� ������ �ٽ� ���ڿ��� ����
		
		//1) ���ڿ��� �߶� �迭�� �����Ѵ�.
		//2) �迭���� �õ��� �����Ѵ�
		//3) �����ѹ迭�� �ٽ� ���ڿ��� �����.
		
		// str = "��ö��/87,�̿���/95";
		int score[] = new int[3];
		String name[] = new String[3];
		
		String temp[] = str.split(",");
		for(int i = 0; i < temp.length; i++) {
			String temp2[] = temp[i].split("/");
			name[i] = temp2[0];
			score[i] = Integer.parseInt(temp2[1]);
		}
		int max = 0;
		for(int i = 0; i < score.length; i++) {
			if(max < score[i]) {
				max = score[i];
			}
		}
		int min = max;
		int index = -1;
		for(int i = 0; i < score.length; i++) {
			if(min > score[i]) {
				min = score[i];
				index = i;
			}
		}
		name[index] = "";
		score[index] = 0;
		str = "";
		for(int i = 0; i < score.length; i++) {
			if(name[i] != "") {
				str += name[i] + "/";
			}
			if(score[i] != 0) {
				str += String.valueOf(score[i]);
			}
			if(i>0 && i < score.length - 1) {
				str += ",";
			}
		}
		System.out.println(str);
	}
}