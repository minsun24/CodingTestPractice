import java.util.Arrays;

public class P2104 {
    public static void main(String[] args) {
        int N = 6;
        int[] arr = {3, 1, 6, 4, 5, 2};

        int result = solution(N, arr);
        System.out.println(result);     // 60
    }

    // 시간 초과
    public static int solution(int N, int[] arr) {
        int score = Integer.MIN_VALUE;
        for(int i = 0; i < N; i++) {
            for(int j = i; j < N; j++) {
                int sum = Arrays.stream(arr, i, j + 1).sum();
                int min = Arrays.stream(arr, i, j + 1).min().getAsInt();
                score = Math.max(score, sum * min);
            }
        }
        return score;
    }

    // 스택 사용 필요. 3주차로
}
