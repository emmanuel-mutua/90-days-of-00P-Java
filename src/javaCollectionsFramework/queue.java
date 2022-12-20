package javaCollectionsFramework;

import java.util.LinkedList;
import java.util.Queue;

public class queue {
    public static void main(String[] args) {
        Queue<Integer> numbers = new LinkedList<>();
        numbers.offer(1);
        numbers.offer(2);
        numbers.offer(3);

        System.out.println(numbers);
        int accessedNum = numbers.peek();
        System.out.println("peek no: " + accessedNum);

        // to remove an element from a queue
        int removed = numbers.poll();
        System.out.println("removed: " + removed);
    }
}
