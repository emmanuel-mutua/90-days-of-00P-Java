package javaCollectionsFramework.map;

import java.util.EnumMap;
import java.util.Map;

public class Enum {
    enum Size{
        SMALL, MEDIUM,LARGE,EXTRA_LARGE
    }
    enum Data{
        data1, data2, data3, data4
    }
    public static void main(String[] args) {
        Map <Data, Integer> enum1 = new EnumMap<Data, Integer>(Data.class);
        enum1.put(Data.data1, 10);
        enum1.put(Data.data2, 20);
        enum1.put(Data.data3, 30);
        System.out.println(enum1);

        Map<Data, Integer> enum2 = new EnumMap<Data, Integer>(Data.class);
        enum2.putAll(enum1);
        enum2.put(Data.data4, 40);
        System.out.println(enum2);

        //getting key/map
        System.out.println("Key/Map values: " + enum2.entrySet());

        //getting the key
        System.out.println("Key: " + enum2.keySet());

        //getting the value of the map
        System.out.println("The values: " + enum2.values());

        //getting the value of a certain key
        System.out.println("Value of data3:" + enum2.get(Data.data3)  );

        //removing the values of different enum keys
       int removed =  enum2.remove(Data.data4);
        System.out.println("Removed:" + removed);

        //to replace
        enum2.replace(Data.data3, 40);
        enum2.replace(Data.data2, 20,60);
        System.out.println("after replacement" + enum1.values());
        //replace all
        enum2.replaceAll((key,OldValue)-> OldValue+3);
        System.out.println("after replacing all: " + enum2.values());


            if (enum2.containsKey(Data.data3)){
                System.out.println("key found at pos: ");
            }else {
                System.out.println("Key not found");
            }

    }
}
