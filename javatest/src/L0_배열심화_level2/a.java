package L0_배열심화_level2;

public class a {
	public static void main(String[] args) {
		int scoreList[] = {31, 76, 54, 2, 100, 23};		
		int graph[][] = new int[10][6]; // 1 , 0 으로 채우면 된다.
		//위 데이터는 학생 6명의 점수이다.		
		//위 데이터를 그래프로 표현해볼려고한다.		
		// 표시는 10의 자리숫자로 표현해서 개수만큼  * 로 출력할려고한다.
		// 전에는 왼쪽에서 오른쪽으로 표현했지만 이번엔 아래서 위로 표현할려고한다.		
		//예)             
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