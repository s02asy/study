package C1_Operator_Quiz;

public class C1_Operator1_���� {
	public static void main(String[] args) {
		//����1) �Ʒ� ������ ����� ��� true�� ��µǵ��� ���ڸ�  ����		
        System.out.println(10 == 10);
        System.out.println(3 != 8);
        System.out.println(5 > 3);
        System.out.println(1 < 3);
        System.out.println(11 >= 11);
        System.out.println(3 <= 10);
		    
        System.out.println("--------------------------");
        
        int a = 10;
        int b = 3;
        
      //����1) �Ʒ� ������ ����� ��� true�� ��µǵ��� ����a, b �� ��  ����	
        b = 10;
        System.out.println(a == b);
        b = 1;
        System.out.println(a != b);
        System.out.println(a > b);
        b = 100;
        System.out.println(a < b);
        a = 100;
        System.out.println(a >= b);
        System.out.println(a <= b);
	}
}
