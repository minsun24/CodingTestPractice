class Solution {
    public int solution(String my_string) {
        int answer = 0;
        for (char c : my_string.toCharArray()) {
            if (String.valueOf(c).matches("[0-9]")) {
                answer += c - '0';
            }
        }
        return answer;
    }
}
