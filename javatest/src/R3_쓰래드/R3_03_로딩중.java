package R3_������;

class Loading extends Thread{
	
	public boolean play = true;
	public int count = 0;
	
	public void run() {
		
		while(play) {
			try {
				System.out.println();
				
				count += 1;
				System.out.print("�ε��� : ");
				for(int i = 0; i < count ;i++) {
					System.out.print("��");
				}
				if(count >= 10) {
					count = 0;
				}
				sleep(100);
			} catch (InterruptedException e) {			
				e.printStackTrace();
			}
		}
	}
}

public class R3_03_�ε��� {
	public static void main(String[] args) {	
		int num = 50000;
		
		int total = 0;
		System.out.println(num + "�� �Ҽ��� ���� ��� ");
		
		Loading  loading = new Loading();
		loading.start();
		
		for (int i = 2; i <= num; i++) {
			int count= 0;
			for(int j = 1; j <= i; j++) {
				if(i % j == 0) {
					count += 1;
				}
			}
			if(count == 2) {
			//	System.out.println("�Ҽ� : " + i);
				total += 1;
			}
		}
		loading.play = false;
		System.out.println();
		System.out.println("���� : " + total);
		
	}
}