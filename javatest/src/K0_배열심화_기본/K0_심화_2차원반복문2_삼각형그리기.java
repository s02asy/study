package K0_�迭��ȭ_�⺻;
public class K0_��ȭ_2�����ݺ���2_�ﰢ���׸��� {
	public static void main(String[] args) {
		/*
		 * ���� 1)
		 * #
		 * ##
		 * ###
		 */
		for(int i=0; i<3; i++) {
			for(int j=0; j<=i; j++) {
				System.out.print("#");
			}
			System.out.println();
		}

		System.out.println();


		/*
		 * ���� 2)
		 * ###
		 * ##
		 * #
		 */
		for(int i = 0; i < 3; i++) {
			for(int j = 0; j < 3 - i; j++) {
				System.out.print("#");
			}
			System.out.println();
		}
		System.out.println();
		/*
		 * ���� 3)
		 * @##
		 * @@#
		 * @@@
		 */
		int kk = 2;
		for(int i = 0; i < 3; i++) {
			for(int j = 0; j <= i; j++) {
				System.out.print("@");
			}
			for(int k = 0; k < kk; k++) {
				System.out.print("#");
			}
			kk -= 1;
			System.out.println();
		}
		System.out.println();
		/*
		 * ���� 4)
		 *   #
		 *  ###
		 * #####
		 */
		kk = 1;
		for(int i = 0; i < 3; i++) {
			for(int j = i; j < 2; j++) {
				System.out.print("@");
			}
			for(int k = 0; k < kk; k++) {
				System.out.print("#");
			}
			kk += 2;
			System.out.println();
		}
		System.out.println();
		/*
		 * ���� 5)
		 * #####
		 *  ###
		 *   #
		 *  ###
		 * #####
		 */
		int index = 4;
		for(int i = 0; i < 5; i++) {
			for(int j = 0; j < 5; j++) {
				if(i <= j && index >= j || index <= j && j <= i) {
					System.out.print("#");
				}
				else {
					System.out.print("@");
				}
			}
			index -= 1;
			System.out.println();
		}
	}
}