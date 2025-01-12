/*
    11719번 : 그대로 출력하기 2
    # 입력이 있을 때까지 계속 읽는 방법 : sc.hasNextLine()

 */
import java.util.*;

public class BJ11719 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while(sc.hasNextLine()){
            // 입력이 있을 때까지 계속 읽기
            String line = sc.nextLine();
            System.out.println(line) ;
        }

    }
}
