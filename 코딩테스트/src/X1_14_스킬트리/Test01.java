package X1_14_스킬트리;

//https://programmers.co.kr/learn/courses/30/lessons/49993?language=java
class Solution {
	
	boolean isCheck(String tree , String skill) {
		
		int count = 0;
		for(int i = 0; i < tree.length(); i++) {
			for(int j = 0; j < skill.length(); j++) {
				String s1 = tree.charAt(i) + "";
				String s2 = skill.charAt(j) + "";
				if(s1.equals(s2)) {
					if(count < j) {
						return false;
					}
					count += 1;
				}
				
			}
		}
		return true;	
	}
	
	
    public int solution(String skill, String[] skill_trees) {    	
    	int answer = 0;        
    	for(int i = 0; i< skill_trees.length; i++) {
    		String tree = skill_trees[i];
    	   	if(isCheck(tree , skill)) {
    	   		answer += 1;
    	   	}
    	}                    
        System.out.println(answer);
        return answer;
    }
}
public class Test01 {
	public static void main(String[] args) {
		Solution sol = new Solution();
		String skill ="CBD";
		String[] skill_trees= 
			{"BACDE", "CBADF", "AECB", "BDA"};
		sol.solution(skill, skill_trees);
	}
}