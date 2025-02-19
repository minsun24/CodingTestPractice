// 약수 구하기
// n = 24, result = [1, 2, 3, 4, 6, 8, 12, 24];
import java.util.Arrays;

class Solution {
    public int[] solution(int n) {
        StringBuilder sb = new StringBuilder();
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                sb.append(i+" ");
            }
        }
        String[] stArr = sb.toString().split(" ");
        int[] answer = Arrays.stream(stArr).mapToInt(Integer::parseInt).toArray();
        return answer;
    }
}