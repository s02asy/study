package P0_Ŭ������ȭ_level1;
import java.util.Random;

class RanNum1{
	int num;
	boolean check;
	
	void print() {
		System.out.print(num + " ");
	}
}

public class P0_04_Ŭ������ȭ_�ߺ����ڱ���_���� {
	public static void main(String[] args) {
		Random ran = new Random();
		
		// ����) RanNum Ŭ������ Ȱ���ؼ� �ߺ����ڱ��� ��� 
		//      num�� 1~5���̼��ڸ� �������� �����Ѵ�. (���� �ߺ����ڱ���)
	
		RanNum1 random[] = new RanNum1[5];
		
		for(int i = 0; i < random.length; i++) {
			random[i] = new RanNum1();
		}
		for(int i = 0; i < random.length;) {
			int r = ran.nextInt(5);
			if(random[r].check == false) {
				random[r].check = true;
				random[i].num = r + 1;
				i += 1;
			}
		}
		for(int i = 0; i < random.length; i++) {
			random[i].print();
		}
	}
}