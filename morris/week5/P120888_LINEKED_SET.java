import java.util.Set;
import java.util.LinkedHashSet;

class P120888_LINEKED_SET {
    public String solution(String my_string) {
        StringBuilder answer = new StringBuilder();
        Set<Character> lhSet = new LinkedHashSet<>();
        
        for(char ch : my_string.toCharArray()) {
            if (lhSet.add(ch)) {
                answer.append(ch);
            }
        }
        return answer.toString();
    }
}