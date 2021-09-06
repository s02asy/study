package ���蹮��1;
/*
 * #����9
���ĺ� ���ڿ��� �־��� ��, �����ϴ� �ߺ� ���ڸ� �����Ϸ��� �մϴ�. 
���� ���, "senteeeencccccceeee"��� ���ڿ��� �־����ٸ�, "sentence"��� ������� ���ɴϴ�.

���� �ҹ��� ���ĺ����� �̷���� ������ ���ڿ� characters�� �Ű������� �־��� ��, 
�����ϴ� �ߺ� ���ڵ��� ������ ����� return �ϵ��� solution �޼ҵ带 �ۼ��Ͽ����ϴ�. 
�׷���, �ڵ� �Ϻκ��� �߸��Ǿ��ֱ� ������, �ڵ尡 �ùٸ��� �������� �ʽ��ϴ�.
 �־��� �ڵ忡�� _**�� ��**_�� �����ؼ� ��� �Է¿� ���� �ùٸ��� �����ϵ��� �����ϼ���.

---

#####�Ű����� ����
���� �ҹ��� ���ĺ����� �̷���� ������
 ���ڿ� characters�� solution �޼ҵ��� �Ű������� �־����ϴ�. 
* characters�� ���ĺ� �ҹ��ڷθ� �̷�����ֽ��ϴ�.
* characters�� ���̴� 10 �̻� 100 �����Դϴ�.

---

#####return �� ����
characters���� �����ϴ� �ߺ� ���ڸ� ������ ���ڿ��� return ���ּ���.

---

#####����

| characters                  | return    |
|-------------------------|-----------|
| "senteeeencccccceeee" | "sentence" |

 */

public class Solution09 {
    public String solution(String characters){
        String result = "";
        result += characters.charAt(0);
        int index = 0;
        for(int i = 0; i < characters.length(); i++) {
        	if(result.charAt(index) != characters.charAt(i)) {
        		result += characters.charAt(i);
        		index += 1;
        	}
        }
        return result;
    }

    // The following is main method to output testcase. 
    // The main method is correct and you shall correct solution method.
    public static void main(String[] args) {
    	Solution09 sol = new Solution09();
        String characters = "senteeeencccccceeee";
        String ret = sol.solution(characters);

        // Press Run button to receive output.
        System.out.println("Solution: return value of the method is " + ret + " .");
    }
}