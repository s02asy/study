package P2_Ŭ������ȭ_level3_5_�Խ���;

public class NoticeBoardDAO {
	NoticeBoard nb[];
	int nbcnt;
	int num = 1;
	int page = 1;
	int pagecheck[];
	void init(int size) {
		pagecheck = new int[size];
		nb = new NoticeBoard[size];
		nbcnt = 0;
	}
	
	void plus(NoticeBoard board , String log) {
		nb[nbcnt] = board;
		nb[nbcnt].name = log;
		nb[nbcnt].number = nbcnt + 1;
		nb[nbcnt].pageNum = num;
		pagecheck[num - 1] = num;
		if(nb[nbcnt].number % 5 == 0) {
			num += 1;
		}
		nbcnt += 1;
	}
	
	void writecheck(int sel) {
		int index = 0;
		boolean check = false;
		for(int i = 0; i < nbcnt; i++) {
			if(sel == nb[i].number) {
				index = i;
				check = true;
			}
		}
		if(check == true) {
			System.out.println("[" + nb[index].number + "]");
			System.out.println("[���� " + nb[index].title + "]");
			System.out.println("[�ۼ��� " + nb[index].name + "]");
			nb[index].inquiry += 1;
			System.out.println("[��ȸ�� " + nb[index].inquiry + "]");
			for(int i = 0; i < nb[index].content.length(); i++) {
				System.out.print(nb[index].content.charAt(i));
				if(i > 0 && i % 30 == 0) {
					System.out.println();
				}
			}
			System.out.println();
		}else {
			System.out.println("�����Ͻ� ��ȣ�� ���� �����ϴ�.");
		}
	}
	
	void before() {
		if(page > 1) {
			page -= 1;
		}else {
			System.out.println("ù������ �Դϴ�.");
		}
	}
	
	void next() {
		try {
			if(page < nb[nbcnt - 1].pageNum) {
				page += 1;
			}else {
				System.out.println("������������ �Դϴ�.");
			}
		} catch (Exception e) {
			System.out.println("�ۼ����� ���ų� �������� �������� �ʽ��ϴ�.");
		}
	}
	
	void print() {
		for(int i = 0; i < nbcnt; i++) {
			if(page == nb[i].pageNum) {
				nb[i].boardprint();
			}
		}
		int cnt = 0;
		try {
			for(int i = 0; i < nb[nbcnt - 1].pageNum; i++) {
				if(page == pagecheck[i]) {
					System.out.print("[*]");
					cnt += 1;
				}else {
					System.out.print("[" + pagecheck[i] + "]");
					cnt += 1;
				}
			}
			if(cnt >= nb[nbcnt - 1].pageNum) {
				System.out.println();
			}
		} catch (Exception e) {
			
		}
	}
	
	void dummy(String log) {
		int index = nbcnt + 5;
		for(int i = nbcnt; i < index; i++) {
			nb[i] = new NoticeBoard();
			nb[i].number = i + 1;
			nb[i].inquiry = 0;
			nb[i].name = log;
			nb[i].content = "test";
			nb[i].title = "test";
			nb[i].pageNum = num;
			pagecheck[num - 1] = num;
			if(nb[i].number % 5 == 0) {
				num += 1; 
			}
		}
		nbcnt += 5;
	}
	
	void mycheck(String log) {
		int num = 1;
		for(int i = 0; i < nbcnt; i++) {
			if(nb[i].name.equals(log)) {
				System.out.println("[" + num + "]" + "[���� " + nb[i].title + "]" +  "[�ۼ��� " + nb[i].name + "]" + "[��ȸ�� " + nb[i].inquiry + "]");
				num += 1;
			}
		}
	}
}
