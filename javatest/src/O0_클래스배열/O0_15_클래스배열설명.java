package O0_클래스배열;

class Test15{
	int a;
	int b;
	int c;
	
}
public class O0_15_클래스배열설명 {
	public static void main(String[] args) {
		
		//Test15 t = new Test15();	
		//int arr[] =new int[3];
		
		//int arr[] = new int[3];
		//int arr2[] = new int[3];
		//int arr3[] = new int[3];
		
		//int darr[][] = new int[3][];
		//darr[0] = arr;
		//darr[1] = arr2;
		//darr[2] = arr3;
		
//		Test15 t1 = new Test15();
//		Test15 t2 = new Test15();
//		Test15 t3 = new Test15();
//		
//		Test15[] tarr = new Test15[3];
//		tarr[0] = t1;
//		tarr[1] = t2;
//		tarr[2] = t3;
		
		Test15[] tarr =new Test15[3];
		for(int i = 0; i < tarr.length; i++) {
			tarr[i] = new Test15();
		}

	}
}