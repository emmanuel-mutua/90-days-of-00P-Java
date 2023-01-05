package javaCollectionsFramework.Queue;

import java.util.*;

public class deque {
    Deque <Integer> numbers = new LinkedList<>();
   ArrayList<Integer> nums = new ArrayList(Arrays.asList(1,2,3,4,6));
    //methods of the deque ds
    public void deque(){
//        numbers.addFirst(9);
////        numbers.addAll(nums);
////        numbers.addLast(23);
        //numbers.addFirst(2);
        numbers.offerFirst(33);
        numbers.offerLast(44);
        numbers.pollFirst();
        System.out.println("First num " + numbers.peekFirst());
        System.out.println("First num " + numbers.getFirst());
        System.out.println("Last num" + numbers.peekLast());


        System.out.println(numbers);
    }

    public static void main(String[] args) {
deque deque = new deque();
deque.deque();
    }
}
