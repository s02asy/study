package R3_������;
class StopWatch extends Thread{
	public String timeText;
	public long time = 0l; 
	public long preTime = 0l;	
	public boolean play = true;
	//Thread Ŭ�����ȿ� �ִ� �޼��� 
	public void run() {
		// ����ð� �ʷκ�ȯ�� �� 
		preTime = System.currentTimeMillis();
		while(play ) {
			try {
				sleep(10);
				time = System.currentTimeMillis() - preTime;
				int m = (int)(time / 1000.0 / 60.0);
				int s = (int)(time % (1000.0 * 60) / 1000.0);
				int ms = (int)(time % 1000 / 10.0);
				System.out.println(m + " : " + s  + " "+ ms);				
			} catch (InterruptedException e) {			
				e.printStackTrace();
			}
		}
	}
}
public class R3_02_��ž��ġ {
	public static void main(String[] args) {	
		StopWatch st = new StopWatch();
		st.start();
	}


}