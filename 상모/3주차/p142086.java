import java.util.Map;
import java.util.HashMap;

class Solution {
    public int[] solution(String s) {
        int[] answer = new int[s.length()];
        Map<Character, Integer> lastIdx = new HashMap<>();
        
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            
            // System.out.println("c : "+c);
            if (lastIdx.containsKey(c)) {
                answer[i] = i - lastIdx.get(c);
                // System.out.println("true : "+lastIdx.get(c));
            } else {
                answer[i] = -1;
                // System.out.println("false : "+lastIdx.get(c));
            }
            
            lastIdx.put(c, i);
            // System.out.println("put : "+lastIdx.get(c));
        }
        
        return answer;
    }
}