package K3_�׽�Ʈ_�迭��ȭ_level1;

import java.util.Arrays;
import java.util.Scanner;

public class K3_�׽�Ʈ_�迭��ȭ1_�׷���1 {
	

	public static void main(String[] args) {
		int scoreList[] = {31, 76, 54, 2, 100, 23};
		
		//�� �����ʹ� �л� 6���� �����̴�.
		
		//�� �����͸� �׷����� ǥ���غ������Ѵ�.
		
		// ǥ�ô� 10�� �ڸ����ڷ� ǥ���ؼ� ������ŭ  * �� ����ҷ����Ѵ�.
		
		//��)
		// 31  ==> ***
		// 76  ==> *******
		// 54  ==> *****
		// 2   ==> 
		// 100 ==> **********
		// 23  ==> **
		char emoticon[] = new char[10];
		for(int i = 0; i < emoticon.length; i++) {
			emoticon[i] = '*';
		}
		for(int i = 0; i < scoreList.length; i++) {
			int index = scoreList[i] / 10;
			System.out.printf("%3d" , scoreList[i]);
			System.out.print(" ==> ");
			for(int j = 0; j < index; j++) {
				System.out.print(emoticon[j]);
			}
			System.out.println();
		}
	}
}