package P6_�ݷ��Ǻ���_level1;

class Test1{
	int test[];
}

class Test2{
	int test2[] = {1,2,3,4,5,6};
}
class Test3{
	int test3[];
}
public class P6_Ŭ�����迭�ּҿ��� {
	public static void main(String[] args) {
		int [] arr = {10,20,30};
		int [] temp = arr;
		
		Test1 t1 = new Test1();
		t1.test = arr;
		
		// ����1) ��迭���� ¦���� �迭�� ���޹ޱ� 
		// t2�� �迭���� ¦���� t3�� �����ϱ� 	
		Test2 t2 = new Test2();	
		int total[] = t2.test2;
		int count = 0;
		for(int i = 0; i < total.length; i++) {
			if(total[i] % 2 == 0) {
				count += 1;
			}
		}
		int even[] = new int[count];
		int k = 0;
		for(int i = 0; i < total.length;i++) {
			if(total[i] % 2 == 0) {
				even[k] = total[i];
				k += 1;
			}
		}
		Test3 t3 = new Test3();
		t3.test3 = even;		
	}
}