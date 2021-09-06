package M4_문자열_level2;

public class M4_문자열2_형변환4 {
	public static void main(String[] args) {
		
		String str = "김철수/87,이만수/42,이영희/95";
		
		// 위 데이터에서 1등을 삭제후 다시 문자열로 변경
		
		//1) 문자열을 잘라서 배열에 저장한다.
		//2) 배열에서 꼴등을 삭제한다
		//3) 삭제한배열을 다시 문자열로 만든다.
		
		// str = "김철수/87,이영희/95";
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