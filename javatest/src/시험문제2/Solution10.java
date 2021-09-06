package 시험문제2;

/*
 * #문제10
 * 
 * A 백화점에서는 고객의 구매금액에 따라 다음과 같이 상품권을 지급합니다.
 * 
 * | 구매 금액         | 상품권       |
 * |-----------------|--------------|
 * | 100만 원 이상 구매 | 5만 원 상품권 |
 * | 60만 원 이상 구매  | 3만 원 상품권 |
 * | 40만 원 이상 구매  | 2만 원 상품권 |
 * | 20만 원 이상 구매  | 1만 원 상품권 |
 * 
 * 이때, 상품권은 지급 가능한 가장 큰 금액으로 한 장만 지급합니다. 
 * 예를 들어 고객이 65만 원을 구매했다면, 3만 원 상품권 한 장만 지급합니다.
 * 
 * 고객들의 구매 금액이 들어있는 배열 purchase가 주어질 때, 
 * 고객들에게 지급해야 하는 상품권 총액을 return 하도록 solution 메소드를 작성했습니다. 
 * 그러나, 코드 일부분이 잘못되어있기 때문에, 코드가 올바르게 동작하지 않습니다. 
 * 주어진 코드에서 _**한 줄**_만 변경해서 모든 입력에 대해 올바르게 동작하도록 수정해주세요.
 * 
 * ---
 * #####매개변수 설명
 * 고객들의 구매 금액이 들어있는 배열 purchase가 solution 메소드의 매개변수로 주어집니다.
 * purchase의 길이는 1 이상 100 이하입니다.
 * purchase의 원소는 10 이상 1,500,000 이하의 자연수이며, 10원 단위로 주어집니다.
 * 
 * ---
 * #####return 값 설명
 * 고객들에게 지급해야 하는 상품권 총액을 return 해주세요.
 * 
 * ---
 * #####예시
 * | purchase                                  | return |
 * |-------------------------------------------|--------|
 * | [150000, 210000, 399990, 990000, 1000000] | 100000 |
 * 
 * #####예시 설명
 * 210,000원, 399,990원을 구매한 고객에게 1만 원 상품권을 지급해야 합니다.
 * 990,000원을 구매한 고객에게 3만 원 상품권을 지급해야 합니다.
 * 1,000,000원을 구매한 고객에게 5만 원 상품권을 지급해야 합니다.
 * 
 * 따라서 지급해야 하는 상품권은 1만 원 상품권 2장, 3만 원 상품권 1장, 5만 원 상품권 1장으로, 
 * 총액은 10만 원 입니다.
 */

public class Solution10 {
    public int solution(int[] purchase) {
        int total = 0;
        for(int i = 0; i < purchase.length; ++i){
            if(purchase[i] >= 1000000)
                total += 50000;
            else if(purchase[i] >= 600000)
                total += 30000;
            else if(purchase[i] >= 400000)
                total += 20000;
            else if(purchase[i] >= 200000)
                total += 10000;
        }
        return total;
    }

    // 아래는 테스트케이스 출력을 해보기 위한 main 메소드입니다. 
    // main 메소드는 잘못된 부분이 없으니, solution 메소드만 수정하세요.
    public static void main(String[] args) {
    	Solution10 sol = new Solution10();
        int[] purchase = {150000, 210000, 399990, 990000, 1000000};
        int ret = sol.solution(purchase);


        // [실행] 버튼을 누르면 출력 값을 볼 수 있습니다.
        System.out.println("solution 메소드의 반환 값은 " + ret + " 입니다.");
    }
}