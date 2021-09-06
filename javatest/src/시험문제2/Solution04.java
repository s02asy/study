package ���蹮��2;

//������ ���� import�� ����� �� �ֽ��ϴ�.
import java.util.*;

/*
 * #����4
 * �ܾ���� ����ִ� �迭���� ���̰� 5 �̻��� �ܾ �迭�� ����ִ� ������� �̾� ���̷� �մϴ�.
 * 
 * ���� ��� �迭�� ������ ���� ���
 * ["my", "favorite", "color", "is", "violet"]
 * "favoritecolorviolet"�� ����� �˴ϴ�.
 * �ܾ���� ����ִ� �迭 words�� solution �޼ҵ��� �Ű������� �־��� ��, 
 * ���̰� 5 �̻��� �ܾ ������� �̾� ���� ���ڿ��� return �ϵ��� solution �޼ҵ带 �ϼ����ּ���.
 * 
 * ---
 * #####�Ű����� ����
 * �ܾ���� ����ִ� �迭 words�� solution �޼ҵ��� �Ű������� �־����ϴ�.
 * 
 * words�� ���̴� 1 �̻� 100 �����Դϴ�.
 * words�� ����ִ� �� �ܾ��� ���̴� 1 �̻� 10 �����̸�, ���ĺ� �ҹ��ڷθ� �̷���� �ֽ��ϴ�.
 * 
 * ---
 * #####return �� ����
 * ���̰� 5 �̻��� �ܾ ������� �̾� �ٿ� return ���ּ���.
 * ���� return �� ���ڿ��� �� ���ڿ��̸� "empty"�� return ���ּ���.
 * 
 * ---
 * #####����
 * 
 * | words                                       | return                |
 * |---------------------------------------------|-----------------------|
 * | ["my", "favorite", "color", "is", "violet"] | "favoritecolorviolet" |
 * | ["yes", "i", "am"]                          | "empty"               |
 * 
 * #####���� ����
 * ���� #1
 * ���̰� 5 �̻��� �ܾ�� "favorite", "color", "violet" �Դϴ�. 
 * �̸� �迭�� ����ִ� ������� �̾� ���̸� "favoritecolorviolet"�� �˴ϴ�.
 * 
 * ���� #2
 * ���̰� 5 �̻��� �ܾ �����Ƿ� "empty"�� return �ϸ� �˴ϴ�.
 */

public class Solution04 {
    public String solution(String[] words) {
        // ���⿡ �ڵ带 �ۼ����ּ���.
        String answer = "";
        for(int i = 0; i < words.length; i++) {
        	if(words[i].length() >= 5) {
        		answer += words[i];
        	}
        }
        if(answer.equals("")) {
        	answer = "empty";
        }
        return answer;
    }
    
    // �Ʒ��� �׽�Ʈ���̽� ����� �غ��� ���� main �޼ҵ��Դϴ�.
    public static void main(String[] args) {
    	Solution04 sol = new Solution04();
        String[] words1 = {"my", "favorite", "color", "is", "violet"};
        String ret1 = sol.solution(words1);

        // [����] ��ư�� ������ ��� ���� �� �� �ֽ��ϴ�.  
        System.out.println("solution �޼ҵ��� ��ȯ ���� " + ret1 + " �Դϴ�.");
        
        String[] words2 = {"yes", "i", "am"};
        String ret2 = sol.solution(words2);

        // [����] ��ư�� ������ ��� ���� �� �� �ֽ��ϴ�.  
        System.out.println("solution �޼ҵ��� ��ȯ ���� " + ret2 + " �Դϴ�.");
    }
}