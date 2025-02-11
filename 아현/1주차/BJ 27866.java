/*
단어 S와 정수i가 주어졌을 때, S의 i번째 글자를 출력하는 프로그램을 작성하시오.
첫째 줄에 영어 소문자와 대문자로만 이루어진 단어 S가 주어진다. 단어의 길이는 최대 1,000이다.
둘째 줄에 정수 i가 주어진다.
S의 i번째 글자를 출력한다. 
*/

import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        String str = sc.next();                     //단어str을  입력받음
        int a = sc.nextInt()-1;                     //배열이므로 0~n-1까지 위치의 문자를 출력
        
        System.out.println(str.charAt(a));          //char형을 사용하여 a번째 글자 반환
      
    }
}
