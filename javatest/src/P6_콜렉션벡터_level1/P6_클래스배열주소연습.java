package P6_콜렉션벡터_level1;

class Test1{
	int test[];
}

class Test2{
	int test2[] = {1,2,3,4,5,6};
}
class Test3{
	int test3[];
}
public class P6_클래스배열주소연습 {
	public static void main(String[] args) {
		int [] arr = {10,20,30};
		int [] temp = arr;
		
		Test1 t1 = new Test1();
		t1.test = arr;
		
		// 문제1) 어떤배열에서 짝수만 배열로 전달받기 
		// t2의 배열에서 짝수만 t3에 저장하기 	
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