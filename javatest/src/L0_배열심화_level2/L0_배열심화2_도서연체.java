package L0_�迭��ȭ_level2;

import java.util.Arrays;

public class L0_�迭��ȭ2_������ü {
	public static void main(String[] args) {
		int �뿩�Ⱓ = 34;
		int [] �뿩�� = {2020 , 12, 29};
		int [] ���� = {2021, 1, 12};
		
		int ���ش�[] = {31, 28, 31, 30, 31, 31, 30, 31 , 30 , 31 , 30 , 31};
		
		// ���� �����������϶� ������ ��ü���� ���(��, ������ ��������ʴ´�)
		�뿩��[2] += �뿩�Ⱓ;
		while(true) {
			boolean check = false;
			for(int i = 0; i < ���ش�.length; i++) {
				if(i + 1 == �뿩��[1] && ���ش�[i] < �뿩��[2]) {
					check = true;
					�뿩��[1] += 1;
					�뿩��[2] -= ���ش�[i];
					if(�뿩��[1] > ���ش�.length) {
						�뿩��[1] -= ���ش�.length;
						�뿩��[0] += 1;
					}
				}
			}
			if(check == false) {
				break;
			}
		}
		String year[] = {"��","��","��"}; 
		System.out.println("�뿩����");
		for(int i = 0; i < �뿩��.length; i++) {
			System.out.print(�뿩��[i] + "" + year[i] + " ");
		}
		System.out.println();
		System.out.println("����");
		for(int i = 0; i < �뿩��.length; i++) {
			System.out.print(����[i] + "" + year[i] + " ");
		}
		System.out.println();
		if(�뿩��[0] < ����[0]) {
			int day1 = 0;
			int day2 = 0;
			for(int i = 0; i < �뿩��[0]; i++) {
				for(int j = 0; j < ���ش�.length; j++) {
					day1 += ���ش�[j];
				}
			}
			for(int i = 0; i < �뿩��[1] - 1; i++) {
				day1 += ���ش�[i];
			}
			day1 += �뿩��[2];
			for(int i = 0; i < ����[0]; i++) {
				for(int j = 0; j < ���ش�.length; j++) {
					day2 += ���ش�[j];
				}
			}
			for(int i = 0; i < ����[1] - 1; i++) {
				day2 += ���ش�[i];
			}
			day2 += ����[2];
			System.out.println(day2 - day1 + "�� ��ü");
		}else if(�뿩��[0] == ����[0] && �뿩��[1] < ����[1]) {
			int day1 = 0;
			int day2 = 0;
			for(int i = 0; i < �뿩��[1] - 1; i++) {
				day1 += ���ش�[i];
			}
			day1 += �뿩��[2];
			for(int i = 0; i < ����[1] - 1; i++) {
				day2 += ���ش�[i];
			}
			day2 += ����[2];
			System.out.println(day2 - day1 + "�� ��ü");
		}else if(�뿩��[0] == ����[0] && �뿩��[1] == ����[1] && �뿩��[2] < ����[2]) {
			System.out.println(����[2] - �뿩��[2] + "�� ��ü");
		}else {
			int day1 = 0;
			int day2 = 0;
			for(int i = 0; i < �뿩��[0]; i++) {
				for(int j = 0; j < ���ش�.length; j++) {
					day1 += ���ش�[j];
				}
			}
			for(int i = 0; i < �뿩��[1] - 1; i++) {
				day1 += ���ش�[i];
			}
			day1 += �뿩��[2];
			for(int i = 0; i < ����[0]; i++) {
				for(int j = 0; j < ���ش�.length; j++) {
					day2 += ���ش�[j];
				}
			}
			for(int i = 0; i < ����[1] - 1; i++) {
				day2 += ���ش�[i];
			}
			day2 += ����[2];
			System.out.println("�����Ⱓ " + (day1 - day2) + "��");
		}
	}
}