public class p4949 {
    public static void main(String[] args) {
        String str1 = "So when I die (the [first] I will see in (heaven) is a score list).";    // yes
        String str2 = "A rope may form )( a trail in a maze.";                                  // no

        String[] strs = {str1, str2};
        for(String str : strs) {
            String result = solution(str);
            System.out.println(result);
        }
    }

    public static String solution(String str) {
        int pCount = 0;
        int sCount = 0;

        for(int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            if(ch == '(') {
                pCount++;
            } else if (ch == ')') {
                pCount--;
                if(pCount < 0) {
                    return "no";
                }
            } else if (ch == '[') {
                sCount++;
            } else if (ch == ']') {
                sCount--;
                if(sCount < 0) {
                    return "no";
                }
            }
        }
        return sCount == 0 && pCount == 0 ? "yes" : "no";
    }
}
