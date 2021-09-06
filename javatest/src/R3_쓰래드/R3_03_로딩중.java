package R3_쓰래드;

class Loading extends Thread{
	
	public boolean play = true;
	public int count = 0;
	
	public void run() {
		
		while(play) {
			try {
				System.out.println();
				
				count += 1;
				System.out.print("로딩중 : ");
				for(int i = 0; i < count ;i++) {
					System.out.print("ㅁ");
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

public class R3_03_로딩중 {
	public static void main(String[] args) {	
		int num = 50000;
		
		int total = 0;
		System.out.println(num + "의 소수의 개수 출력 ");
		
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
			//	System.out.println("소수 : " + i);
				total += 1;
			}
		}
		loading.play = false;
		System.out.println();
		System.out.println("총합 : " + total);
		
	}
}