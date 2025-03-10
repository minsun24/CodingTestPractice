import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class P32283 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        String S = br.readLine();

        br.close();

        // N자리수의 2진수 모두 생성
        List<String> binaryNumbers = new ArrayList<>();
        // for (int i = 0; i < (int) Math.pow(2, N); i++) {
        for (int i = 0; i < (1 << N); i++) {
            // String.format("%5s", "101") => "  101" => 공백으로 채우기
            String binary = String.format("%" + N + "s", Integer.toBinaryString(i)).replace(' ', '0');
            binaryNumbers.add(binary);
        }

        // 정렬 적용
        binaryNumbers.sort((a, b) -> {
            int countA = countOnes(a);
            int countB = countOnes(b);
            if (countA != countB) {
                return countA - countB; // 1의 개수 오름차순
            }
            
            // compareTo()는 문자열을 사전순으로 비교하는 함수
            return reverseBinary(a).compareTo(reverseBinary(b));
        });

        // 위치 찾기
        int index = binaryNumbers.indexOf(S);
        System.out.println(index);
    }

    // 1 개수 count
    private static int countOnes(String binary) {
        int count = 0;
        for (char c : binary.toCharArray()) {
            if (c == '1') count++;
        }
        return count;
    }

    // 이진수 뒤집기
    private static String reverseBinary(String binary) {
        return new StringBuilder(binary).reverse().toString();
    }
}
