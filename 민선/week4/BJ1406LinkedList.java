package week4;

/*
    문제. 백준  1406번 - 에디터

    연결 리스트(Linked List)으로 풀기
    - ListIterator를 활용하여 커서 위치를 관리

    ** ListIterator란 ?
    - 자바의 List 인터페이스에서 제공하는 <양방향 반복자>
    - 이전(previous), 다음(next)로 모두 이동 가능, 삭제/삽입도 가능
    -> Iterator는 양방향 이동 (L, D) 및 삽입, 삭제 (P x, B) 에 최적화됨

    - 양방향 이동
        next() - 현재 커서 위치의 요소를 반환하며 다음 위치로 이동
        previous() - 이전 요소를 반환하며 커서를 뒤로 이동
    - 삭제 : remove()
    - 추가 : add()



 */


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;


public class BJ1406LinkedList {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        // 문자열 입력
        String str = br.readLine();

        // 명령어 개수
        int M = Integer.parseInt(br.readLine());

        // Linked List로 변환
        LinkedList<Character> editor = new LinkedList<>();
        for(char ch : str.toCharArray()){
            editor.add(ch);
        }


        // List Iterator를 사용해 커서 위치 관리
        ListIterator<Character> cursor = editor.listIterator();

        // 커서 초기화
        // 문자열 맨 뒤로 이동
        while (cursor.hasNext()) {
            cursor.next();
        }

        // 명령어 처리
        for(int i=0; i<M; i++){
            String command = br.readLine();
            char cmd = command.charAt(0);

            switch(cmd){ // 커서를 왼쪽으로 한 칸 옮김
                case 'L' :
                    if(cursor.hasPrevious()){   // 커서가 문장의 맨 앞이 아니면,
                        cursor.previous();
                    }
                    break;
                case 'D':
                    if(cursor.hasNext()){       // 커서가 문장의 맨 뒤가 아니라면,
                        cursor.next();
                    }
                    break;
                case 'B':
                    if(cursor.hasPrevious()){
                        cursor.previous();
                        cursor.remove();
                    }
                    break;
                case 'P':
                    cursor.add(command.charAt(2));
                    break;
            }
        }
        for (char ch : editor) {
            sb.append(ch);
        }
        System.out.println(sb.toString());

    }
}
