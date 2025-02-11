import java.util.*;

// class P120896 {
//     public String solution(String s) {
//         Map<Character, Integer> countMap = new HashMap<>();
        
//         for (char ch : s.toCharArray()) {
//             countMap.put(ch, countMap.getOrDefault(ch, 0) + 1);
//         }
        
//         StringBuilder answer = new StringBuilder();
//         for (char ch : countMap.keySet()) {
//             if (countMap.get(ch) == 1) {
//                 answer.append(ch);
//             }
//         }
        
//         char[] result = answer.toString().toCharArray();
//         Arrays.sort(result);
        
//         return new String(result);
//     }
// }

class P120896 {
    public String solution(String s) {
        StringBuilder sb = new StringBuilder();
        
        for (int i = 0; i < s.length(); i++) {
            int count = 0;
            for (int j = 0; j < s.length(); j++) {
                if (s.charAt(i) == s.charAt(j)) {
                    count++;
                }
            }
            if (count <= 1) {
                sb.append(s.charAt(i));
            }
        }
        
        char[] chArr = sb.toString().toCharArray();
        Arrays.sort(chArr);
        return new String(chArr);
    }
}