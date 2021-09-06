package P2_Ŭ������ȭ_level2;

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
	String card[] = {"��","��","��","��"};
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
		System.out.println("���ӽ���");
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
			System.out.println("�÷��̾� a �¸� !!");
		}else if(p1score < p2score) {
			System.out.println("�ÿ��̾� b �¸� !!");
		}else if(p1score == p2score) {
			System.out.println("���º� !!");
		}
	}
}

public class P2_Ŭ������ȭ2_ī�����_���� {
	public static void main(String[] args) {
		// ī����� 
		// 1) ī���� : ���̾� , ��Ʈ , �����̵� , Ŭ�ι�
		// 2) ����      :  1~10
		// 3) �� 40���� �ִ�. 
		// 4) �÷��̾�� �Ű��� 40�忡�� 2�徿 �������� ���� ,
		//    �� ī���� ������ ū���� �̱��. 
		
		//  [��������] ���ڿ� ����� ������ ���� ū���� �̱��.
		//    ���ڴ� 1~10 ���̴�. 
		//    ����� ���̾� , ��Ʈ , �����̵� , Ŭ�ι�
		//    �������  1,2,3,4 ���̴�.
		// ��) �÷��̾�1 [���̾� 4] ==> 1 + 4 ==> 5��
		// ��) �÷��̾�2 [�����̵� 1] ==> 3 + 1 ==> 4�� 
		//  �÷��̾�1 �¸� 
		
		setCard1 go = new setCard1();
		go.run();
	}
}