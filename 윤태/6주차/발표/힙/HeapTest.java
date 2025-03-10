import java.util.Collections;
import java.util.PriorityQueue;

public class HeapTest {
    public static void main(String[] args) {
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());

        
        System.out.println("요소 추가");
        System.out.println();

        maxHeap.add(15);
        System.out.println("15 추가");
        System.out.println(maxHeap);

        System.out.println();
        maxHeap.add(10);
        System.out.println("10 추가");
        System.out.println(maxHeap);

        System.out.println();
        maxHeap.add(8);
        System.out.println("8 추가");
        System.out.println(maxHeap);

        System.out.println();
        maxHeap.add(5);
        System.out.println("5 추가");
        System.out.println(maxHeap);

        System.out.println();
        maxHeap.add(4);
        System.out.println("4 추가");
        System.out.println(maxHeap);

        System.out.println();
        maxHeap.add(20);
        System.out.println("20 추가");
        System.out.println(maxHeap);

        System.out.println();

        System.out.println();
        System.out.println("요소 제거");
        maxHeap.poll();
        System.out.println("20 제거");
        System.out.println(maxHeap);
    }
}