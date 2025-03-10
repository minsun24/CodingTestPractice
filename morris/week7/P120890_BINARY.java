import java.util.Arrays;

class P120890_BINARY {
    public int solution(int[] array, int n) {
        int len = array.length;
        int[] tempArray = Arrays.copyOf(array, len + 1);
        tempArray[len] = n;
        Arrays.sort(tempArray);

        int index = Arrays.binarySearch(tempArray, n);

        if (index == 0) return tempArray[1]; 
        if (index == len) return tempArray[len - 1]; 

        int preDiff = Math.abs(tempArray[index - 1] - n);
        int nextDiff = Math.abs(tempArray[index + 1] - n);

        if (preDiff <= nextDiff) {
            return tempArray[index - 1];
        } else {
            return tempArray[index + 1];
        }
    }
}