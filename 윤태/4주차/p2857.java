import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class p2857 {
    public static void main(String[] args) {
        // BufferedReader로 변경
        Scanner sc = new Scanner(System.in);

        List<String> answerList = new ArrayList<>();

        // 5줄 순회
        for(int i = 0; i < 5; i++) {
            String str = sc.nextLine();

            // 입력 받은 한 줄에 대해 "-"로 분리하여 배열에 저장(필요 없음)
            String[] arr = str.split("-");

            // 배열 순회
            for(int j = 0; j < arr.length; j++) 
            {
                // 순회 중 FBI 문자가 있다면 추가 후 break;
                if(arr[j].contains("FBI")) {
                    answerList.add(String.valueOf(i));
                    break;
                }
            }
        }
        
        // FBI가 있으면
        if(!answerList.isEmpty()) {

            // 공백으로 구분해서 한 줄에 출력
            for (String str : answerList) {
                System.out.print((Integer.parseInt(str) + 1) + " ");
            }
        } else {
            // FBI가 없으면 메시지 출력
            System.out.println("HE GOT AWAY!");
        }

        sc.close();
    }
}
