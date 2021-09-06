package M7_테스트_문자열_level5;

import java.util.Arrays;

public class M7_테스트_문자열5_03_총합1 {
	public static void main(String[] args) {
		String data ="";
		data += "10001/김철수/600\n";
		data += "10002/이영희/800\n";
		data += "10001/김철수/1400\n";
		data += "10003/유재석/780\n";
		data += "10002/이영희/950\n";
		data += "10004/박명수/330\n";
		data += "10001/김철수/670\n";
		data += "10003/유재석/3300\n";
		data += "10002/이영희/200\n";
		data += "10004/박명수/6800\n";
		data = data.substring(0 , data.length()-1); // 마지막 글삭제 
		System.out.println(data);
		System.out.println();
		// 문제1) 위 데이터 는  각각의 회원이 물건을 구입가격들 을 기록한 내용이다.
		//		 데이터를 아래와 같이 출력 하시요 (각 회원별 구입 총합 )	
		/*
		  =====================
			10001 김철수 2670
			10002 이영희 1950
			10003 유재석 4080
			10004 박명수 7130
		   =====================		  
		 */
		String data2[] = data.split("\n");
		String data3[][] = new String[data2.length][];
		String data4[] = new String[data3.length];
		for(int i = 0; i < data4.length; i++) {
			data4[i] = "";
		}
		for(int i = 0; i < data2.length; i++) {
			data3[i] = data2[i].split("/");
		}
		for(int i = 0; i < data3.length; i++) {
			System.out.println(Arrays.toString(data3[i]));
		}
		int id = 0;
		for(int i = 0; i < data3.length; i++) {
			boolean check = false;
			for(int j = 0; j < data4.length; j++) {
				if(data3[i][0].equals(data4[j])) {
					check = true;
					break;
				}
			}
			if(check == false) {
				data4[id] = data3[i][0];
				id += 1;
			}
		}
		System.out.println();
		int total[] = new int[id];
		int id2 = 0;
		for(int i = 0; i < id; i++) {
			for(int j = 0; j < data3.length; j++) {
				if(data4[i].equals(data3[j][0])) {
					total[i] += Integer.parseInt(data3[j][2]);
					id2 = j;
				}
			}
			System.out.print(data4[i] + " " + data3[id2][1] + " " + total[i]);
			System.out.println();
		}
	}
}