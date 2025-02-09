package week3;

/*    문제 : 백준 1406번 - 에디터

     접근방식 1. 일반 배열 - 시간초과 및 잘못된 접근 방식
     접근방식 2. StringBuilder 사용 -> 해결 but. 비효율적인 방식
        insert()
        deleteCharAt()

    3. (스택, 연결리스트로 재풀이 필요)

 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BJ1406StringBuilder {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        StringBuilder sb = new StringBuilder(str);
//        System.out.println("입력받은 문자열: " + sb.toString());


        int M = Integer.parseInt(br.readLine());    // 명령어 개수
//        System.out.println("명령어 개수 = " + M);


        int cursor = sb.length()-1;    // 초기에 커서는 맨 뒤에 위치
//        System.out.println("cursor = " + cursor);
        for(int i=0; i<M; i++){
            String command = br.readLine();
//            System.out.println("command = " + command);
            StringBuilder cb = new StringBuilder(command);

            char ch = cb.charAt(0);

//            if(cursor == 0 || cursor == (sb.length()-1)){
//                continue;
//            }
            if(ch == 'L'){
                if(cursor != -1){
                    cursor --;
                }

            }else if(ch == 'D'){
                if(cursor != (sb.length()-1)){
                    cursor ++;
                }
            }else if(ch == 'B'){
                if(cursor != -1){
                    sb.deleteCharAt(cursor);
                    cursor --;
                }
            }else{

                String s = Character.valueOf(cb.charAt(2)).toString();
                sb.insert(cursor + 1, s);
                cursor ++;
            }
//            System.out.println("sb = " + sb);
//            System.out.println("cursor = " + cursor);


        }
        String result = sb.toString();


        System.out.println(result);
    }
}
