package O0_Ŭ�����迭;

import java.util.Arrays;

/*
class Member{
	int number;
	String id;
	String name;
	int score;
}
*/

public class O0_13_Ŭ�����迭_���3 {
	public static void main(String[] args) {
		
		String data = "";
		data += "1001,qwer,��ö��,10\n";
		data += "1002,asdf,������,3\n";
		data += "1003,zxcv,�̸���,30";
				
		System.out.println(data);
		// �� �����͸� Ŭ���� �迭�� �ְ� 1�� �̸����
		String[] tokens = data.split("\n");
		String[][] tokens2 = new String[tokens.length][];
		for(int i = 0; i < tokens.length; i++) {
			tokens2[i] = tokens[i].split(",");
		}
		Member[] e = new Member[3];
		for(int i = 0; i < e.length; i++) {
			e[i] = new Member();
			e[i].number = Integer.parseInt(tokens2[i][0]);
			e[i].id = tokens2[i][1];
			e[i].name = tokens2[i][2];
			e[i].score = Integer.parseInt(tokens2[i][3]);
		}
		int max = 0;
		int id = 0;
		for(int i = 0; i < e.length; i++) {
			if(max < e[i].score) {
				max = e[i].score;
				id = i;
			}
		}
		System.out.println(e[id].name);
	}
}
