import java.util.TreeMap;
import java.util.Comparator;

class Solution {
    public int[] solution(int[] emergency) {
        int len = emergency.length;
        TreeMap<Integer, Integer> eMap = new TreeMap<>(Comparator.reverseOrder());
        
        for (int i = 0; i < len; i++) {
            eMap.put(emergency[i], i);
        }
        
        return eMap.values().stream().mapToInt(Integer::intValue).toArray();
    }
}