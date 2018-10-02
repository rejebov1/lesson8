package by.it.academy.lesson8;

import java.util.HashMap;
import java.util.TreeMap;

public class Main {
    public static void main(String[] args) {
        HashMap<Key, String> hashMap = new HashMap<>();
        TreeMap<Key, String> treeMap = new TreeMap<>();
        Key key1 = new Key(0, "First");
        hashMap.put(key1, "значение1");
        Key key2 = new Key(0, "First");
        hashMap.put(key2, "значение2");

        Key key3 = new Key(0, "First");
        treeMap.put(key3, "значение3");
        Key key4 = new Key(0, "First");
        treeMap.put(key4, "значение4");

        System.out.println("hash:\t ");
        for (Key a : hashMap.keySet()) {
            System.out.println(hashMap.get(a));
        }

        System.out.println("tree:\t ");
        for (Key a : treeMap.keySet()) {
            System.out.println(treeMap.get(a));
        }

    }
}