package _04_���ڿ�;

public class _04_02_���ڿ�2 {
	public static void main(String[] args) {
		String userData = "1001,1002,1003,1004";
		String scoreData = "10,21,43,12";
		
		/*
		 * 1) userData �� �л� ��ȣ �������̴�
		 * 
		 * 2) scoreData �� �л� ���� �������̴�.
		 * 
		 * 3) 1�� ��ȣ ���  
		 *  - ��) 1003 : 43
		 *  
		 * 4) ��ü ��� ���
		 *  - ��) (10 + 21 + 43 + 12) / 4.0
		 */
		String udtokens[] = userData.split(",");
		String sdtokens[] = scoreData.split(",");
		int max = 0;
		int index = 0;
		int total = 0;
		for(int i = 0; i < sdtokens.length; i++) {
			if(Integer.parseInt(sdtokens[i]) > max) {
				max = Integer.parseInt(sdtokens[i]);
				index = i;
			}
			total += Integer.parseInt(sdtokens[i]);
		}
		System.out.println("1�� ��ȣ : " + udtokens[index] + " ���� : " + sdtokens[index]);
		double avg = (double)total / sdtokens.length;
		System.out.println("��� : " + avg);
	}
}