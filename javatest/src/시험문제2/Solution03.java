package ���蹮��2;

//������ ���� import�� ����� �� �ֽ��ϴ�.
import java.util.*;

/*
 * #����3
 * ���� �ٸ� �� �ڿ��� N�� M�� �Ű������� �־��� ��, 
 * N���� M������ �ڿ��� �߿��� ¦������ ������ ���� return �ϵ��� solution �޼ҵ带 �ϼ����ּ���.
 * 
 * ---
 * #####�Ű����� ����
 * �� �ڿ��� N�� M�� solution �޼ҵ��� �Ű������� �־����ϴ�.
 * N�� M�� 1 �̻� 1,000 ������ �ڿ����̸�, N < M�� �׻� �����մϴ�.
 * 
 * --
 * #####return �� ����
 * N���� M������ �� �߿��� ¦���� ���� ������ ���� return ���ּ���.
 * 
 * ---
 * #####����
 * | N | M | return |
 * |---|---|--------|
 * | 4 | 7 | 52     |
 * 
 * #####���� ����
 * 4���� 7������ �ڿ��� �߿��� ¦���� 4�� 6�Դϴ�.
 * 
 * 4^2 + 6^2 = 16 + 36 = 52
 * ���� 52�� return �ϸ� �˴ϴ�.
 */

public class Solution03 {
    public int solution(int N, int M) {
        // ���⿡ �ڵ带 �ۼ����ּ���.
        int answer = 0;
        for(int i = N; i <= M; i++) {
        	if(i % 2 == 0) {
        		answer += i * i;
        	}
        }
        return answer;
    }
    
    // �Ʒ��� �׽�Ʈ���̽� ����� �غ��� ���� main �޼ҵ��Դϴ�.
    public static void main(String[] args) {
    	Solution03 sol = new Solution03();
        int N = 4;
        int M = 7;
        int ret = sol.solution(N, M);

        // [����] ��ư�� ������ ��� ���� �� �� �ֽ��ϴ�.  
        System.out.println("solution �޼ҵ��� ��ȯ ���� " + ret + " �Դϴ�.");
    }
}