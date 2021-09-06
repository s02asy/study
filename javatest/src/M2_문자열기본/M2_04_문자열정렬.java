package M2_문자열기본;

public class M2_04_문자열정렬 {

	public static void main(String[] args) {
		// 문제) 사전 순으로 이름 정렬
		String[] names = { "홍길동", "김유신", "마동석", "자바킹", "서동요" };

		for (int i = 0; i < names.length; i++) {
			String minName = names[i];
			int minIdx = i;
			for (int j = i; j < names.length; j++) {
				if (minName.compareTo(names[j]) > 0) {
					minName = names[j];
					minIdx = j;
				}
			}
			String temp = names[i];
			names[i] = names[minIdx];
			names[minIdx] = temp;
		}

		for (int i = 0; i < names.length; i++) {
			System.out.print(names[i] + " ");
		}

	}

}