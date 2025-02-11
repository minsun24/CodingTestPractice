import java.util.Map;
import java.util.HashMap;
import java.util.Arrays;

// 해시기반 탐색
class P120896 {
    public String solution(String s) {
        StringBuilder sb = new StringBuilder();
        
        Map<Character, Integer> hMap = new HashMap<>();
        
        for (char ch : s.toCharArray()) {
            hMap.put(ch, hMap.getOrDefault(ch, 0) + 1);
        }
        
        for (char ch : s.toCharArray()) {
            if (hMap.get(ch) == 1) {
                sb.append(ch);
            }    
        }
        
        char[] answer = sb.toString().toCharArray();
        Arrays.sort(answer);
        return new String(answer);
    }
}

// 완전탐색
// class P120896 {
//     public String solution(String s) {
//         StringBuilder sb = new StringBuilder();
        
//         for (int i = 0; i < s.length(); i++) {
//             int count = 0;
//             for (int j = 0; j < s.length(); j++) {
//                 if (s.charAt(i) == s.charAt(j)) {
//                     count++;
//                 }
//             }
//             if (count <= 1) {
//                 sb.append(s.charAt(i));
//             }
//         }
        
//         char[] chArr = sb.toString().toCharArray();
//         Arrays.sort(chArr);
//         return new String(chArr);
//     }
// }