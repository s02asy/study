package P2_클래스심화_level2;

import java.util.Random;


class card1{
	String shape;
	int number;
	int score;
	void printCard() {
		String data = shape + " : " + number;
		System.out.printf("%-10s", data);
		System.out.println("score : " + (score + number));
		System.out.println();
	}
}
class cardplayer1{
	card1 card1;
	card1 card2;
}
class setCard1{
	Random ran = new Random();
	cardplayer1 a = new cardplayer1();
	cardplayer1 b = new cardplayer1();
	String card[] = {"◆","♥","♣","♠"};
	int size = 40;
	card1 deck[] = new card1[size];
	
	void set() {
		for(int i = 0; i < size; i++) {
			deck[i] = new card1();
			deck[i].shape = card[i / 10];
			deck[i].number = i % 10 + 1;
			deck[i].score = i / 10 + 1;
		}
		for(int i = 0; i < size; i++) {
			deck[i].printCard();
		}
	}
	
	void suf() {
		for(int i = 0; i < 1000; i++) {
			int r = ran.nextInt(size);
			card1 temp = deck[0];
			deck[0] = deck[r];
			deck[r] = temp;
		}
	}
	
	void run() {
		set();
		suf();
		System.out.println("게임시작");
		a.card1 = deck[0];
		a.card2 = deck[1];
		b.card1 = deck[2];
		b.card2 = deck[3];
		a.card1.printCard();
		a.card2.printCard();
		b.card1.printCard();
		b.card2.printCard();
		int p1score = (deck[0].number + deck[0].score) + (deck[1].number + deck[1].score);
		int p2score = (deck[2].number + deck[2].score) + (deck[3].number + deck[3].score);
		if(p1score > p2score) {
			System.out.println("플레이어 a 승리 !!");
		}else if(p1score < p2score) {
			System.out.println("플에이어 b 승리 !!");
		}else if(p1score == p2score) {
			System.out.println("무승부 !!");
		}
	}
}

public class P2_클래스심화2_카드게임_문제 {
	public static void main(String[] args) {
		// 카드게임 
		// 1) 카드모양 : 다이아 , 하트 , 스페이드 , 클로버
		// 2) 숫자      :  1~10
		// 3) 총 40장이 있다. 
		// 4) 플레이어는 매게임 40장에서 2장씩 나눠갖은 다음 ,
		//    각 카드의 점수가 큰쪽이 이긴다. 
		
		//  [점수계산법] 숫자와 모양의 점수의 합이 큰쪽이 이긴다.
		//    숫자는 1~10 점이다. 
		//    모양은 다이아 , 하트 , 스페이드 , 클로버
		//    순서대로  1,2,3,4 점이다.
		// 예) 플레이어1 [다이아 4] ==> 1 + 4 ==> 5점
		// 예) 플레이어2 [스페이드 1] ==> 3 + 1 ==> 4점 
		//  플레이어1 승리 
		
		setCard1 go = new setCard1();
		go.run();
	}
}