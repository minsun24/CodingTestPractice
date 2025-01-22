import java.util.Scanner;

public class ArrayInput {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] array = new String[11]; // 길이 11의 배열 생성

        System.out.println("11개의 값을 입력하세요:");
        for (int i = 0; i < array.length; i++) {
            System.out.print("값을 입력하세요: ");
            array[i] = scanner.nextLine(); // 사용자 입력 값 배열에 저장
        }

        // 배열 출력 (공백 포함)
        System.out.println("입력된 값:");
        for (String value : array) {
            System.out.print(value + " ");
        }
        System.out.println(); // 줄바꿈

        // 찾을 정수 입력받기
        System.out.print("찾으려는 정수를 입력하세요: ");
        String target = scanner.nextLine();

        // 배열에서 정수 찾기
        boolean found = false;
        for (String value : array) {
            if (value.equals(target)) {
                found = true;
                break;
            }
        }

        // 결과 출력
        if (found) {
            System.out.println("입력한 정수가 배열에 존재합니다.");
        } else {
            System.out.println("입력한 정수가 배열에 존재하지 않습니다.");
        }
    }
}
