package javaCollectionsFramework.setDS;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SET {
    public static void main(String[] args) {
        Set<Integer> set1 = new HashSet<>();
        set1.add(1);
        set1.add(2);
        set1.add(3);
        System.out.println(set1);
        Set<Integer> set2 = new HashSet<>();
        set1.add(4);
        set1.add(5);
        set1.add(6);
        set2.addAll(set1);
        System.out.println("Union" + set2);
//iterator() is used to return an iterator that can be used to access the elements sequentially
        Iterator<Integer> iterate = set1.iterator();
        while (iterate.hasNext()){
            System.out.print(iterate.next());
            System.out.print(", ");
        }

        System.out.println("Intersection" + set1.retainAll(set2));
        boolean isSet2SubSetOfSet1 = set2.containsAll(set1);
        System.out.println("isSet2SubSetOfSe" + isSet2SubSetOfSet1);
    }

}
/**
 * set cannot have duplicates
 * set implemented by EnumSet, Hashset, LinkedHashSet, TreeSet
 * Sorted set and Navigable set extends set
 * method include add(), addAll(), contains(), containsAll(), remove(),
 * removeAll(),clear(), iterator() retainAll(), size(), hashCode() - address of the element in the set
 * <p>
 * set operations
 * union = x.addAll(y)
 * intersection = x.retainAll(y)
 * Subset = y.containAll(x)
 */