package P0_클래스심화_level1;
import java.util.Random;

class RanNum1{
	int num;
	boolean check;
	
	void print() {
		System.out.print(num + " ");
	}
}

public class P0_04_클래스심화_중복숫자금지_문제 {
	public static void main(String[] args) {
		Random ran = new Random();
		
		// 문제) RanNum 클래스를 활용해서 중복숫자금지 출력 
		//      num에 1~5사이숫자를 랜덤으로 저장한다. (조건 중복숫자금지)
	
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