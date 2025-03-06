import java.util.Arrays;

public class P120890 {
    public int solution(int[] array, int n) {
        Arrays.sort(array);
        int minDiff = Integer.MAX_VALUE;
        int answer = 0;
        
        for (int num : array) {
            int diff = Math.abs(num - n);

            if (diff < minDiff) {
                minDiff = diff;
                answer = num;
            }
        }
        return answer;
    }
}
