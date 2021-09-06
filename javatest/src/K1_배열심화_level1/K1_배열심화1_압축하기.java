package K1_배열심화_level1;
import java.util.Arrays;
import java.util.Iterator;
import java.util.TreeSet;
public class K1_배열심화1_압축하기 {
public static void main(String[] args) {		
				
		// 위 데이터는 압축전 데이터이다.
		// 연속으로 이뤄진 데이터를 모아 압축할려고한다.
		// 예) 33 ==>  {3,2}
		// 예) 555 ==> {5,3}
		// 예) 2   ==> {2,1};
		// 예) 44  ==> {4,2};
		// 문제) 위 압축전데이터를 분석후 2차원으로 저장하시요.
		int arr[] = {3,3,5,5,5,2,2,3,3,5,5,5,4,4,4,5,4,4,4,4,6};
//		int arr2[] = new int[arr.length];
//		arr2[0] = arr[0];
//		int index1 = 0;
//		for(int i = 0; i < arr.length; i++) {
//			if(arr2[index1] != arr[i]) {
//				index1 += 1;
//				arr2[index1] = arr[i];
//			}
//		}
//		System.out.println(Arrays.toString(arr2));
//		int arr3[][] = new int[index1 + 1][2];	
//		int index2 = 0;
//		arr3[0][0] = arr[0];
//		for(int i = 0; i < arr.length; i++) {
//			if(arr3[index2][0] != arr[i]) {
//				index2 += 1;
//				arr3[index2][0] = arr[i];
//				arr3[index2][1] += 1;
//			}else {
//				arr3[index2][1] += 1;
//			}
//		}
//		for(int i = 0; i < arr3.length; i++) {
//			System.out.println(Arrays.toString(arr3[i]));
//		}
		TreeSet<Integer> tree = new TreeSet<Integer>();
		for(int i = 0; i < arr.length; i++) {
			tree.add(arr[i]);
		}
		System.out.println(tree.size());
		int arr2[] = new int[tree.size()];
		Iterator<Integer> iter = tree.iterator();
		int index = 0;
		while(iter.hasNext()) {
			arr2[index] = iter.next();
			index += 1;
		}
		System.out.println(Arrays.toString(arr2));
		int arr3[][] = new int[tree.size()][2];
		
		for(int i = 0; i < arr3.length; i++) {
			arr3[i][0] = arr2[i];
			for(int k = 0; k < arr.length; k++) {
				if(arr3[i][0] == arr[k]) {
					arr3[i][1] += 1;
				}
			}
		}
		for(int i = 0; i < arr3.length; i++) {
			System.out.println(Arrays.toString(arr3[i]));
		}
	}
}