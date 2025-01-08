import java.util.Arrays;

public class p1 {
    public static void main(String[] args) {
        String str1 = "The Curious Case of Benjamin Button";
        String str2 = " The first character is a blank";
        String str3 = "The last character is a blank ";
        String str4 = "Continuos    blanks";

        String[] strs = {str1, str2, str3, str4};

        for(String str : strs) {
            int result = solution(str);
            System.out.println(result);
        }
    }

    public static int solution(String myString) {
        String[] strArr = myString.trim().split("\\s+");
        System.out.println(Arrays.toString(strArr));
        System.out.println(strArr.length);
        return strArr.length;
    }
}