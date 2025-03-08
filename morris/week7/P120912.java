import java.util.Arrays;

class P120912 {
    public int solution(int[] array) {
        String st = Arrays.toString(array).replaceAll("[^0-9]", "");
        String noSeven = st.replaceAll("7", "");
        
        return st.length()-noSeven.length();
    }
}