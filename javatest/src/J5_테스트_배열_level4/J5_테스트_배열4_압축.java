package J5_�׽�Ʈ_�迭_level4;

import java.util.Arrays;

public class J5_�׽�Ʈ_�迭4_���� {
	public static void main(String[] args) {
		 int arr[] = {1,1,1,3,3,3,3,2,2,3,3,3,4,5};		 
		 int b [] = new int[14];
		 
		 // arr�� �ߺ��Ǵ� ���ڴ� �����ϰ� ���� 1������ �����ؼ� b�� �����ҷ��� �Ѵ�.
		 // ��) b[] = {1,3,2,3,4,5}
		 
		 // �����غ�����~
		 
		 b[0] = arr[0];
		 int bindex = 0;
		 for(int i = 0; i < arr.length; i++) {
			 if(arr[i] != b[bindex]) {
				 bindex += 1;
				 b[bindex] = arr[i];
			 }
		 }
		 int c[] = new int[bindex + 1];
		 for(int i = 0; i < bindex + 1; i++) {
			 c[i] = b[i];
		 }
		 System.out.println(Arrays.toString(c));
	}
}