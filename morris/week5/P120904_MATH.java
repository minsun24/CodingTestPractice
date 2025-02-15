class Solution {
    public int solution(int num, int k) {
        int pos = 1;
        int temp = num;
        // 가장 높은 자리의 자리수 구하기
        // Math.log10(num) : num의 자릿수 구하기 -1, pow : 거듭제곱 
        int divisor = (int) Math.pow(10, (int) Math.log10(num)); 

        while (divisor > 0) {
            if (temp / divisor == k) return pos;
            temp %= divisor;
            divisor /= 10;
            pos++;
        }

        return -1;
    }
}
