package E0_loop_�̷�;
/*
# �ݺ��� while
# ����
	1) while ==> Ű���� 
	2) (���ǽ�) ==> ������ ����̸� ��ɽ���
	3) {���}  ==> �ݺ����� if �� �ٸ���  ��������� �ٽ� while ���� 
	4) �߿� ==> �ݺ����� �ݵ�� ���� ������ �������Ѵ�. (���ѹݺ� ����)
*/

public class E0_loop1_While {
	public static void main(String[] args) {
		// ��) 1~5���� ���
		int i = 1; // �ʱ��
		while (i <= 5) { // ���ǽ�
			System.out.println(i);
			i = i + 1; 
		}	
	}
}