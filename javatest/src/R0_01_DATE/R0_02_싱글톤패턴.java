package R0_01_DATE;

class MySingleTonDAO {
	private MySingleTonDAO() {
		// �����ڸ� private ��ٴ�.
		// �̷��� �ϸ� new �� �Ҽ�����.
	}

	// ���ο��� new �� �ϰ� private ��ٴ�.
	static private MySingleTonDAO instance = new MySingleTonDAO();

	// public ���� get�� ����� Ŭ������ �Ѱ��̻� ������� ����.
	static public MySingleTonDAO getInstance() {
		return instance;
	}
}

public class R0_02_�̱������� {
	// �̱��� �����̶�
	// ���� DAO Ŭ�������� static �� �̿��� ���ϰ� ���������
	// ��� ������ �Լ��� static �� �ٿ��߸��ߴ�.
	// class ��ü�� static �� ���̸� ��������
	// calss ���� static �� ���ϼ����⶧���� (����������)
	// �׿� ������ ���·� ��ġ class �� ���ΰſͰ���ȿ���� ����.

	// === ����¹� ===
	// 1) �����ڸ� private ���� ����� . �׷��� new ���Ҽ�����.
	// 2) ���ο��� new �� �Ѵ�. static �ʿ�
	// 3) public �� get�Լ����� �����Ѵ�. static �ʿ�
	public static void main(String[] args) {
		// MySingleTon test = new MySingleTon();// ����������.
		MySingleTonDAO dao = MySingleTonDAO.getInstance();
	}
}