package P6_콜렉션벡터_level1;
import java.util.Random;
import java.util.Vector;
class RanNum{
	int num;
	boolean check;
	void printRanNum() {
		System.out.println(num);
	}
}
public class P6_콜렉션벡터1_중복숫자금지 {
	public static void main(String[] args) {
		Random ran = new Random();
		// RanNum 에 중복없이 0~4 를 랜덤으로 저장하기
		
		Vector<RanNum> ranList = new Vector<RanNum>();
		// Vector<RanNum> ranList = new Vector<>();     <> 꺽쇠내용안에 클래스명 생략가능 
		
		for(int i = 0; i < 5; i++) {
			RanNum ranNum = new RanNum();
			ranList.add(ranNum);
		}
		
		for(int i = 0; i < 5;) {
			int r = ran.nextInt(5);
			if(ranList.get(r).check == false) {
				ranList.get(i).num = r;
				ranList.get(r).check = true;
				i += 1;
			}
		}
		
		for(int i = 0; i < ranList.size(); i++) {
			ranList.get(i).printRanNum();
		}
	}
}