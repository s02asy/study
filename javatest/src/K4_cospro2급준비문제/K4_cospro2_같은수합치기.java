package K4_cospro2���غ���;
import java.util.Arrays;
public class K4_cospro2_��������ġ�� {
	// [1] input �� �����͸� ���������� a�� �����Ѵ�.
	// [2] �����ҷ��� ���� �׾��� ���� ���ΰ����� ��ģ��. (��� ��ø����)
	// input = {8,4,2,2,4,4,8};				
	// 8  ==> a[] =  {8}
	// 4  ==> a[] =  {8,4}
	// 2  ==> a[] =  {8,4,2}
	// 2  ==> a[] =  {8,4,2,2} ==> {8,4,4} ==> {8,8} ==> {16}
	// 4 ==>  a[] =  {16,4} 
	// 4  ==> a[] =  {16,4,4} ==> {16,8}
	// 8  ==> a[] =  {16,8,8} ==> {16,16} ==> {32}
	public static void main(String[] args) {
		int [] input = {8,4,2,2,4,4,8};	
		int a[] = new int[input.length];
		int index = 0;
		for(int i = 0; i < input.length; i++) {
			a[index] = input[i];
			index += 1;			
			while(true) {
				System.out.println(Arrays.toString(a));
				boolean check = false;
				for(int j = 0; j < index; j++) {
					if(a[j] == a[j + 1]) {
						a[j] += a[j + 1];
						a[j + 1] = 0;
						index -= 1;
						check = true;
					}
				}
				if(check == false) {
					break;
				}
			}		
		}		
	}
}