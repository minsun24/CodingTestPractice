class Solution {
    public int solution(int i, int j, int k) {
        int count = 0;
        String kStr = String.valueOf(k);
        
        for (int num = i; num <= j; num++) {
            String numStr = String.valueOf(num);
            count += numStr.length() - numStr.replace(kStr, "").length();
        }
        
        return count;
    }
}