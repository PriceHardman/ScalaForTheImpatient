package chapter04_maps_and_tuples.examples.ex02_java_interop;

import java.util.TreeMap;

public class MyJavaClass {
    public TreeMap<String, Integer> myMap = new TreeMap();

    MyJavaClass(){
        myMap.put("Alice", 10);
        myMap.put("Bob", 20);
        myMap.put("Charlie", 30);
    }

    public static void main(String[] args){
        scala.collection.mutable.Map mapFromScala = new MyScalaClass().myMap();
        TreeMap mapFromJava = new MyJavaClass().myMap;
        System.out.println("Scala: map(Alice) = " + mapFromScala.get("Alice"));
        System.out.println("Java: map(Alice) = " + mapFromJava.get("Alice"));
    }
}
