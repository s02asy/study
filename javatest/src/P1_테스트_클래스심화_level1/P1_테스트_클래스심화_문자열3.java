package P1_�׽�Ʈ_Ŭ������ȭ_level1;

class Member{
	int no;
	int point;
	String name;
	boolean best;
	
	void print() {
		System.out.print(no + " ");
		System.out.print(point + " ");
		System.out.print(name + " ");
		System.out.println(best);
	}
}
public class P1_�׽�Ʈ_Ŭ������ȭ_���ڿ�3 {
	public static void main(String[] args) {
		
		String data1 = "1001/3,1002/1,1001/3,1003/5,1004/1,1002/2";
		String data2 = "1001/�̸���,1002/��ö��,1003/�Źξ�,1004/�ڻ��";
		
		// data1 �� �����ȣ�� �ǸŽ����̴�.
		// data2 �� �����ȣ�� �̸��̴�.
		// �ǸŽ����� 4�̻��λ���� best�� true�� �����ϼ���.
		
		// �������͸� ������ Member Ŭ���� �迭�� �ϼ��� ����غ�����.
		Member[] memberList = null;
		String token1[] = data1.split(",");
		String token2[] = data2.split(",");
		int size1 = token1.length;
		int size2 = token2.length;
		memberList = new Member[size2];
		for(int i = 0; i < size2; i++) {
			String token3[] = token2[i].split("/");
			memberList[i] = new Member();
			memberList[i].no = Integer.parseInt(token3[0]);
			memberList[i].name = token3[1];
		}
		for(int i = 0; i < size1; i++) {
			String token3[] = token1[i].split("/");
			for(int j = 0; j < size2; j++) {
				if(memberList[j].no == Integer.parseInt(token3[0])) {
					memberList[j].point += Integer.parseInt(token3[1]);
				}
				if(memberList[j].point >= 4) {
					memberList[j].best = true;
				}
			}
		}
		for(int i = 0; i < size2; i++) {
			memberList[i].print();
		}
	}
}