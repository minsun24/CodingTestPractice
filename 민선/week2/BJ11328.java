package week2;

/* 문제. [백준] 11328번 - Strfry
*
*   strfy함수는 입력된 문자열을 무작위로 "재배열"하여 새로운 문자열을 만들어낸다.
*   % : 여기에서 입력된 문자열과 새로 재배열된 문자열이 다를 필요는 없다.
*     : 2번째 문자열이 1번째 문자열에 strfry 함수를 적용하여 얻어질 수 있는지
 * */

/* 접근방식.
*   애너그램이랑 똑같은 것.
* */
import java.util.*;

public class BJ11328 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        int n = sc.nextInt();       // 테스트 케이스 개수

        for(int i=0; i<n; i++){
            int[] a = new int['z' - 'a' + 1];
            int[] b = new int['z' - 'a' + 1];
            String first = sc.next();
            String second = sc.next();
//            System.out.println("first = " + first);
//            System.out.println("second = " + second);

            for(int j=0; j<first.length(); j++){
                char ch = first.charAt(j);   // char
//                System.out.println("ch = " + ch);
                a[ch - 'a'] ++ ;
            }
            for(int j=0; j<second.length(); j++){
                char ch = second.charAt(j);   // char
//                System.out.println("ch = " + ch);
                b[ch - 'a'] ++ ;
            }
            String answer = "Possible";
            for(int cnt=0; cnt<a.length; cnt++){
                if(a[cnt] != b[cnt]){
                    answer = "Impossible";
                    break;
                }
            }

            System.out.println(answer);



        }


    }
}
