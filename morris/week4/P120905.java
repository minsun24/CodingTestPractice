import java.util.ArrayList;

class P120905 {
    public int[] solution(int n, int[] numlist) {
        ArrayList<Integer> list = new ArrayList<>();
        
        for (int i = 0; i < numlist.length; i++) {
            if (numlist[i] % n == 0) {
                list.add(numlist[i]);
            }
        }
        
        int[] answer = list.stream().mapToInt(Integer::intValue).toArray();
        return answer;
    }
}

// import java.util.Arrays;

// class P120905 {
//     public int[] solution(int n, int[] numlist) {        
//         return Arrays.stream(numlist).filter(value -> value % n == 0).toArray();
//     }
// }