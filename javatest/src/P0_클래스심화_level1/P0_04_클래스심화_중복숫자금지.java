package P0_클래스심화_level1;
import java.util.Random;
class RanNum{
	int num;
	boolean check;
	
	void print() {
		System.out.println(num + " ");
	}
}
public class P0_04_클래스심화_중복숫자금지 {
	public static void main(String[] args) {
		Random ran = new Random();
		
		// 문제) RanNum 클래스를 활용해서 중복숫자금지 출력 
		//      num에 1~5사이숫자를 랜덤으로 저장한다. (조건 중복숫자금지)
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