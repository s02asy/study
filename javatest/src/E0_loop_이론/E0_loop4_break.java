package E0_loop_이론;

import java.util.Scanner;

public class E0_loop4_break {
	
	// # 보조제어문 1. break 반복문 1개를 즉시 종료 (굉장히 편리하다)

	public static void main(String[] args) {
		
		// break
		for (int i = 0; i < 15; i++) {
			if (i > 3) {
				break;
			}
			System.out.println(i);
		}
		System.out.println("종료");
	}
}