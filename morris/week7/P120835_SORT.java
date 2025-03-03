import java.util.*;

class Solution {
    public int[] solution(int[] emergency) {
        int n = emergency.length;
        int[] result = new int[n];
        
        // 원본 배열 복사 후 정렬
        Integer[] sorted = Arrays.stream(emergency).boxed().toArray(Integer[]::new);
        Arrays.sort(sorted, Collections.reverseOrder()); // 내림차순 정렬
        
        // 원래 배열의 각 숫자가 정렬된 배열에서 몇 번째인지 찾기
        for (int i = 0; i < n; i++) {
            result[i] = Arrays.asList(sorted).indexOf(emergency[i]) + 1;
        }
        
        return result;
    }
}