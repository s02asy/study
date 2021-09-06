package D9_Test;

public class D9_Variable_test3 {
	public static void main(String[] args) {	
	
// # 문제1 )  어떤수에 3을 곱하였더니 6.12 가되었습니다. 이수를 4로 나누면 얼마?
		double 어떤수 = 6.12 / 3;
		double 수 = 어떤수 / 4;
		System.out.println(수);

// # 문제2) 지웅이가 1시간 20분동안 일정한 빠르기로 주은 밤의 무게가 9 키로이다
// # 3분동안 주은밤은 몇키로인가 ?
		double 밤 = 9.0;
		int 시간 = 80;
		double 분당 = 밤 / 시간;
		double 주은밤 = 분당 * 3;
		System.out.println(주은밤 + "kg");

// # 문제3) 가게에 우유가 250개가 있다 그중에 오전에 84퍼센트가 팔렸고 나머지는 오후에 다팔렸다
// # 오전에 팔린갯수 - 오후에 팔린갯수는 얼마인가
		int 우유 = 250;
		double 오전 = 우유 * 0.84;
		double 오후 = 우유 - 오전;
		int 갯수 = (int)오전 - (int)오후;
		System.out.println(갯수 + "개");


// # 문제4) 어느도시에 전체 인구가 400000 명인데 나이가 19세 이하 인구는 35퍼센트
// #  40세 이상인구는 25퍼센트일때
// # 19세이하인구 - 40세이상인구 수를 구하시요
		int 총인구 = 400000;
		double 나이19이하 = 총인구 * 0.35;
		double 나이40이상 = 총인구 * 0.25;
		double 인구수 = 나이19이하 - 나이40이상;
		System.out.println((int)인구수);
    }
}
