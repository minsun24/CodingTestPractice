import java.util.stream.IntStream;

// 약수 구하기 스트림 사용
// n = 24, result = [1, 2, 3, 4, 6, 8, 12, 24];
class Solution {
    public int[] solution(int n) {
        return IntStream.rangeClosed(1, n).filter(i -> n % i == 0).toArray();
    }
}