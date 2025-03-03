class Solution {
    public int solution(int i, int j, int k) {
        int count = 0;
        
        String numStr = "12223";
        String kStr = "2";
        // 주어진 숫자를 문자열로 변환하면 전체 길이는 5
        numStr.length(); // 5
        
        // 전체 문자열에서 k를 제거
        // numStr.replace(kStr, "").length(); // 2  ("12223" -> "13")
        count += numStr.length() - numStr.replace(kStr, "").length(); // 3
        
        return count;
    }
}