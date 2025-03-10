class Solution {
    public int solution(int n) {
        int answer = factorial(n, 1);
        return answer;
    }
    
    public int factorial(int n, int num) {
        if (num * (num+1) <= n) return factorial((n / num), num+1);
        return num;
    }
}