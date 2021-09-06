package M7_테스트_문자열_level5;

import java.util.Arrays;

public class M7_테스트_문자열5_04_총합2 {
	public static void main(String[] args) {
		String nameData = "";
		nameData += "100001/이만수";nameData += "\n";		
		nameData += "100002/이영희";nameData += "\n";
		nameData += "100003/유재석";nameData += "\n";
		nameData += "100004/박명수";nameData += "\n";
		nameData += "100005/최여정";nameData += "\n";
		nameData += "100006/박병욱";
		
		String  moneyData = "";
		moneyData += "100001/600";moneyData += "\n";	
		moneyData += "100003/7000";moneyData += "\n";		
		moneyData += "100001/100";moneyData += "\n";		
		moneyData += "100002/400";moneyData += "\n";		
		moneyData += "100001/600";moneyData += "\n";		
		moneyData += "100004/900";moneyData += "\n";		
		moneyData += "100001/130";moneyData += "\n";		
		moneyData += "100003/200";moneyData += "\n";		
		moneyData += "100002/700";moneyData += "\n";	
		moneyData += "100002/900";moneyData += "\n";
		moneyData += "100004/800";
		
		// 문제) moneyData 와 nameData 를 조합해서 아래와같이 만들어보세요
		// 이름추가 
		/*
		 * 100001/이만수/600
		 * 100003/유재석/7000
		 * 100001/이만수/100
		 * 100002/이영희/400
		 * 100001/이만수/600
		 * 100004/박명수/900
		 * 100001/이만수/130
		 * 100003/유재석/200
		 * 100002/이영희/700
		 * 100002/이영희/900
		 * 100004/박명수/800
		 */
		
		String allData = "";
		String nameData2[] = nameData.split("\n");
		String moneyData2[] = moneyData.split("\n");
		String nameData3[][] = new String[nameData2.length][];
		String moneyData3[][] = new String[moneyData2.length][];
		
		for(int i = 0; i < nameData2.length; i++) {
			nameData3[i] = nameData2[i].split("/");
		}
		for(int i = 0; i < moneyData2.length; i++) {
			moneyData3[i] = moneyData2[i].split("/");
		}
		for(int i = 0; i < moneyData3.length; i++) {
			for(int j = 0; j < nameData3.length; j++) {
				if(moneyData3[i][0].equals(nameData3[j][0])) {
					allData += moneyData3[i][0] + "/" + nameData3[j][1] + "/" +  moneyData3[i][1] + "\n";
				}
			}
		}
		allData = allData.substring(0,allData.length() - 1);
		System.out.println(allData);
	}
}