package O0_Ŭ����_�׽�Ʈ;

import java.util.Arrays;

class Sample3{
	int arr[] = {10,20,30,40,50};
}

public class O0_11_�׽�Ʈ_Ŭ����3 {
	public static void main(String[] args) {
		int arr[] = {1,2,3,4,5};
		
		Sample3 s3 = new Sample3();
	
		Sample3 temp3 = s3;
		s3 = null;
		s3.arr = arr;
			
		//����1) ���� ������ �ּ� Ǯ�� ����
		//System.out.println(Arrays.toString(temp3.arr));
		
		//����2) ���� ������ �ּ� Ǯ�� ����
		//System.out.println(Arrays.toString(s3.arr));
		
	}
}