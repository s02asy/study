package K1_�迭��ȭ_level1;
import java.util.Arrays;
public class K1_�迭��ȭ1_�����ϱ����� {
public static void main(String[] args) {		
				
		// �� �����ʹ� ������ �������̴�.
		// �������� �̷��� �����͸� ��� �����ҷ����Ѵ�.
		// ��) 33 ==>  {3,2}
		// ��) 555 ==> {5,3}
		// ��) 2   ==> {2,1};
		// ��) 44  ==> {4,2};
		// ����) �� �����������͸� �м��� 2�������� �����Ͻÿ�.
		int arr[] = {3,3,5,5,5,2,4};		
		int arr2[][] = new int[4][2];		
		int temp = arr[0];
		int arr2index = 0;
		arr2[arr2index][0] = temp;
		int count = 0;
		for(int i = 0; i < arr.length; i++) {		
			if(temp != arr[i]) {
				arr2[arr2index][1] = count;
				temp = arr[i];
				arr2index += 1;
				arr2[arr2index][0] = temp;
				count = 1;
			}else {
				count += 1;
			}
		}
		if(count >= 1) {
			arr2[arr2index][1] = count;
		}
		
		for(int i = 0; i < arr2.length; i++) {
			System.out.println(Arrays.toString(arr2[i]));
		}	
	}
}