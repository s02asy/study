package H9_�迭����1�׽�Ʈ;

public class H9_Test5 {
	public static void main(String[] args) {
	
		//�Ʒ� �迭�� ���� �� �л����̴�. 
		//������ �Ѵ�� 30���� �л��� �ÿ��ϰ� �Ҽ��ִ�. 
		//4�� �л����θ� �ÿ��ϰ� �ҷ��� �������� �� ��밡 �ʿ��Ѱ�?
		//��) 80���̸� ��3�밡 �ʿ��ϴ�.
		int arr[] = {80, 45, 33, 20};
		int student = 30;
		int ������ = 0;
		for(int i = 0; i < 4; i++) {
			������ += arr[i] / student;
			if(arr[i] % student != 0) {
				������ += 1;
			}
		}
		System.out.println("������ : " + ������ + "��");
	}
}