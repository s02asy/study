package O0_Ŭ����;

class Memory{
	int a;
	int b;
}

public class O0_08_Ŭ�����̷�_�޸� {

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