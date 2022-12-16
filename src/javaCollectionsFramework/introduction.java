/**
 * java collections framework
 * JCF - Collection interface - root of java collection framework
 * CI - List - allows add and del like an array. moreover use sets to store unique elements
 * Map-key -id and value
 * ,Iteration - mtds for adding queue,
 * Arraylist - use it for resizable arrays
 * set - store elements in different sets
 * java vector is the same as arrayList
 */
package javaCollectionsFramework;

import java.util.ArrayList;
import java.util.*;
import java.util.LinkedList;

class arrayList{
    ArrayList <String> Subjects = new ArrayList<>();
    //creating an arraylist from the list interface
    List <Integer> Nums = new ArrayList<>();

    public void arrayList(){
        Subjects.add("Maths");
        Subjects.add("English");
        Nums.add(4);Nums.add(2);Nums.add(8);Nums.add(1);
        Subjects.get(1); //get a certain index
       // System.out.println("ArrayList" + Subjects);
        //sorting from the smallest to the largest
        Nums.sort(Comparator.naturalOrder());
        System.out.println("String: " + Nums.toString());


        //sorting from the largest to the smallest
        Nums.sort(Comparator.reverseOrder());
        System.out.println("Large to small" + Nums);
    }
}
class linkedList{
    List<Integer> Nums = new java.util.LinkedList<>();
    public void linkedList(){
        Nums.add(2);Nums.add(3);Nums.add(5);Nums.add(7);
        System.out.println("LinkedList: " + Nums);
        //Nums.removeAll(Nums);
        Nums.clear();
        System.out.println("LinkedList: " + Nums);
    }
}
class stack{
    Stack<String> Stack = new Stack<>();
    public void accessStack(){
        Stack.push("cow");
        Stack.push("bull");
        Stack.push("goat");
        System.out.println("Stack:" + Stack);
       String top=  Stack.peek();
        System.out.println(top);
        Stack.pop();
        System.out.println("Stack:" + Stack);
    }
}


public class introduction {
    public static void main(String[] args) {
//arrayList accessArray = new arrayList();
//accessArray.arrayList();
        //linkedList accessLinked = new linkedList();
        //accessLinked.linkedList();
        stack stack = new stack();
        stack.accessStack();

    }
}
