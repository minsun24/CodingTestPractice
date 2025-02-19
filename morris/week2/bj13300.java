import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[][] students = new int[6][2]; // 0.학년, 1.성별
        
        
        for (int i = 0; i < n; i++) {
            // 성별, 학년 무작위 n번 입력
            // 성별, 학년 입력
            int s = sc.nextInt();    
            int y = sc.nextInt();
            
            if (s == 0) {
                students[y-1][0]++;   
            } else {
                students[y-1][1]++;
            }
        }
        
        int result = 0; // 필요한 방의 개수
        
        for (int g = 0; g < 6; g++) {
            for (int s = 0; s <= 1; s++) {
                result += (students[g][s] + k -1) / k; // 올림 계산
            }
        }
        System.out.print(result);
    }
}
