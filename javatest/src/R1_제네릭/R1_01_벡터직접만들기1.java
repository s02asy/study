package R1_제네릭;


import java.util.Scanner;

class MyVector1 {

	private int[] arr;
	private int count;

	public void print() {
		System.out.print("[");
		for (int i = 0; i < count; i++) {
			System.out.print(arr[i]);
			if (i != count - 1) {
				System.out.print(", ");
			}
		}
		System.out.println("]");
	}

	public void add(int value) {
		if (count == 0) {
			arr = new int[count + 1];
		} else if (count > 0) {
			int[] temp = arr;
			arr = new int[count + 1];

			for (int i = 0; i < count; i++) {
				arr[i] = temp[i];
			}
			temp = null;
		}

		arr[count] = value;
		count += 1;
	}

	public void add(int index, int value) {
		if (count == 0) {
			arr = new int[count + 1];
		} else if (count > 0) {
			int[] temp = arr;
			arr = new int[count + 1];

			int j = 0;
			for (int i = 0; i < count + 1; i++) {
				if (i != index) {
					arr[i] = temp[j];
					j += 1;
				}
			}
			temp = null;
		}

		arr[index] = value;
		count += 1;
	}

	public void remove(int index) {
		if (count == 1) {
			arr = null;
		} else if (count > 1) {
			int[] temp = arr;
			arr = new int[count - 1];

			int j = 0;
			for (int i = 0; i < count; i++) {
				if (i != index) {
					arr[j] = temp[i];
					j += 1;
				}
			}
			temp = null;
		}
		count -= 1;
	}

	public int size() {
		return count;
	}

	public int get(int index) {
		return arr[index];
	}

	public void set(int index, int value) {
		arr[index] = value;
	}

	public void clear() {
		arr = null;
		count = 0;
	}
	
}

public class R1_01_벡터직접만들기1 {
	public static void main(String[] args) {
		
		MyVector1 list =new MyVector1();
		Scanner scan = new Scanner(System.in);
		while(true) {
			list.print();
			
			System.out.println("1.추가 2.삭제 3.삽입 4.종료");
			int sel = scan.nextInt();
			if(sel == 1) {
				System.out.println("추가할 숫자를입력하세요 >> ");
				int num = scan.nextInt();
				list.add(num);
			}else if(sel == 2) {
				list.print();
				System.out.println("삭제할 인덱스를 입력하세요 >> ");
				int index = scan.nextInt();
				if(list.size() <= 0) {
					continue;
				}
				if(index < 0) {
					continue;
				}
				if(index >= list.size()) {
					continue;
				}
				list.remove(index);
				
			}else if(sel == 3) {
				list.print();
				System.out.println("삽입할 위치를 입력하세요 >> ");
				int pos = scan.nextInt();
				System.out.println("삽입할 값을 입력하세요 >> ");
				int value = scan.nextInt();
				list.add(pos , value);
				
			}else if(sel == 4) {
				System.out.println("종료");
				break;
			}
		}
		scan.close();
	}
}