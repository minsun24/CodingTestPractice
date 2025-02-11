package week1;

/*
    11721번 : 열 개씩 끊어 출력하기

    # 접근 : substring으로 0~9번 인덱스까지 추출

 */
import java.util.*;

public class BJ11721 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();

        while (str.length() > 0) {
            if (str.length() > 10) {
                System.out.println(str.substring(0, 10));  // 0~9까지 10글자 출력
                str = str.substring(10);  // 나머지 부분으로 갱신
            } else {
                System.out.println(str);  // 남은 글자 출력
                break;  // 출력 후 종료
            }
        }

    }
}
