package P6_콜렉션벡터_level1;

class Sample{
	int darr[][];
}
class Sample1{
	int arr[] = {1,2,3,4,5};
}
class Sample2{
	int arr[] = {11,12,13,14,15};
}

public class P6_클래스배열주소연습2 {
	public static void main(String[] args) {		
		// 각 클래스에 있는 배열의 짝수들만 darr에 저장 
		Sample1 s1 = new Sample1();
		Sample2 s2 = new Sample2();
		
		int test1[] = s1.arr;
		int test2[] = s2.arr;
		int count = 0;
		for(int i = 0; i < test1.length; i++) {
			if(test1[i] % 2 == 0) {
				count += 1;
			}
		}
		int even1[] = new int[count];
		count = 0;
		for(int i = 0; i < test2.length; i++) {
			if(test2[i] % 2 == 0) {
				count += 1;
			}
		}
		int even2[] = new int[count];
		int k = 0;
		for(int i = 0; i < test1.length; i++) {
			if(test1[i] % 2 == 0) {
				even1[k] = test1[i];
				k += 1;
			}
		}
		k = 0;
		for(int i = 0; i < test2.length; i++) {
			if(test1[i] % 2 == 0) {
				even2[k] = test2[i];
				k += 1;
			}
		}
		Sample sample = new Sample();
		sample.darr = new int[2][];
		sample.darr[0] = even1;
		sample.darr[1] = even2;
	}
}