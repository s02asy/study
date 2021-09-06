package P2_클래스심화_level3_5_게시판;

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
			System.out.println("[제목 " + nb[index].title + "]");
			System.out.println("[작성자 " + nb[index].name + "]");
			nb[index].inquiry += 1;
			System.out.println("[조회수 " + nb[index].inquiry + "]");
			for(int i = 0; i < nb[index].content.length(); i++) {
				System.out.print(nb[index].content.charAt(i));
				if(i > 0 && i % 30 == 0) {
					System.out.println();
				}
			}
			System.out.println();
		}else {
			System.out.println("선택하신 번호의 글이 없습니다.");
		}
	}
	
	void before() {
		if(page > 1) {
			page -= 1;
		}else {
			System.out.println("첫페이지 입니다.");
		}
	}
	
	void next() {
		try {
			if(page < nb[nbcnt - 1].pageNum) {
				page += 1;
			}else {
				System.out.println("마지막페이지 입니다.");
			}
		} catch (Exception e) {
			System.out.println("작성글이 없거나 페이지가 존재하지 않습니다.");
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
				System.out.println("[" + num + "]" + "[제목 " + nb[i].title + "]" +  "[작성자 " + nb[i].name + "]" + "[조회수 " + nb[i].inquiry + "]");
				num += 1;
			}
		}
	}
}
