package ���蹮��1;

/*
#����6
369 ������ ���� ���� �����ϴ� �����Դϴ�. ������ ��Ģ�� �Ʒ��� �����ϴ�.
* 1���� �����մϴ�.
* �� ����� ���ʴ�� ���ڸ� 1�� ���ذ��� ���մϴ�.
* ���ؾ� �ϴ� ���ڿ� 3, 6, 9�� �ϳ��� ���ԵǾ��ִٸ� ���ڸ� ���ϴ� ��� ���ڿ� ���Ե� 
3, 6, 9�� ������ŭ �ջ��� Ĩ�ϴ�.

� �� number�� �Ű������� �־��� ��, 1���� number���� 369������ �ùٸ��� �������� ��� �ڼ��� 
�� �� �� �ƴ����� return �ϵ��� solution �޼ҵ带 �ۼ��Ϸ� �մϴ�. ��ĭ�� ä�� ��ü �ڵ带 �ϼ����ּ���.

---

#####�Ű����� ����
number�� solution �޼ҵ��� �Ű������� �־����ϴ�.
* number�� 10 �̻� 1,000 ������ �ڿ����Դϴ�.

---

#####return �� ����
1���� number���� 369������ �ùٸ��� �������� ��� �ڼ��� �� �� ���� �ƴ��� return ���ּ���.

---

#####����

| number | return |
|--------|--------|
| 40     | 22     |

#####���� ����
3, 6, 9 : ���� �� �� (+3)
13, 16, 19 : ���� �� �� (+3)
23, 26, 29 : ���� �� �� (+3)
30, 31, 32, 33, ..., 38, 39 : ���� �ڸ� �� �� + ���� �ڸ� �� �� (+13)
����, 3 + 3 + 3 + 13 = 22���� �ڼ��� Ĩ�ϴ�.
 */

public class Solution06 {
	
	public int solution(int number) {
        int count = 0;
        for (int i = 1; i <= number; i++) {
            int current = i;
            int temp = count;
            while (current != 0) {
                if (current % 10 == 3 || current % 10 == 6 || current % 10 == 9){
                    count++;
                    System.out.print("pair");
                }
                current /= 10;
            }
            if(temp == count)
                System.out.print(i);
            System.out.print(" ");
        }
        System.out.println();
        return count;
    }
	
	   // The following is main method to output testcase.
    public static void main(String[] args) {
        Solution06 sol = new Solution06();
        int number = 40;
        int ret = sol.solution(number);

        // Press Run button to receive output.
        System.out.println("Solution: return value of the method is " + ret + " .");
    }
}