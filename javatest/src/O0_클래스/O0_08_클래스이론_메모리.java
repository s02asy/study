package O0_클래스;

class Memory{
	int a;
	int b;
}

public class O0_08_클래스이론_메모리 {

	public static void main(String[] args) {
		Memory m = new Memory();
		m = new Memory();
		m = null;
		
		
		int arr[] = new int[3];
		int temp[] = arr;
		arr = null;
		
		int arr2[] = new int[3];
		arr2 = null;
		
	}

}