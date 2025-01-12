/*  1152 번 : 단어의 개수
    # 접근 : 문자열을 배열로 분리해서 배열 크기 출력하기
     - String[] array = String.split(구분자)

    # 시간복잡도 : O(n) -> split(" ")이 문자열을 한번 순회하며 분리.
    # 반례 : 아예 공백이 들어올 경우 -> 0개
 */
import java.util.Scanner;
import java.util.Arrays;


public class BJ1152 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine().trim(); // 문자열 한 줄 입력받아 str 변수에 저장

        if(str.length() == 0){
            System.out.println(0);
        }else{
            String[] list = str.split(" ");  // str 문자열을 공백(" ") 기분으로 분리해 list 배열에 담기
            System.out.println(list.length);
        }

    }
}
