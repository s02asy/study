package M7_�׽�Ʈ_���ڿ�_level5;

import java.util.Arrays;

public class M7_�׽�Ʈ_���ڿ�5_05_������ü {

	public static void main(String[] args) {
		String rentalData = "";		
		rentalData += "å��ȣ/å����/�뿩��¥/ȸ����ȣ\n";
		rentalData += "20122/���ʷξ���/2020-11-25/1001\n";
		rentalData += "40143/�ܱ��� ������ ����/2020-11-27/1003\n";
		rentalData += "54321/��ǻ��Ȱ��ɷ�/2020-11-27/1041\n";
		rentalData += "26543/�ƹ�ư,�ܱ���/2020-12-01/1034";
		
		
		String userData = "";
		userData += "ȸ����ȣ/å��ȣ/�뿩�ϼ�(day)\n";
		userData += "1001/20122/10\n";
		userData += "1003/40143/8\n";
		userData += "1041/54321/5\n";
		userData += "1034/26543/2";
		
		
		//�� �����ʹ� ������ å �뿩 �������̴�.
		// ������ 12��4�� �̶�������� ��ü�� ȸ����ȣ ���
		
		String rentalData2[] = rentalData.split("\n");
		String rentalData3[][] = new String[rentalData2.length - 1][];
		int id = 0;
		for(int i = 1; i < rentalData2.length; i++) {
			rentalData3[id] = rentalData2[i].split("/");
			id += 1;
		}
		String rentalData4[][] = new String[rentalData3.length][];
		for(int i = 0; i < rentalData3.length; i++) {
			rentalData4[i] = rentalData3[i][2].split("-");
		}
		String userData2[] = userData.split("\n");
		String userData3[][] = new String[userData2.length - 1][];
		int id2 = 0;
		for(int i = 1; i < userData2.length; i++) {
			userData3[id2] = userData2[i].split("/");
			id2 += 1;
		}
		System.out.println("��ü�� ȸ����ȣ ����Ʈ");
		for(int i = 0; i < rentalData4.length; i++) {
			if(Integer.parseInt(rentalData4[i][2]) + Integer.parseInt(userData3[i][2]) > 34) {
				System.out.println(userData3[i][0]);
			}
		}
	}
}