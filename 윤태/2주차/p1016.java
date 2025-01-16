import java.util.Arrays;

public class p1016 {
    public static void main(String[] args) {
        long min = 1;
        long max = 10000000l;

        long result = p1016.solution2(min, max);
        System.out.println(result);
    }

    // 시간, 범위 초과
    public static int solution(int min, int max) {
        int answer = 0;

        for(int i = min; i <= max; i++) {
            boolean check = true;
            for(int j = 2; j < i; j++) {
                if(i % (j * j) == 0) {
                    System.out.println("false!");
                    check = false;
                    break;
                }
            }
            if(check) {
                answer++;
            }
        }

        return answer;
    }

    // 아직 이해 X
    public static long solution2(long min, long max) {
        int size = (int)(max - min + 1);
        boolean[] isSquareFree = new boolean[size];
        Arrays.fill(isSquareFree, true);

        for(long i = 2; i * i <= max; i++) {
            long square = i * i;
            long start = Math.max(square, (min + square - 1) / square * square);

            for(long j = start; j <= max; j += square) {
                isSquareFree[(int)(j - min)] = false;
            }
        }

        long count = 0;
        for (boolean value: isSquareFree) {
            if(value) {
                count++;
            }
        }
        return count;
    }
}