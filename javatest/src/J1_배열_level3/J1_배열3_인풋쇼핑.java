package J1_�迭_level3;
import java.util.Arrays;
public class J1_�迭3_��ǲ���� {
	public static void main(String[] args) {
		String [] nameList = {"�����" , "���ڱ�" , "����"};
		int [] priceList = {1000, 2100, 3300};
		int [] countList = {3,1,1};
		// �� �迭�� ��ǰ�̸��� ���� , ��ǰ���� ����Ʈ����̴� .		
		//��) ���� ���� ������� 3�� , ���ڱ� 1�� , ���� 1�� �ִ�.		
		// �Ʒ� �迭�� ���� �ֹ��� ���¼����̴�.
		// �Ѹ����� ����غ�����.		
		int [] input = {1,2,2,0,0,2,1,1};		
		//��) ù��° 1 ==> ���ڱ��� ������ 1�̹Ƿ� �Ǹ��Ҽ��ִ�.
		//��) �ι�° 2 ==> ������ ������ 1�̹Ƿ� �Ǹ��Ҽ��ִ�.
		//��) ����° 2 ==> ������ ������ �̹� �ι�°���� �����ؼ� 0�̵ǹǷ� �ǸźҰ�.
		
		// �ֹ��� ��  ����� 2�� , ���ڱ� 3�� , ���� 3�� �������� ,
		// ���� �Ǹ��� ǰ����  ����� 2�� , ���ڱ� 1�� , ���� 1�� �̴�.
		int total = 0;
		for(int i = 0; i < 8; i++) {
			if(countList[input[i]] > 0) {
				countList[input[i]] -= 1;
				total += priceList[input[i]];
			}			
		}
		System.out.println(Arrays.toString(countList));
		System.out.println(total);
		
		/*
			countList[input[0]] -= 1;
			countList[input[1]] -= 1;
			countList[input[2]] -= 1;
			countList[input[3]] -= 1;
			countList[input[4]] -= 1;
			countList[input[5]] -= 1;
			countList[input[6]] -= 1;
			countList[input[7]] -= 1;
		*/
	}
}