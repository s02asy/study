package ���蹮��2;

/*
 * #����2
 * �ڿ����� ����ִ� �迭�� 
 * 3�� ����� 5�� ��� �� � ���� �� ������ �˾ƺ��� �մϴ�. 
 * �̸� ���� ������ ���� ���α׷� ������ �ۼ��߽��ϴ�.
 * 
 * ~~~
 * 1. 3�� ����� ������ ���ϴ�.
 * 2. 5�� ����� ������ ���ϴ�.
 * 3. 3�� ����� 5�� ����� ������ �� �� ������ �����մϴ�.
 * 3-1. ���� 3�� ����� �� ���ٸ� "three"�� return �մϴ�.
 * 3-2. ���� 5�� ����� �� ���ٸ� "five"�� return �մϴ�.
 * 3-3. ���� 3�� ����� 5�� ����� ������ ���ٸ� "same"�� return �մϴ�.
 * ~~~
 * 
 * �ڿ����� ����ִ� �迭 arr�� �Ű������� �־��� ��, 
 * �迭�� 3�� ����� ������ �� ���ٸ� "three"��, 
 * 5�� ����� ������ �� ���ٸ� "five"��, 
 * 3�� ����� 5�� ����� ������ ���ٸ� "same"�� return �ϵ��� solution �޼ҵ带 �ۼ��Ϸ� �մϴ�. 
 * �� ������ �����Ͽ� �ڵ尡 �ùٸ��� ������ �� �ֵ��� 
 * ��ĭ�� �־��� func_a, func_b, func_c �޼ҵ�� �Ű������� �˸°� ä���ּ���.
 * 
 * ---
 * #####�Ű����� ����
 * �ڿ����� ����ִ� �迭 arr�� solution �޼ҵ��� �Ű������� �־����ϴ�.
* arr�� ���̴� 1 �̻� 100 �����Դϴ�.
* arr�� ����ִ� ���ڴ� 1 �̻� 1,000 ������ �ڿ����Դϴ�.
* 
* ---
* #####return �� ����
* �迭�� 3�� ����� ������ �� ���ٸ� "three"��, 
* 5�� ����� ������ �� ���ٸ� "five"��, 
* 3�� ����� 5�� ����� ������ ���ٸ� "same"�� return ���ּ���.
* ---
* #####����
* | arr                    				 | return  |
* |--------------------------------------|---------|
* | [2, 3, 6, 9, 12, 15, 10, 20, 22, 25] | "three" |
* 
* #####���� ����
* 3�� ��� : 3, 6, 9, 12, 15
* 5�� ��� : 10, 15, 20, 25
* 
* 3�� ����� 5��, 5�� ����� 4���̹Ƿ� 3�� ����� �� �����ϴ�. 
* ���� "three"�� return �մϴ�.
 */

public class Solution02 {
	
    public int func_a(int[] arr){
        int count = 0;
        for(int i = 0; i < arr.length; ++i)
            if (arr[i] % 5 == 0)
                count += 1;
        return count;
    }
    
    public String func_b(int three, int five){
        if (three > five)
            return "three";
        else if (three < five)
            return "five";
        else
            return "same";
    }
    
    public int func_c(int[] arr){
        int count = 0;
        for(int i = 0; i < arr.length; ++i)
            if (arr[i] % 3 == 0)
                count += 1;
        return count;
    }

    public String solution(int[] arr) {
        int countThree = func_c(arr);
        int countFive = func_a(arr);
        String answer = func_b(countThree,countFive);
        return answer;
    }

    // �Ʒ��� �׽�Ʈ���̽� ����� �غ��� ���� main �޼ҵ��Դϴ�.
    public static void main(String[] args) {
    	Solution02 sol = new Solution02();
        int[] arr = {2, 3, 6, 9, 12, 15, 10, 20, 22, 25};
        String ret = sol.solution(arr);

        // [����] ��ư�� ������ ��� ���� �� �� �ֽ��ϴ�.
        System.out.println("solution �޼ҵ��� ��ȯ ���� " + ret + " �Դϴ�.");
    }
}