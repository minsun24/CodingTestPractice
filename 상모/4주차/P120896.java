import java.util.*;

class P120896 {
    public String solution(String s) {
        Map<Character, Integer> countMap = new HashMap<>();
        
        for (char ch : s.toCharArray()) {
            countMap.put(ch, countMap.getOrDefault(ch, 0) + 1);
        }
        
        StringBuilder answer = new StringBuilder();
        for (char ch : countMap.keySet()) {
            if (countMap.get(ch) == 1) {
                answer.append(ch);
            }
        }
        
        char[] result = answer.toString().toCharArray();
        Arrays.sort(result);
        
        return new String(result);
    }
}
