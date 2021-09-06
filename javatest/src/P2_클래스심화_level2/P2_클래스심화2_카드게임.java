package P2_Ŭ������ȭ_level2;

import java.util.Random;

class Card{
	String shape;
	int number;
	void printCard() {
		String data = shape + " : " + number;
		System.out.printf("%-10s", data);
		System.out.println();
	}
	
}
class CardPlayer{
	Card card1;
	Card card2;
	int money = 1000;
}

class CardGame{
	
	Random ran = new Random();
	CardPlayer aaa = new CardPlayer();
	CardPlayer bbb = new CardPlayer();
	String shapeList[] = {"���̾�" , "��Ʈ" , "�����̵�" , "Ŭ�ι�"};
	int size= 40;
	Card deck[] = new Card[size];
	
	void setting() {
		for(int i = 0; i <size; i++) {
			deck[i] = new Card();
			deck[i].shape = shapeList[i/10];
			deck[i].number = i % 10 + 1;
		}		
		
		for(int i = 0; i < 40; i++) {
			deck[i].printCard();
		}
	}
	
	void shuffle() {
		for(int i = 0; i < 1000; i++) {
			int r = ran.nextInt(size);
			Card temp = deck[0];
			deck[0] = deck[r];
			deck[r] = temp;
		}
	}
	
	void run() {
		setting();
		shuffle();
		// ����		
		System.out.println("[���ӽ���]");
		aaa.card1 = deck[0];
		aaa.card2 = deck[1];	
		bbb.card1 = deck[2];
		bbb.card2 = deck[3];
		aaa.card1.printCard();
		aaa.card2.printCard();	
		bbb.card1.printCard();
		bbb.card2.printCard();		
	}
}

public class P2_Ŭ������ȭ2_ī����� {
	public static void main(String[] args) {
	
		CardGame cg = new CardGame();
		cg.run();
		
	}
}