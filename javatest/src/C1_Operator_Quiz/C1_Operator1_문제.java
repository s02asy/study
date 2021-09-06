package C1_Operator_Quiz;

public class C1_Operator1_문제 {
	public static void main(String[] args) {
		//문제1) 아래 연산의 결과가 모두 true가 출력되도록 숫자를  변경		
        System.out.println(10 == 10);
        System.out.println(3 != 8);
        System.out.println(5 > 3);
        System.out.println(1 < 3);
        System.out.println(11 >= 11);
        System.out.println(3 <= 10);
		    
        System.out.println("--------------------------");
        
        int a = 10;
        int b = 3;
        
      //문제1) 아래 연산의 결과가 모두 true가 출력되도록 변수a, b 의 값  변경	
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
