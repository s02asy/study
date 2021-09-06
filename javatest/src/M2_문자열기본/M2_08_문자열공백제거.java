package M2_문자열기본;

public class M2_08_문자열공백제거 {

	public static void main(String[] args) {
		String s1 = "  Hello  World  ";      
        //공백 문자열을 제거 한 문자열 출력
        System.out.println(s1.trim()); //앞뒤는 제거되지만 가운데는 제거가안된다. 
        System.out.println("-----------------------------------");
        
        
        String s2 = "HelloHelloHello";      
        //s2 문자열의 "Hello"를 "A"로 변경
        System.out.println(s2.replaceAll("Hello","A"));     
        System.out.println("-----------------------------------");
        
        
        String s3 = " Hello Hello Hello ";    
        //s3 문자열의 공백 문자 제거
        System.out.println(s1.replaceAll(" ",""));
        
        
	}
}