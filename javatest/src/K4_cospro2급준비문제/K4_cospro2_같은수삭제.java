package K4_cospro2���غ���;

import java.util.Arrays;

public class K4_cospro2_���������� {
	

	public static void main(String[] args) {
		
		int input[] = {1,1,13,3,2,1,1,4,5,5,6,7,7,7,7,6,6,8,9,10,10,11,12,13,14,15};
		int a [] = new int[input.length];
		
		
		// [1] input �� �����͸� a �� ���������� �����Ѵ�.
		// [2] ��, �����ҷ��� ������ ���� ���ڰ� ���� �����ҷ��� ���� ���� ���ٸ� �Ѵ� ����
		
		// ��) input = {1,3,3,2,1,1,4}
		
		// 1  ==> a[] = {1}
		// 3  ==> a[] = {1,3}
		// 3  ==> a[] = {1,3,3} ==> {1}
		// 2  ==> a[] = {1,2}
		// 1  ==> a[] = {1,2,1}
		// 1  ==> a[] = {1,2,1,1} ==> {1,2}
		// 4  ==> a[] = {1,2,4}
		int aid = 0;
		a[0] = input[0];
		for(int i = 0; i < input.length;) {
			i += 1;
			if(i >= input.length) {
				break;
			}
			if(a[aid] == input[i]) {
				i += 1;
				a[aid] = input[i];
			}
			else {
				aid += 1;
				a[aid] = input[i];
			}
		}
		System.out.println(Arrays.toString(a));
		
		System.out.println();
		
		aid = 0;
		for(int i = 0; i < input.length;) {
			if(a[aid] != input[i]) {
				a[aid] = input[i];
			}
			i += 1;
			if(i >= input.length) {
				break;
			}
			if(a[aid] == input[i]) {
				i += 1;
				a[aid] = input[i];
			}
			else {
				aid += 1;
			}
		}
		System.out.println(Arrays.toString(a));
		
		System.out.println();
		
		aid = 0;
		int inid = 0;
		a[0] = input[0];
		while(true) {
			inid += 1;
			if(inid >= input.length) {
				break;
			}
			if(a[aid] == input[inid]) {
				inid += 1;
				a[aid] = input[inid];
			}
			else {
				aid += 1;
				a[aid] = input[inid];
			}
		}
		System.out.println(Arrays.toString(a));
	}
}