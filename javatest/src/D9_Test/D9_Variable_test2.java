package D9_Test;

public class D9_Variable_test2 {
	public static void main(String[] args) {	
	
	// # 문제1)
	// #   운주네 반 학생은 31명입니다.
	// #   이중에서 남학생은 12명 , 여학생은 14명이 봉사할동을 하였습니다.
	// #   은주네 반에서 봉사활동을 하지않은 학생은
	// #   몇명인지 출력 
		int 학생 = 31;
		int 남 = 12;
		int 여 = 14;
		int 봉사o = 남 + 여;
		int 봉사x = 학생 - 봉사o;
		System.out.println("봉사x : " + 봉사x + "명");

	// # 문제2)
	// # 연필 7타를 여학생 2명과 남학생 4명에게 남김없이 똑같이 나누어 주었을때
	// # 한사람은 연필을 몇 자루 가지게 되는 지 출력 (연필 1타는 12자루)
		int 연필 = 12 * 7;
		 	여 = 2;
		 	남 = 4;
		 	학생 = 여 + 남;
		int 개인 = 연필 / 학생;
		System.out.println("개인당 : " + 개인 + "자루" );

	// # 문제3)
	// # 어느 공장에서 한사람이 1시간에 컴퓨터를 4대를 조립할수 있다고한다.
	// # 3명이 컴퓨터 96대를 조립혀면 몇시간이 걸리는가
		int 컴퓨터 = 96;
		int 조립 = 4;
		int 사람 = 3;
		int 조립3 = 조립 * 사람;
		int 시간 = 컴퓨터 / 조립3;
		System.out.println(시간 + "시간");

	// # 문제4)
	// # 귤 6개의 무개는 840g, 사과 3개의 무게는 750g 입니다.
	// # 귤5개와 사과 4개의 무게는 몇g인지 출력
		int 귤6 = 840;
		int 사과3 = 750;
		int 귤 = 귤6 / 6;
		int 사과 = 사과3 / 3;
		int 귤5 = 귤 * 5;
		int 사과4 = 사과 * 4;
		System.out.println("귤 5개 : " + 귤5 + "원");
		System.out.println("사과 4개 : " + 사과4 + "원");
    }
}
