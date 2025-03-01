import java.util.Arrays;

// A로 B 만들기
class Solution {
    public int solution(String before, String after) {

        char[] beforeArr = before.toCharArray();
        char[] afterArr = after.toCharArray();
        
        Arrays.sort(beforeArr);
        Arrays.sort(afterArr);
        
        return Arrays.equals(beforeArr, afterArr) ? 1 : 0;
    }
}