package ���蹮��1;

import java.util.Arrays;

/*
 * 
#����4
�ڿ����� ����ִ� �迭�� �ֽ��ϴ�.
 �� �迭���� ���� ���� �����ϴ� ������ ������ 
���� ���� �����ϴ� ���� ������ �� ������ ���Ϸ� �մϴ�.
 �̸� ���� ������ ���� ������ ���α׷� ������ �ۼ��߽��ϴ�.

~~~
1�ܰ�. �迭�� ����ִ� �� �ڿ����� ������ ���ϴ�.
2�ܰ�. ���� ���� �����ϴ� ���� ������ ���մϴ�.
3�ܰ�. ���� ���� �����ϴ� ���� ������ ���մϴ�.
4�ܰ�. ���� ���� �����ϴ� ���� ���� ���� �����ϴ� ������ �� �� �� ������ ���մϴ�.
~~~

��, �� �� �� ������ ���� ���� �Ҽ� �κ��� ������ ���� �κи� ���ϸ� �˴ϴ�.

�ڿ����� ����ִ� �迭 arr�� �Ű������� �־��� ��, 
���� ���� �����ϴ� ���ڰ� ���� ���� �����ϴ� ���ں��� �� �� �� ������
 return �ϵ��� solution �޼ҵ带 �ۼ��Ϸ� �մϴ�. 
�� ������ �����Ͽ� �ڵ尡 �ùٸ��� ������ �� �ֵ��� ��ĭ�� �־��� 
func_a, func_b, func_c �޼ҵ�� �Ű������� �˸°� ä���ּ���.

---
##### �Ű����� ����
�ڿ����� ����ִ� �迭 arr�� solution �޼ҵ��� �Ű������� �־����ϴ�.
* arr�� ���̴� 3 �̻� 1,000 �����Դϴ�.
* arr���� 1 �̻� 1,000������ �ڿ����� ����ֽ��ϴ�.

---
##### return �� ����
�迭���� ���� ���� �����ϴ� ���ڰ� 
���� ���� �����ϴ� ���ں��� �� �� �̻� ������ return ���ּ���.

* ���� ���� ����ִ� ���� ������ 
���� ���� ����ִ� ���� ������ ���� ��쿡�� 1�� return �մϴ�.

---
##### ����

| arr                   | return |
|-----------------------|--------|
| [1,2,3,3,1,3,3,2,3,2] | 2      |

##### ���� ����
�迭�� 1�� 2��, 2�� 3��, 3�� 5�� ����ֽ��ϴ�.

* ���� ���� ����ִ� ���� : 1 (2��)
* ���� ���� ����ִ� ���� : 3 (5��)

3�� 1���� 2.5�� ���� ���������, �Ҽ� �κ��� ������ 2�� return �ϸ� �˴ϴ�.


 */

public class Solution04 {
	
	int func_a(int[] arr) {
		int ret = 0;
		int[] temp = new int[arr.length];
		for(int i = 0; i < arr.length; i++) {
			boolean check = false;
			for(int j = 0; j < temp.length; j++) {
				if(arr[i] == temp[j]) {
					check = true;
					break;
				}
			}
			if(check == false) {
				temp[ret] = arr[i];
				ret += 1;
			}
		}
		int[] temp2 = new int[ret];
		ret = 0;
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < temp.length; j++) {
				if(arr[i] == temp[j]) {
					temp2[j] += 1;
					break;
				}
			}
		}
		Arrays.sort(temp2);
		ret = temp2[temp2.length - 1];
		System.out.println(ret);
		return ret;
	}
	int func_b(int[] arr) {
		int ret = 0;
		int[] temp = new int[arr.length];
		for(int i = 0; i < arr.length; i++) {
			boolean check = false;
			for(int j = 0; j < temp.length; j++) {
				if(arr[i] == temp[j]) {
					check = true;
					break;
				}
			}
			if(check == false) {
				temp[ret] = arr[i];
				ret += 1;
			}
		}
		int[] temp2 = new int[ret];
		ret = 0;
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < temp.length; j++) {
				if(arr[i] == temp[j]) {
					temp2[j] += 1;
					break;
				}
			}
		}
		Arrays.sort(temp2);
		ret = temp2[0];
		System.out.println(ret);
		return ret;
	}
	public int solution(int[] arr) {
		
		int maxCnt = func_a(arr);
		int minCnt = func_b(arr);
		return maxCnt / minCnt;
	}
	public static void main(String[] args) {
		Solution04 sol = new Solution04();
		int[] arr = { 1, 2, 3, 3, 1, 3, 3, 2, 3, 2 };
		int ret = sol.solution(arr);

		System.out.println("�� : " + ret + " .");
	}

}