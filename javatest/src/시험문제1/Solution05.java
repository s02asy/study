package ���蹮��1;
/*
 * #����5
�־��� �迭�� ������ ���������� �մϴ�.

���� ��� �־��� �迭�� [1, 4, 2, 3]�̸�, ������ ������ �迭�� [3, 2, 4, 1]�Դϴ�.

������ ����ִ� �迭 arr�� �Ű������� �־����� ��,
arr�� ����� return �ϵ��� solution �޼ҵ带 �ۼ��Ϸ� �մϴ�.
 ��ĭ�� ä�� ��ü �ڵ带 �ϼ����ּ���.

---
##### �Ű����� ����
������ ����ִ� �迭 arr�� solution �޼ҵ��� �Ű������� �־����ϴ�.
* arr�� ���̴� 1 �̻� 100 �����Դϴ�.
* arr�� ���Ҵ� -100 �̻� 100 ������ �����Դϴ�.

---
##### return �� ����
�迭 arr�� ������ ����� return ���ּ���.

---
##### ����

| arr          | return       |
|--------------|--------------|
| [1, 4, 2, 3] | [3, 2, 4, 1] |

##### ���� ����
[1, 4, 2, 3]�� �ڿ������� ������ 3, 2, 4, 1�Դϴ�. 
���� [1, 4, 2, 3]�� ������ ������ ����� [3, 2, 4, 1]�� �˴ϴ�.
 */

import java.util.Arrays;

public class Solution05 {

	public int[] solution(int[] arr) {
		int index = arr.length - 1;
		for(int i = 0; i < arr.length / 2; i++) {
			int temp = arr[i];
			arr[i] = arr[index];
			arr[index] = temp;
			index -= 1;
		}
		return arr;
	}

	public static void main(String[] args) {

		Solution05 sol = new Solution05();
		int[] arr = { 1, 4, 2, 3 };
		int[] ret = sol.solution(arr);

		
		System.out.println("�� : " + Arrays.toString(ret) + " .");
	}

}