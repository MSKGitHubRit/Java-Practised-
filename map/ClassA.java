package map;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Map.Entry;

public class ClassA {

    public void m1() {
        System.out.println("implementing the map interface");
        HashMap<Object, Object> map = new HashMap<Object, Object>();
        // collections method only acceptable for only collection not map not support the
        // collections
        map.put("102", "KIshan");// insertion order not follows
        map.put("java", 103);// heterogenious keys and heterogenious values are allowed
        map.put(null, null);// nulls keys and null values are allowed
        map.put(107, "java");// duplicates values allowed
        map.put("Database", "Oracle");// available version from java 1.2 v
        map.put(103, "testing");// default size is 16
        map.put(108, "java");// size increases by double
        map.put("rahul", 109);// synchronization not allowed
        System.out.print(map);
        System.out.println("retrieving data from map using collections class only");
        ArrayList<Object> al = new ArrayList<Object>(map.keySet());
        System.out.println("using arraylist:" + al);
        HashSet<Object> set = new HashSet<Object>(map.keySet());
        System.out.println("using hashset:" + set);
        System.out.println("-----");
        System.out.println("Retrieving key-value pair");
        ArrayList<Object> al2 = new ArrayList<Object>(map.entrySet());
        System.out.println(al2);
        System.out.println(map.get("102"));
        map.put("102", "Kishan Basini"); // corrected spelling of "Kishan Basini"
        System.out.println(map);
        System.out.println(map.get("102"));
        System.out.println("----------");
        ArrayList<Object> al3 = new ArrayList<Object>(map.entrySet());
        System.out.println("Retrieving data in Forward and backward direction");
        // Iterator<Object>i=al3.iterator();
        ListIterator<Object> i = al3.listIterator();
        while (i.hasNext()) {
            System.out.println(i.next() + " ");
        }
        System.out.println();
        while (i.hasPrevious()) {
            System.out.println(i.previous());
        }
        System.out.println("------------");
        LinkedList<Object> ll = new LinkedList<Object>(map.entrySet());
        Iterator<Object> i4 = ll.iterator();
        System.out.println("reterving the only key and values");
        while (i4.hasNext()) {
            // System.out.println(i4.next());
            Entry e=(Entry)i4.next();
            System.out.println(e.getKey()+" "+e.getValue());
        }

    }

    public static void main(String[] args) {
        new ClassA().m1();
    }

}
