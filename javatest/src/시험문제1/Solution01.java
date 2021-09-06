package ���蹮��1;
/*
 * #����1
A �б������� ��ü Ƽ������ �ֹ��ϱ� ���� �л����� ���ϴ� Ƽ���� ����� �����߽��ϴ�. 
������ �� �ִ� Ƽ���� ������� ���� �������
 "XS", "S", "M", "L", "XL", "XXL" �� 6������ �ֽ��ϴ�.

�л����� ���ϴ� Ƽ���� ����� ������ ����� ����ִ� 
�迭 shirtSize�� �Ű������� �־��� ��,
 ������� Ƽ������ �� ���� �ʿ����� ���� ���� ��������� ������� �迭�� ���
 return �ϵ��� solution �޼ҵ带 �ϼ����ּ���.

---
##### �Ű����� ����
�л����� ���ϴ� ����� ������ ����� ����ִ� �迭
 shirtSize�� solution �޼ҵ��� �Ű������� �־����ϴ�.
* shirtSize �� ���̴� 1 �̻� 100 �����Դϴ�.
* shirtSize ���� ġ���� ��Ÿ���� ���ڿ� "XS", "S", "M", "L", "XL", "XXL" �� ����ֽ��ϴ�.

---
##### return �� ����
Ƽ������ ������� �� ���� �ʿ����� 
���� ���� ��������� ������� �迭�� ��� return ���ּ���.
* return �ϴ� �迭���� [ "XS" ����, "S" ����, "M" ����, "L" ����, "XL" ����, "XXL" ����]
 ������ ����־�� �մϴ�.

---
##### ����

| shirtSize                       | return        |
|----------------------------------|---------------|
| ["XS", "S", "L", "L", "XL", "S"] | [1, 2, 0, 2, 1, 0] |

##### ���� ����
* "XS"�� "XL"�� ���� �� �� ��û�߽��ϴ�.
* "S"�� "L"�� ���� �� �� ��û�߽��ϴ�.
* "M"�� "XXL"�� ��û�� �л��� �����ϴ�.

���� ������� [1, 2, 0, 2, 1, 0]�� �迭�� ��� return �ϸ� �˴ϴ�.

 */

import java.util.Arrays;

public class Solution01 {

	/*
	 * ##### ���� ���� 
	 * "XS"�� "XL"�� ���� �Ѹ� ��û�߽��ϴ�.
	 * "S"�� "L"�� ���� �� �� ��û�߽��ϴ�.
	 * "M"�� "XXL"�� ��û�� �л��� �����ϴ�.
	 */
	public int[] solution(String[] shirtSize) {
		int[] answer = {};
		int size = shirtSize.length;
		answer = new int[size];
		for(int i = 0; i < size; i++) {
			if(shirtSize[i].equals("XS")) {
				answer[0] += 1;
			}else if(shirtSize[i].equals("S")) {
				answer[1] += 1;
			}else if(shirtSize[i].equals("M")) {
				answer[2] += 1;
			}else if(shirtSize[i].equals("L")) {
				answer[3] += 1;
			}else if(shirtSize[i].equals("XL")) {
				answer[4] += 1;
			}else if(shirtSize[i].equals("XXL")) {
				answer[5] += 1;
			}
		}
		return answer;
	}

	public static void main(String[] args) {
		Solution01 sol = new Solution01();
		String[] shirtSize = { "XS", "S", "L", "L", "XL", "S" };
		int[] ret = sol.solution(shirtSize);
		System.out.println("��: " + Arrays.toString(ret) + " .");
	}

}