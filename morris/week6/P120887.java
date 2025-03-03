class Solution {
    public int solution(int i, int j, int k) {
        int answer = 0;
        char kch = (char)(k+'0');
        StringBuilder sb = new StringBuilder();
        
        for (int p = i; p <= j; p++) {
            sb.append(p);    
        }
        
        for (int p = 0; p < sb.toString().toCharArray().length; p++) {
            if (sb.toString().toCharArray()[p] == kch) answer++;
        }
        
        return answer; 
    }
}