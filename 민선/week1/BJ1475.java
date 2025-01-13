/*
    1475번 : 방 번호
    한 세트에는 0번부터 9번까지 숫자
    방 번호가 주어졌을 때, 필요한 세트의 개수의 최솟값을 출력
    % 6은 9를 뒤집어서 이용할 수 있고, 9는 6을 뒤집어서 이용할 수 있다.

    # 접근
    일단 방 번호 숫자 10씩 나눠가며 각 숫자 몇 개 들어있는지 확인
    가장 많은 숫자만큼 세트 필요 -> 6, 9 예외

    # 반례
    669  정답:2, 내 답:1


 */
import java.util.Scanner;

public class BJ1475 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] cnt = new int[10];
        int N = sc.nextInt(); // 방 번호

        while(N > 0){
            int num = N % 10;
            if(num == 9){
                cnt[6] --;
            }else if(num == 6){
                cnt[9] --;
            }else{
                cnt[num] ++;
            }
            N /= 10;
        }

        int max_ = 0;

        for(int i=0; i<cnt.length; i++){
            int num;
            if(i==6 || i==9){
                num = cnt[6] / 2 + 1;
            }else{
                num = cnt[i];
            }
            if(num > max_){
                max_ = num;
            }
        }

        System.out.println(max_);
    }
}
