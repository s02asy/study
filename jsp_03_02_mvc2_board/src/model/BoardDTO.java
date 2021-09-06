package model;

public class BoardDTO {
	private int num;
	private String writer;
	private String email;
	private String subject;
	private String pw;
	private String content;
	private String regDate;
	private int ref;
	private int reStep;
	private int reLevel;
	private int readCount;
	
	public BoardDTO(){}
	public BoardDTO(String writer, String email, String subject, String pw, String content, String regDate) {
		this.writer = writer;
		this.email = email;
		this.subject = subject;
		this.pw = pw;
		this.content = content;
		this.regDate = regDate;
	}
	public BoardDTO(int num, String writer, String email, String subject, String pw, String content, String regDate, int ref, int reStep, int reLevel) {
		this.num = num;
		this.writer = writer;
		this.email = email;
		this.subject = subject;
		this.pw = pw;
		this.content = content;
		this.regDate = regDate;
		this.ref = ref;
		this.reStep = reStep;
		this.reLevel = reLevel;
	}
	
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
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getSubject() {
		return subject;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}
	public String getPw() {
		return pw;
	}
	public void setPw(String pw) {
		this.pw = pw;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public String getRegDate() {
		return regDate;
	}
	public void setRegDate(String regDate) {
		this.regDate = regDate;
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
	public int getReadCount() {
		return readCount;
	}
	public void setReadCount(int readCount) {
		this.readCount = readCount;
	}
}
