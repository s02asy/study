package L0_�迭��ȭ_level2;

public class a {
	public static void main(String[] args) {
		int scoreList[] = {31, 76, 54, 2, 100, 23};		
		int graph[][] = new int[10][6]; // 1 , 0 ���� ä��� �ȴ�.
		//�� �����ʹ� �л� 6���� �����̴�.		
		//�� �����͸� �׷����� ǥ���غ������Ѵ�.		
		// ǥ�ô� 10�� �ڸ����ڷ� ǥ���ؼ� ������ŭ  * �� ����ҷ����Ѵ�.
		// ������ ���ʿ��� ���������� ǥ�������� �̹��� �Ʒ��� ���� ǥ���ҷ����Ѵ�.		
		//��)             
		/*               		                
		                 *
		                 *
		                 *
		        *        *
		 	    *        *
		  	    *  *     *
		        *  *     *
		     *  *  *     *
		     *  *  *     *  *
		  	 *  *  *     *  *
		    31 76 54 2 100 23
		    
		 */
		
		for(int i = 0; i < scoreList.length; i++) {
			int cnt = scoreList[i] / 10;
			int index = 9;
			for(int j = 0; j < cnt; j++) {
				graph[index][i] = 1;
				index -= 1;
			}
		}
		for(int i = 0; i < graph.length; i++) {
			for(int j = 0; j < graph[i].length; j++) {
				if(graph[i][j] == 1) {
					System.out.print("*" + "  ");
				}else {
					System.out.print("   ");
				}
			}
			System.out.println();
		}
		for(int i = 0; i < scoreList.length; i++) {
			System.out.print(scoreList[i] + " ");
		}
		
		
		
	}
}