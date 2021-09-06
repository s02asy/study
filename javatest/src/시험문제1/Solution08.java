package ���蹮��1;
/*
 * #����8
�տ������� ���� ���� �ڿ������� ���� �� �Ȱ��� �ܾ� �Ǵ� ������ 
�Ӹ����(palindrome)�̶�� �մϴ�. ���� �� racecar, noon�� �Ӹ���� �ܾ��Դϴ�. 

�ҹ��� ���ĺ�, ����(" "), �׸��� ��ħǥ(".")�� �̷���� ������ 
�Ӹ���� �������� �����Ϸ� �մϴ�. ���� ������ ���ĺ��� 
�����Ͽ��� ���� �Ӹ���� �ܾ��̸� �Ӹ���� �����Դϴ�.
 ���� ���, "Never odd or even."�� ���� ������ �Ӹ�����Դϴ�.

�ҹ��� ���ĺ�, ����(" "), �׸��� ��ħǥ(".")�� �̷���� ����
 sentence�� �־��� �� �Ӹ�������� �ƴ����� return �ϵ��� solution �޼ҵ带 �ۼ��߽��ϴ�.
 �׷���, �ڵ� �Ϻκ��� �߸��Ǿ��ֱ� ������, ��� �Է¿� ���ؼ��� �ùٸ��� �������� �ʽ��ϴ�.
 �־��� �ڵ忡�� _**�� ��**_�� �����ؼ� ��� �Է¿� ���� �ùٸ��� �����ϵ��� �������ּ���.

---
##### �Ű����� ����
�ҹ��� ���ĺ�, ����(" "), �׸��� ��ħǥ(".")�� �̷���� ����
 sentence�� solution �޼ҵ��� �Ű������� �־����ϴ�.

* sentence�� ���̴� 1�̻� 100�����Դϴ�.
* sentence���� ��� �ϳ��� ���ĺ��� ���ԵǾ� �ֽ��ϴ�.
* setntence�� �� ���ڴ� �ҹ��� ���ĺ�, ����(" "), �Ǵ� ��ħǥ(".")�Դϴ�.

---
##### return �� ����
�־��� ������ �Ӹ�������� �ƴ����� return ���ּ���.

---
##### ����

| sentence             	| return 	|
|----------------------	|--------	|
| "never odd or even." 	| true   	|
| "palindrome"         	| false  	|


##### ���� ����
���� #1
���ĺ��� ���ڸ� �����Ͽ� �ҹ��ڷ� ��ȯ�غ��� "neveroddoreven"�� �Ǹ� �� �ܾ�� �Ӹ�����Դϴ�.

���� #2
������ �� �� ������ "p"�� �� �� ������ "e"�� �ٸ��Ƿ� �Ӹ������ �ƴմϴ�.


 */

public class Solution08 {
	boolean solution(String sentence) {
		String str = "";
		str = sentence.replaceAll(" ", "");
		System.out.println(str);
		str = str.replace(".", "");
		System.out.println(str);
		int index = str.length() - 1;
		for(int i = 0; i < str.length() / 2; i++) {
			if(str.charAt(i) != str.charAt(index)) {
				return false;
			}
			index -= 1;
		}
		return true;
	}

	public static void main(String[] args) {
		Solution08 sol = new Solution08();
		String sentence1 = "never odd or even.";
		boolean ret1 = sol.solution(sentence1);
		System.out.println("�� : " + ret1 + " .");

		String sentence2 = "palindrome";
		boolean ret2 = sol.solution(sentence2);
		System.out.println("�� : " + ret2 + " .");
	}

}