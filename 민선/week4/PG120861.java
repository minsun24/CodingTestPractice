package week4;

/* 문제. 프로그래머스(입문) - 캐릭터의 좌표 */
/* 접근 방식 1. 해결
    명령어 배열 for문 돌려서, if문으로 조건 탐색
    switch-case 사용
 */
/* 참고
     switch-case문은 주솟값 비교(==) 라고 알고 있는데,
     String도 switch-case문으로 사용이 가능한가? 라는 의문
     => 원래 swtich-case문은 (==) 비교 -> JDK 1.7 부터는 switch 대조로 String값을 사용할 수 있다.
     => 내부적으로는 ==이 아니라 String.equals()를 사용해 비교
     switch가 String을 비교할 때, hashCode()와 equals()를 함께 사용 -> 즉, switch는 O(1) (상수 시간)에 가깝게 동작할 수 있음.


 */


public class PG120861 {
    public static void main(String[] args) {
        String[] keyinput = {};     // keyinput : 좌, 우, 상, 하 명령어
        int[] board = {};   // board : 맵 크기
        int[] answer = new int[2];  // x, y 좌표 담을 배열

        int xSize = board[0]/2;   // 맵의 가로 크기
        int ySize = board[1]/2;   // 맵의 세로 크기 

        // 캐릭터 초기 위치 : [0,0]
        int x = 0;
        int y = 0;

        // if문
        for(String command : keyinput){
            if(command.equals("left") && x != (-xSize)){
                x --;
            }
            if(command.equals("right") && x != xSize){
                x ++;
            }
            if(command.equals("down") && y != (-ySize)){
                y --;
            }
            if(command.equals("up") && y != ySize){
                y ++;
            }
        }
        // 2. switch-case문
        for (String command : keyinput) {
            switch (command) {
                case "left":
                    if (x > -xSize) x--;
                    break;
                case "right":
                    if (x < xSize) x++;
                    break;
                case "down":
                    if (y > -ySize) y--;
                    break;
                case "up":
                    if (y < ySize) y++;
                    break;
            }
        }


        answer[0] = x;
        answer[1] = y;

//        return answer;
        System.out.println("answer = " + answer);
    }
}
