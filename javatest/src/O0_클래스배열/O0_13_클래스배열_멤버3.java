package O0_클래스배열;

import java.util.Arrays;

/*
class Member{
	int number;
	String id;
	String name;
	int score;
}
*/

public class O0_13_클래스배열_멤버3 {
	public static void main(String[] args) {
		
		String data = "";
		data += "1001,qwer,김철민,10\n";
		data += "1002,asdf,우중현,3\n";
		data += "1003,zxcv,이만수,30";
				
		System.out.println(data);
		// 위 데이터를 클래스 배열에 넣고 1등 이름출력
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
