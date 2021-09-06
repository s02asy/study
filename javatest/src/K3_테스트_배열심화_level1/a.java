package K3_테스트_배열심화_level1;
import java.util.Arrays;
public class a {
public static void main(String[] args) {		
				
		// 위 데이터는 압축전 데이터이다.
		// 연속으로 이뤄진 데이터를 모아 압축할려고한다.
		// 예) 33  ==> {3,2}
		// 예) 555 ==> {5,3}
		// 예) 2   ==> {2,1};
		// 예) 4   ==> {4,1};
		// 문제) 위 압축전데이터를 분석후 2차원으로 저장하시요.
		int arr[] = {3,3,5,5,5,3,3,3,3,2,2,3,2,4};		
		int arr2[][] = new int[7][2];		
		
		int count[]=new int [7];
		
		boolean run =true;
		int temp=0;
		int countIndex = 0;
		
		for(int i=0;i<arr.length;i++) {
			while(run) {
				temp=arr[i];
				run=false;					//검사값 을 한번정한다.
			}
			
			if(temp==arr[i]) {
				count[countIndex]++;		//검사값과 같으면 count[]에저장
			}
			
			if(temp!=arr[i]) {
				countIndex++;				
				count[countIndex]++;		//검사값과 다를경우 count[]의 인덱스값을 1올린다.
			}								//반복한다.
			
			temp=arr[i];					//반복을하다가 arr[i]에서 새로운 수가나오면 그수가 검사값이된다.
			arr2[countIndex][0]=temp;		//이과정에서 arr2의 앞에값은 미리 저장을 같이한다.
		}
		
		for(int i=0;i<countIndex + 1;i++) {
			arr2[i][1]=count[i];			//count[]의값을 arr2뒤에값에 넣는다.
		}
		
		for(int i=0;i<countIndex + 1;i++) {
			System.out.println(Arrays.toString(arr2[i]));
		}
	}
}