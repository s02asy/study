package P0_�����׽�Ʈ;
class Test1{
	int a;
	int arr[];	
	void setArr(int[] arr) {
		this.arr = arr;
	}
	int[] getArr() {
		String data = "1,2,3,4";
		String [] tokens = data.split(",");
		int size = tokens.length;
		int arr[] = new int[size];
		return arr;
	}
}
public class P0_01_����������1 {
	public static void main(String[] args) {
		int a;
		a = 10;
		
		Test1 t1 = new Test1();
		t1.a = 10;
		
		String data = "1,2,3,4";	
		int arr[];
		
		String [] tokens = data.split(",");
		int size = tokens.length;		
		arr = new int[size];
		
		t1.arr = new int[size];
		t1.setArr(arr);
		int arr2[] = t1.getArr();
		
	}
}