package M4_���ڿ�_level2;

import java.util.Arrays;

public class M4_���ڿ�2_����ȯ1 {
	public static void main(String[] args) {

		// ���ڿ� �Լ��� ����ؼ� Ǯ���
		
		String str = "11/100/89";
		// ���� 1) arr �迭�� �� ������ �����ϰ�, ���� ���
		// ���� 1) 200
		int[] arr = new int[3];
		String str2[] = str.split("/");
		int total = 0;
		for(int i = 0; i < arr.length; i++) {
			arr[i] = Integer.parseInt(str2[i]);
			total += arr[i];
		}
		System.out.println(Arrays.toString(arr));
		System.out.println(total);
		// ���� 2) scores �迭�� �� ������ �����ø� �����ڷ� �ϳ��� ���ڿ��� ����
		// ���� 2) 11/100/89
//		int[] scores = {11, 100, 89};
//		String text = "";
//		for(int i = 0; i < scores.length; i++) {
//			if(i > 0 && i < scores.length) {
//				text += "/";
//			}
//			text += String.valueOf(scores[i]);
//		}
//		System.out.println(text);
		int[] scores = {11, 100, 89};
		String text = "";
		for(int i = 0; i<scores.length; i++) {
			text+=scores[i]+" ";
		}
		System.out.println(text);
		text = text.trim();
		text = text.replaceAll(" ","/");
		System.out.println(text);
	}

}