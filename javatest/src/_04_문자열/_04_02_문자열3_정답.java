package _04_���ڿ�;

public class _04_02_���ڿ�3_���� {
	public static void main(String[] args) {
		int scoreList[] = {12, 32, 54, 43};
		
		String data = "";
				
		/*
		 * 1) scoreList �� ������  data�� �ٿ��ֱ� �Ͻÿ�.
		 * 2) �����ڴ� , ���Ѵ�.
		 * 
		 * 	��) 54,43,32,12 
		 */
		
		
		for(int i = 0; i < scoreList.length; i++) {
			data += scoreList[i];
			data += ",";
		}
		System.out.println(data);
		data = data.substring(0, data.length()-1);
		System.out.println(data);
	}
}