package _02_�迭��ȭ;

import java.util.Arrays;

public class _02_02_�����ϱ�3_���� {
	public static void main(String[] args) {
			
		int seatList[] = {1003,1003,0,0,1002,0,1001};
		
		int seatIndex[] = {1,1,4};
		int user [] = {1003,1002,1005};
		
		/*
		 * 1) seatList �� ���� ��ȭ�� ���Ż�Ȳ �̴�.
		 * 2) seatIndex �� ���� �ҷ��� �¼� ��ȣ�̰�
		 * 3) user �� ȸ����ȣ�̴� 
		 * 
		 * 4) seatIndex �� user �� ������ ������ ��ü ���Ż�Ȳ ��� 
		 * 5) �¼��� ��������� �����Ҽ��ִ�.
		 * 6) �¼��� �̹� ���� �Ǿ������� 2���������� �Ѱ������� 
		 * 7) [���� 1] �̹� ���ŵǾ�������, ȸ����ȣ�� ������ ������� 0���� ����
		 * 8) [���� 2) �̹� ���ŵǾ��ְ� , ȸ����ȣ�� �ٸ��� "x" ��� 
		 * 
		 * 
		 * -��) 1 , 1003 ==> ���� �Ǿ�������, 1003���� ���������Ƿ� ���� ��ҵȴ� 
		 *      ==> seatList[] = {1003,0,1003,0,1002,0,1001};
		 * 		
		 * -��) 1 , 1002 ==> ������ ������������Ƿ� ���� ����
		 *      ==> seatList[] = {1003,1002,1003,0,1002,0,1001};
		 *      
		 * -��) 4 , 1005 ==> ���� �Ǿ��ְ�, ȸ����ȣ�� �ٸ��� ==> "x"
		 * 
		 */

		
		for(int i = 0; i < seatIndex.length; i++){
			
			if(seatList[seatIndex[i]] == 0) {
				System.out.println(user[i] + " : ���� ����");
				seatList[seatIndex[i]] = user[i];
			}else {
				if(seatList[seatIndex[i]] == user[i]) {
					seatList[seatIndex[i]] = 0;
					System.out.println(user[i] + " : ���� ���");
				}else {
					System.out.println(user[i] + " : ���� �Ұ�");
				}
			}
		}
		System.out.println(Arrays.toString(seatList));
		
	}
}