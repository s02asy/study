package M7_�׽�Ʈ_���ڿ�_level5;

public class M7_�׽�Ʈ_���ڿ�5_02_�л�����2 {
	public static void main(String[] args) {
		String [][] student = {
				{"��ö��","����","1001"}, 
				{"�����","����","1002"},
				{"��ö��","��ġ","1003"},
				{"���缮","����","1004"}};
		String[][] score = {
				{"��ȣ","����","����"},
				{"1001" ,"����","20"},
				{"1002" ,"����","50"},
				{"1003" ,"����","60"},
				{"1004" ,"����","17"},
				{"1001" ,"����","65"},
				{"1002" ,"����","15"},
				{"1003" ,"����","80"},
				{"1004" ,"����","70"},
				{"1001" ,"����","43"},
				{"1002" ,"����","90"},
				{"1003" ,"����","30"},
				{"1004" ,"����","70"}
		};
		
		// student �����ʹ�  ���ʴ�� ==>  �̸� , ���� , ��ȣ �� ��Ÿ����.
		// score �����ʹ� ==>  ��ȣ ���� , ���� , ���� �� ��Ÿ����.
				
				
		//����1) �Ʒ�������� ��ü �л� ���  
		//     [�л���ȣ] [�̸�] [����] [����] [����] [����] [����] [���] 
		String language = "����";
		String english = "����";
		String math = "����";
		double avg[] = new double[student.length];
		int total[] = new int[student.length];
		for(int i = 0; i < student.length; i++) {
			System.out.print(student[i][2] + " ");
			for(int j = 0; j < student[i].length - 1; j++) {
				System.out.print(student[i][j] + " ");
			}
			for(int j = 0; j < score.length; j++) {
				if(student[i][2] == score[j][0]) {
					for(int k = 0; k < score[i].length; k++) {
						if(language == score[j][k]) {
							total[i] += Integer.parseInt(score[j][k + 1]);
							System.out.print(score[j][k] + " ");
							System.out.print(score[j][k + 1] + " ");
						}
						if(math == score[j][k]) {
							total[i] += Integer.parseInt(score[j][k + 1]);
							System.out.print(score[j][k] + " ");
							System.out.print(score[j][k + 1] + " ");
						}
						if(english == score[j][k]) {
							total[i] += Integer.parseInt(score[j][k + 1]);
							System.out.print(score[j][k] + " ");
							System.out.print(score[j][k + 1] + " ");
						}
					}
				}
			}
			System.out.print(total[i] + " ");
			avg[i] = (double)total[i] / 3;
			System.out.print(avg[i]);
			System.out.println();
		}
		//����2) �� ���� 1�� �л��̸� �� ��ü 1���̸�  ���  
		int ���� = 0;
		int ���� = 0;
		int ���� = 0;
		int id1 = 0;
		int id2 = 0;
		int id3 = 0;
		int id4 = 0;
		double max = 0;
		for(int i = 0; i < score.length; i++) {
			for(int j = 0; j < score[i].length; j++) {
				if(score[i][j] == language) {
					if(���� < Integer.parseInt(score[i][j + 1])) {
						���� = Integer.parseInt(score[i][j + 1]);
						id1 = i;
					}
				}
				if(score[i][j] == math) {
					if(���� < Integer.parseInt(score[i][j + 1])) {
						���� = Integer.parseInt(score[i][j + 1]);
						id2 = i;
					}
				}
				if(score[i][j] == english) {
					if(���� < Integer.parseInt(score[i][j + 1])) {
						���� = Integer.parseInt(score[i][j + 1]);
						id3 = i;
					}
				}
			}
		}
		for(int i = 0; i < avg.length; i++) {
			if(max < avg[i]) {
				max = avg[i];
				id4 = i;
			}
		}
		System.out.println("��ü 1�� " + avg[id4] + " " + student[id4][0]);
		for(int i = 0; i < student.length; i++) {
			for(int j = 0; j < student[i].length; j++) {
				if(student[i][j] == score[id1][0]) {
					System.out.print("���� 1�� " + ���� + " " + student[i][0]);
					System.out.println();
				}
				if(student[i][j] == score[id2][0]) {
					System.out.print("���� 1�� " + ���� + " " + student[i][0]);
					System.out.println();
				}
				if(student[i][j] == score[id3][0]) {
					System.out.print("���� 1�� " + ���� + " " + student[i][0]);
					System.out.println();
				}
			}
		}
		
	}
}