package board;

public class Board {
	private int num;					// 게시글 번호
	private String writer;				// 게시글 작성자
	private String title;				// 게시글 제목	
	private String regDate;				// 게시글 작성일
	private int readCount;				// 게시글 조회 수
	private int ref;					
	private int reStep;
	private int reLevel;
	private String content;				// 게시글 내용
	private boolean removeCheck;
	
	
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}
	public String getWriter() {
		return writer;
	}
	public void setWriter(String writer) {
		this.writer = writer;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}	
	public String getRegDate() {
		return regDate;
	}
	public void setRegDate(String regDate) {
		this.regDate = regDate;
	}
	public int getReadCount() {
		return readCount;
	}
	public void setReadCount(int readCount) {
		this.readCount = readCount;
	}
	public int getRef() {
		return ref;
	}
	public void setRef(int ref) {
		this.ref = ref;
	}
	public int getReStep() {
		return reStep;
	}
	public void setReStep(int reStep) {
		this.reStep = reStep;
	}
	public int getReLevel() {
		return reLevel;
	}
	public void setReLevel(int reLevel) {
		this.reLevel = reLevel;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	
	public boolean isRemoveCheck() {
		return removeCheck;
	}
	public void setRemoveCheck(boolean removeCheck) {
		this.removeCheck = removeCheck;
	}
	
	
	@Override
	public String toString() {
		String print = String.format(
				"[%5d] [%10s] [%10s] [%10s] [%5d] [%5d] [%5d] [%5d] [%s]",
			     num  , writer , title , regDate , readCount , ref , reStep , reLevel , content);
		return print;
	}	
}
