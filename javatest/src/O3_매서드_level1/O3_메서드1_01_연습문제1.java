package O3_�ż���_level1;

class Test1 {
	void printEvenOrOdd(int x) {
		if(x % 2 == 0) {
			System.out.println("¦��");
		}else if(x % 2 == 1) {
			System.out.println("Ȧ��");
		}
	}
	void sumBetweenValues(int x, int y) {
		int total = 0;
		for(int i = x; i <= y; i++) {
			total += i;
		}
		System.out.println(total);
	}

	void printPrimeNums(int primeNumber) {
		for(int i = 2; i <= primeNumber; i++) {
			int cnt = 0;
			for(int j = 1; j < i; j++) {
				if(i % j == 0) {
					cnt += 1;
				}
			}
			if(cnt == 2) {
				System.out.println(i + "�� �Ҽ��̴�.");
			}
		}
	}
}

public class O3_�޼���1_01_��������1 {
	public static void main(String[] args) {
		Test1 test = new Test1();
		// ���� 1) a �� Ȧ������ ¦������ ��� 
		int a = 19;
		test.printEvenOrOdd(a);

		// ���� 2) x���� y������ ���� ����ϴ� �޼���
		int x = 1;
		int y = 10;
		test.sumBetweenValues(x, y);

		// ����3) ���� 1���� ���ڷ� ����ؼ� 2���� ���ڱ����� �Ҽ� ���� ��� 
		int primeNumber = 20;
		test.printPrimeNums(primeNumber);
		
	
	}
}