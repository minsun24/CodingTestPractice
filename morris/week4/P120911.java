import java.util.Arrays;

class P120911 {
    public String solution(String my_string) {
        char[] ch = my_string.toLowerCase().toCharArray();
        Arrays.sort(ch);
        return new String(ch);
    }
}