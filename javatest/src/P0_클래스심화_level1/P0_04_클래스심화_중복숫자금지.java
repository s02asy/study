package P0_Ŭ������ȭ_level1;
import java.util.Random;
class RanNum{
	int num;
	boolean check;
	
	void print() {
		System.out.println(num + " ");
	}
}
public class P0_04_Ŭ������ȭ_�ߺ����ڱ��� {
	public static void main(String[] args) {
		Random ran = new Random();
		
		// ����) RanNum Ŭ������ Ȱ���ؼ� �ߺ����ڱ��� ��� 
		//      num�� 1~5���̼��ڸ� �������� �����Ѵ�. (���� �ߺ����ڱ���)
		RanNum[] ranList = new RanNum[5];
		
		for(int i=0; i<5; i++) {
			ranList[i] = new RanNum();
		}
		
		for(int i=0; i<5; i++) {
					
			int rNum = ran.nextInt(5);;
			if(ranList[rNum].check == false) {
				ranList[rNum].check = true;
				ranList[rNum].num = i + 1;
			}
			else {
				i -= 1;
			}			
		}
		for(int i=0; i<5; i++) {
			ranList[i].print();
		}
	
		
	}
}