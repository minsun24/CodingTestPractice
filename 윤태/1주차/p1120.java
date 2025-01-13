public class p1120 {
    public static void main(String[] args) {
        String[] arr1 = {"adaabc", "aababbc"};      // 2
        String[] arr2 = {"hello", "xello"};         // 1
        String[] arr3 = {"koder", "topcoder"};      // 1
        String[] arr4 = {"abc", "topabcoder"};      // 0
        String[] arr5 = {"giorgi", "igroig"};       // 6

        String[][] arr = {arr1, arr2, arr3, arr4, arr5};

        for(int i = 0; i < 5; i++) {
            int result = solution(arr[i][0], arr[i][1]);
            System.out.println(result);
        }
    }

    public static int solution(String str1, String str2) {
        int a = str1.length();
        int b = str2.length();
        int minDiff = Integer.MAX_VALUE;

        for (int i = 0; i <= b - a; i++) {
            int diff = 0;
            for(int j = 0; j < a; j++) {
                if(str1.charAt(j) != str2.charAt(i + j)) {
                    diff++;
                }
            }
            minDiff = Math.min(minDiff, diff);
        }
        System.out.println(str1 + ":" + str1.charAt(2));
        return minDiff;
    }
}
