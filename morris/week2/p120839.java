import java.util.Map;
import java.util.HashMap;

class P120839 {
    public String solution(String rsp) {
        StringBuilder answer = new StringBuilder();
        Map<String, String> rspMap = new HashMap<>();
        rspMap.put("2", "0");
        rspMap.put("0", "5");
        rspMap.put("5", "2");
        for (char c : rsp.toCharArray()) {
            answer.append(rspMap.get(c+"")); 
        }
        return answer.toString();
    }
}
