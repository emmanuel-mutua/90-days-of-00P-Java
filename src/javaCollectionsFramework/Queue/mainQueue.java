package javaCollectionsFramework.Queue;

import java.util.*;

public class mainQueue {
    //different implementations of queue
    Queue <String> names = new LinkedList<>();
    //heap ds
    static Queue <String> schools = new PriorityQueue<>();

    Queue <String> buildings = new ArrayDeque<>();

    public static void mtd(){
        schools.add("gatunfu");
        System.out.println(schools);
    }
    public static void main(String[] args) {
mtd();
    }
}


/**
 * java queue is implemented by ArrayDeque, priorityQueue and LinkedList
 * interfaces that implement Queue include deque , blockingDeque , blockingQueue
 * i think that the best methods to use for a queue includes: .offer() = to add ,
 * .peek() = the head element , .poll() - to remove an element instead of .add() .element() .remove()
 */