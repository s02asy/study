package K3_�׽�Ʈ_�迭��ȭ_level1;
import java.util.Arrays;
public class a {
public static void main(String[] args) {		
				
		// �� �����ʹ� ������ �������̴�.
		// �������� �̷��� �����͸� ��� �����ҷ����Ѵ�.
		// ��) 33  ==> {3,2}
		// ��) 555 ==> {5,3}
		// ��) 2   ==> {2,1};
		// ��) 4   ==> {4,1};
		// ����) �� �����������͸� �м��� 2�������� �����Ͻÿ�.
		int arr[] = {3,3,5,5,5,3,3,3,3,2,2,3,2,4};		
		int arr2[][] = new int[7][2];		
		
		int count[]=new int [7];
		
		boolean run =true;
		int temp=0;
		int countIndex = 0;
		
		for(int i=0;i<arr.length;i++) {
			while(run) {
				temp=arr[i];
				run=false;					//�˻簪 �� �ѹ����Ѵ�.
			}
			
			if(temp==arr[i]) {
				count[countIndex]++;		//�˻簪�� ������ count[]������
			}
			
			if(temp!=arr[i]) {
				countIndex++;				
				count[countIndex]++;		//�˻簪�� �ٸ���� count[]�� �ε������� 1�ø���.
			}								//�ݺ��Ѵ�.
			
			temp=arr[i];					//�ݺ����ϴٰ� arr[i]���� ���ο� ���������� �׼��� �˻簪�̵ȴ�.
			arr2[countIndex][0]=temp;		//�̰������� arr2�� �տ����� �̸� ������ �����Ѵ�.
		}
		
		for(int i=0;i<countIndex + 1;i++) {
			arr2[i][1]=count[i];			//count[]�ǰ��� arr2�ڿ����� �ִ´�.
		}
		
		for(int i=0;i<countIndex + 1;i++) {
			System.out.println(Arrays.toString(arr2[i]));
		}
	}
}