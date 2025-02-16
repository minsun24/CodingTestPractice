// 배열 회전시키기 (system.arraycopy 사용)
class Solution {
    public int[] solution(int[] numbers, String direction) {
        int len = numbers.length;
        int[] answer = new int[len];
        
        if (direction.equals("right")) {
            answer[0] = numbers[len -1];
            // JNI 사용 (C++과 연동)
            // System.arraycopy(원본배열, 원본 복사 시작 인덱스, 대상 배열, 대상 배열 데이터를 넣을 시작 인덱스, 복사할 요소 개수)
            System.arraycopy(numbers, 0, answer, 1, len -1);
        } else {
            answer[len -1] = numbers[0];
            System.arraycopy(numbers, 1, answer, 0, len -1);
        }
        return answer;
    }
}