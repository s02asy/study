package G0_배열과기타이론;
public class G0_기타이론2_switch2 {
	/*
	 * 	스위치 케이스 (switch case)
	 *   사용예 : 비교대상이 전부 == 일때만 사용가능 
	 * 모양이 많이 불편하다 (그냥 if문 쓰는게 낫다)
	 * 
	 * 1) switch      ==> 키워드
	 * 2) (값)         ==> 비교할값 
	 * 3) {}    	   ==> 영역 
	 * 4) case 값:     ==> 비교할값 
	 * 5)  내용  break;  ==> 비교할값과 내용 
	 * 6) default:     ==> if의 else 와같다. 
	 */	
	public static void main(String[] args) {		
		int a = 4;			
		//----------------------------------
		if(a == 1) {
			System.out.println("a 는 1이다");
		}else if(a == 2) {
			System.out.println("a 는 2이다");
		}else if(a == 3) {
			System.out.println("a 는 3이다");
		}else {
			System.out.println("1~3은 아니다.");
		}
		//----------------------------------
		switch(a) {
		case 1:
			System.out.println("a 는 1이다");
			break;
		case 2:
			System.out.println("a 는 2이다");
			break;
		case 3:
			System.out.println("a 는 3이다");
			break;
		default :
			System.out.println("1~3은 아니다.");
			break; // 정확한 문법은 써야 하지만. default 에서 끝나기 때문에
				   // 안써도 상관은 없다.
		}		
	}
}