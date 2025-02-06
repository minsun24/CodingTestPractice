package week4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Scanner;

/* 접근 1. indexOf() 사용 -> X
          indexOf()는 String 배열만 가능...
          
   접근 2. Map 사용
* */


public class BJ5598 {
    public static void main(String[] args) {
        // 올바른 알파벳 배열 생성
        char[] alphabet = new char[26];
        for (int i = 0; i < 26; i++) {
            alphabet[i] = (char) ('A' + i);
        }

        // 시저 암호 변환 테이블 생성
        char[] caesar = {'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T',
                'U', 'V', 'W', 'X', 'Y', 'Z', 'A', 'B', 'C'
        };

        HashMap<Character, Character> map = new HashMap<Character, Character>();
        for(int i=0; i<alphabet.length; i++){
            map.put(caesar[i], alphabet[i]);
        }

        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        String answer = "";

        for(int i=0; i<str.length(); i++){
            answer += Character.toString(map.get(str.charAt(i)));
        }
        System.out.println(answer);
        
    }
}
