import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

class P120888 {
    public String solution(String my_string) {
        StringBuilder answer = new StringBuilder();
        HashMap<Character, Integer> hMap = new HashMap<>();
        char[] ch = my_string.toCharArray();
        
        for (int i = 0; i < ch.length; i++) {
            hMap.put(ch[i], hMap.getOrDefault(ch[i], 0) + 1); 
            if (hMap.get(ch[i]) < 2) {
                answer.append(ch[i]);
            }
        }
        
        return answer.toString();
    }
}