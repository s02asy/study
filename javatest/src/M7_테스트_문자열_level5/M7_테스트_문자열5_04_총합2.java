package M7_�׽�Ʈ_���ڿ�_level5;

import java.util.Arrays;

public class M7_�׽�Ʈ_���ڿ�5_04_����2 {
	public static void main(String[] args) {
		String nameData = "";
		nameData += "100001/�̸���";nameData += "\n";		
		nameData += "100002/�̿���";nameData += "\n";
		nameData += "100003/���缮";nameData += "\n";
		nameData += "100004/�ڸ��";nameData += "\n";
		nameData += "100005/�ֿ���";nameData += "\n";
		nameData += "100006/�ں���";
		
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
		
		// ����) moneyData �� nameData �� �����ؼ� �Ʒ��Ͱ��� ��������
		// �̸��߰� 
		/*
		 * 100001/�̸���/600
		 * 100003/���缮/7000
		 * 100001/�̸���/100
		 * 100002/�̿���/400
		 * 100001/�̸���/600
		 * 100004/�ڸ��/900
		 * 100001/�̸���/130
		 * 100003/���缮/200
		 * 100002/�̿���/700
		 * 100002/�̿���/900
		 * 100004/�ڸ��/800
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