package M2_���ڿ��⺻;

public class M2_08_���ڿ��������� {

	public static void main(String[] args) {
		String s1 = "  Hello  World  ";      
        //���� ���ڿ��� ���� �� ���ڿ� ���
        System.out.println(s1.trim()); //�յڴ� ���ŵ����� ����� ���Ű��ȵȴ�. 
        System.out.println("-----------------------------------");
        
        
        String s2 = "HelloHelloHello";      
        //s2 ���ڿ��� "Hello"�� "A"�� ����
        System.out.println(s2.replaceAll("Hello","A"));     
        System.out.println("-----------------------------------");
        
        
        String s3 = " Hello Hello Hello ";    
        //s3 ���ڿ��� ���� ���� ����
        System.out.println(s1.replaceAll(" ",""));
        
        
	}
}