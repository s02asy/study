package M7_�׽�Ʈ_���ڿ�_level5;

public class M7_�׽�Ʈ_���ڿ�5_01_�л�����1 {
	public static void main(String[] args) {
		String [][] student = {
				{"�̸���","����","1001"}, 
				{"��ö��","����","1002"},
				{"����ȣ","��ġ","1003"} , 
				{"���缮","����","1004"}};
		String[][] score = {
				{"1001","100","20","30"},
				{"1002","10" ,"60","60"},
				{"1003","23" ,"63","31"},
				{"1004","45" ,"30","35"},
		};
		// student �����ʹ�  ���ʴ�� ==>  �̸� , ���� , ��ȣ �� ��Ÿ����.
		// score �����ʹ� ==>  ��ȣ ���� , ���� , ���� �� ��Ÿ����.
		
		
		//����1) �Ʒ�������� ��ü �л� ���  
		//     [�л���ȣ] [�̸�] [����] [����] [����] [����] [����] [���] 
		int total[] = new int[score.length];
		double avg[] = new double[score.length];
		for(int i = 0; i < student.length; i++) {
			System.out.print(student[i][2] + " ");
			for(int j = 0; j < score.length; j++) {
				if(student[i][2] == score[j][0]) {
					for(int k = 0; k < student[i].length - 1; k++) {
						System.out.print(student[i][k] + " ");
					}
					for(int l = 1; l < score[j].length; l++) {
						total[j] += Integer.parseInt(score[j][l]);
						avg[j] = (double)total[j] / (score[j].length - 1);
						System.out.print(score[j][l] + " ");
					}
					System.out.print(total[j] + " ");
					System.out.printf("%.2f",avg[j]);
				}
			}
			System.out.println();
		}
		//����2) �� ���� 1�� �л��̸� �� ��ü 1���̸�  ���
		int ���� = 0;
		int ���� = 0;
		int ���� = 0;
		double max = 0;
		int id1 = 0;
		int id2 = 0;
		int id3 = 0;
		int id4 = 0;
		for(int i = 0; i < score.length; i++) {
			if(���� < Integer.parseInt(score[i][1])) {
				���� = Integer.parseInt(score[i][1]);
				id1 = i;
			}
			if(���� < Integer.parseInt(score[i][2])) {
				���� = Integer.parseInt(score[i][2]);
				id2 = i;
			}
			if(���� < Integer.parseInt(score[i][3])) {
				���� = Integer.parseInt(score[i][3]);
				id3 = i;
			}
			if(max < avg[i]) {
				max = avg[i];
				id4 = i;
			}
		}
		for(int i = 0; i < student.length; i++) {
			if(student[i][2] == score[id1][0]) {
				System.out.println("���� 1�� " + ���� + "�� " + student[i][0]);
			}
			if(student[i][2] == score[id2][0]) {
				System.out.println("���� 1�� " + ���� + "�� " + student[i][0]);
			}
			if(student[i][2] == score[id3][0]) {
				System.out.println("���� 1�� " + ���� + "�� " + student[i][0]);
			}
			if(student[i][2] == score[id4][0]) {
				System.out.println("��ü��� 1�� " + avg[id4] + "�� " + student[i][0]);
			}
		}
		
	}
}