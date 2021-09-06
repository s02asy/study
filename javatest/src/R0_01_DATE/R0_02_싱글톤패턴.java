package R0_01_DATE;

class MySingleTonDAO {
	private MySingleTonDAO() {
		// 생성자를 private 잠근다.
		// 이렇게 하면 new 를 할수없다.
	}

	// 내부에서 new 를 하고 private 잠근다.
	static private MySingleTonDAO instance = new MySingleTonDAO();

	// public 으로 get만 만들면 클래스를 한개이상 만들수가 없다.
	static public MySingleTonDAO getInstance() {
		return instance;
	}
}

public class R0_02_싱글톤패턴 {
	// 싱글톤 패턴이란
	// 과거 DAO 클래스들이 static 을 이용해 편리하게 사용했으나
	// 모든 변수와 함수에 static 을 붙여야만했다.
	// class 자체에 static 을 붙이면 좋겠지만
	// calss 에는 static 을 붙일수없기때문에 (문법적으로)
	// 그와 유사한 형태로 마치 class 에 붙인거와같은효과가 난다.

	// === 만드는법 ===
	// 1) 생성자를 private 으로 만든다 . 그러면 new 를할수없다.
	// 2) 내부에서 new 를 한다. static 필요
	// 3) public 을 get함수에만 적용한다. static 필요
	public static void main(String[] args) {
		// MySingleTon test = new MySingleTon();// 에러가난다.
		MySingleTonDAO dao = MySingleTonDAO.getInstance();
	}
}