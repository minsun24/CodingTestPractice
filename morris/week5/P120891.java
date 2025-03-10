class Solution {
    public int solution(int order) {
        int answer = 0;
        String st = order + "";
        
        for (char ch : st.toCharArray()) {
            if (ch == '3' || ch == '6' || ch == '9') {
                answer++;
            }
        }
        return answer;
    }
}