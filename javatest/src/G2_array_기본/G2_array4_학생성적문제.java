package G2_array_�⺻;

public class G2_array4_�л��������� {

	public static void main(String[] args) {
		int[] hakbuns = {1001, 1002, 1003, 1004, 1005};
		int[] scores  = {  87,   11,   45,   98,   23};
		
		// ����) 1���л��� �й��� ���� ���
		// ����) 1004��(98��)
		int max = 0;
		int hakbun = 0;
		for(int i = 0; i < 5; i++) {
			if(max < scores[i]){
				max = scores[i];
				hakbun = i;
			}
		}
		System.out.println("1�� �л� : " + hakbuns[hakbun] + "��"+ "(" + max + "��)");

	}

}