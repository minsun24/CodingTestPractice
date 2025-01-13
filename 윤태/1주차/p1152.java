public class p1152 {
    public static void main(String[] args) {
        String str1 = "The Curious Case of Benjamin Button";
        String str2 = " The first character is a blank";
        String str3 = "The last character is a blank ";
        String str4 = "Continuos    blanks";
        String str5 = "";
        String str6 = " ";

        String[] strs = {str1, str2, str3, str4, str5, str6};

        for(String str : strs) {
            int result = solution(str);
            System.out.println(result);
        }
    }

    public static int solution(String myString) {
        String trimed = myString.trim();
        if(trimed.isEmpty()) {
            return 0;
        } else {
            String[] words = trimed.split("\\s+");
            return words.length;
        }
    }
}