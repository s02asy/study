package G0_�迭����Ÿ�̷�;

public class G0_��Ÿ�̷�3_���������� {
	public static void main(String[] args) {
		
			
		int a = 10;
		System.out.println("a : " + ++a);
		System.out.println("a : " + a);
		
		int b = 10;
		// ������ ������ �켱������°� �ִµ� 
		// ++�� ���� �ڿ� ���̴°� �켱������ ���Ƽ� b�� ���� ��µǰ��� ���ϱ� 1�̵ȴ�. 
		// �̷����̿��ؼ� �ڵ带 �����������ϼ��������� ������������ ��Ȯ�� �ڵ��ϴ°� �� ����
		// ������ �˰�� �־���� 
		System.out.println("b : " + b++);	
		System.out.println("b : " + b);
		
		//�� ����麸�ٴ� �Ʒ������ �ڵ尡 ���ٴ����� �ξ� �������� 
		int c = 10;
		System.out.println(c);
		c += 1;
		System.out.println(c);
		
		// ------------------------------------------------
		
		//int a = 10;
				//a++;
				//++a;
				//System.out.println(a);
				//-------------------------------
				int i = 0;
				while(i <= 3) {
					System.out.print(++i + " ");
				}
				System.out.println();
				System.out.println("----------------");
				b = 0;
				while(b <= 3) {
					b += 1;
					System.out.print(b + " ");
				}
				System.out.println();
				System.out.println("-----------------");
				//-------------------------------
				c = 0;
				while(c <= 3) {
					System.out.print(c++ + " ");
				}
				System.out.println();
				System.out.println("-----------------");
				
				int d = 0;
				while(d <= 3) {
					System.out.print(d + " ");
					d += 1;
				}
				System.out.println();
				System.out.println("-----------------");
	}
}