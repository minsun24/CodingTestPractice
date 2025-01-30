// b a n a n a [6] = [-1, -1, -1, 2, 2, 2]
// 0 1 2 3 4 5
// 0번 원소는 무조건 -1 처리
// 뒤에서부터 탐색해서 카운팅(1부터), 같은 문자를 찾으면 카운팅 값을 answer에 입력, 카운트 1로 초기화, 그 앞 원소부터 다시 탐색 진행
class False {
    public int[] solution(String s) {
        int[] answer = new int[s.length()];
        int count = 1;
        
        // 거꾸로 순회하는 로직 : 전체 로직을 작은 단위로, 간단한 형태로 나눠서 구현하기
        for (int i = s.length() - 1; i >= 0; i--) {
            // 로그를 찍어서 제대로 나오는지 확인
            // System.out.println("i : "+s.charAt(i));
            
            // 0번째 원소는 무조건 -1 처리
            if (i == 0) {
                answer[i] = -1;
            }
            // 바로 앞의 원소와 비교
            for (int j = i - 1; j >= 0; j--) {
                // 카운팅하기
                count++;
                System.out.println(count);
                // 같으면 answer에 카운트값 대입, 카운팅을 1로 초기화, i의 값을 그 전 원소로 이동 (-1)
                if (s.charAt(i) == s.charAt(j)) {
                    answer[i] = count;
                    count = 1;
                    i -= 1;
                // 같은 문자가 없으면 -1로 처리, 카운트 값도 1로 초기화
                } else {
                    answer[i] = -1;
                    count = 1;
                }
            }
        }
        return answer;
    }
}