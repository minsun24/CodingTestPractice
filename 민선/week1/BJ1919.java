/*  1919 번 : 애너그램 만들기

    # 접근
    알파벳 개수 같으면 애너그램 가능




 */
import java.util.*;

public class BJ1919 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String first = sc.nextLine();
        String second = sc.nextLine();

        int[] a = new int['z' - 'a' + 1];
        int[] b = new int['z' - 'a' + 1];


        for(int i=0; i<first.length(); i++){
            char a_c = first.charAt(i);
            a[a_c - 'a'] ++;
        }

        for(int i=0; i<second.length(); i++){
            char b_c = second.charAt(i);
            b[b_c - 'a'] ++;
        }
        int cnt = 0;

        for(int i=0; i<a.length; i++){
            if(a[i] != b[i]){
                int sum = (a[i] - b[i]);

                if(sum < 0){
                    sum *= -1;
                }
                cnt += sum;
            }
        }
        System.out.println(cnt);

    }
}
