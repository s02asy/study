package R2_�ݷ�������;

import java.util.Arrays;
import java.util.Iterator;
import java.util.TreeSet;

public class R2_06_Ʈ���� {
	public static void main(String[] args) {

		// Ʈ������ �ߺ��� ��������ʴ´�. 
		// �׿ܴ� �Ϲ� ����Ʈ�� ����ϴ�. 
		// Ȱ��� �ַ� �˰��� �̿����� ����Ѵ�.
		
		// ����1) arr �迭�� �� ���ں����� ��� 
		
		 int arr[] = {1,2,3,4,4,3,100,2,3};
		
		
		TreeSet<Integer> numSet = new TreeSet<Integer>();
		// TreeSet�� �迭�� �ٸ��� �پ����� �ʰ� �ϳ��ϳ� �� ������ �����Ƿ� �ݺ����� ������ ����.
		// �׷��� ������� Iterator�̴�.
		for(int i = 0; i < arr.length; i++) {
			numSet.add(arr[i]);
		}
		System.out.println(numSet.size());
		
		int tempList [] = new int[numSet.size()];
		int countList[] = new int[numSet.size()];
		
		int i = 0;
		Iterator<Integer> iter = numSet.iterator();	
		while(iter.hasNext()) {
		  
		    tempList[i] = iter.next();
		    System.out.println(tempList[i] );
		    i += 1;
		}
		
		for( i = 0; i < arr.length; i++ ) {
			for(int j = 0; j < tempList.length; j++) {
				if(arr[i] == tempList[j]) {
					countList[j] += 1;
				}
			}
		}
		
		System.out.println(Arrays.toString(tempList));
		System.out.println(Arrays.toString(countList));
		
	}
}