package M7_�׽�Ʈ_���ڿ�_level5;

import java.util.Arrays;

public class M7_�׽�Ʈ_���ڿ�5_03_����1 {
	public static void main(String[] args) {
		String data ="";
		data += "10001/��ö��/600\n";
		data += "10002/�̿���/800\n";
		data += "10001/��ö��/1400\n";
		data += "10003/���缮/780\n";
		data += "10002/�̿���/950\n";
		data += "10004/�ڸ��/330\n";
		data += "10001/��ö��/670\n";
		data += "10003/���缮/3300\n";
		data += "10002/�̿���/200\n";
		data += "10004/�ڸ��/6800\n";
		data = data.substring(0 , data.length()-1); // ������ �ۻ��� 
		System.out.println(data);
		System.out.println();
		// ����1) �� ������ ��  ������ ȸ���� ������ ���԰��ݵ� �� ����� �����̴�.
		//		 �����͸� �Ʒ��� ���� ��� �Ͻÿ� (�� ȸ���� ���� ���� )	
		/*
		  =====================
			10001 ��ö�� 2670
			10002 �̿��� 1950
			10003 ���缮 4080
			10004 �ڸ�� 7130
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