package by.epam.module3.lecture2.task2;

import java.util.*;

/**
 * Created by Siarhei_Chyhir on 11/3/2015.
 */
public class CompareCollectionsPerformanceProgram {

    public static void main(String[] args){

        System.out.println("This program compares the performance of collections");

        System.out.println("\nLists:");
        List arrayList = new ArrayList();
        List linkedList = new LinkedList();
        System.out.println("The result of 10000 items addition is \n" +
                "ArrayList = " + CollectionPerformanceTest.getTimeMsOfInsert(arrayList) + " Ms\n" +
                "LinkedList = " + CollectionPerformanceTest.getTimeMsOfInsert(linkedList) + " Ms");
        System.out.println("The result of searching of 100000 items in 10000 items is \n" +
                "ArrayList = " + CollectionPerformanceTest.getTimeMsOfSearch(arrayList) + " Ms\n" +
                "LinkedList = " + CollectionPerformanceTest.getTimeMsOfSearch(linkedList) + " Ms" );
        System.out.println("The result of 10000 items removing is \n" +
                "ArrayList = " + CollectionPerformanceTest.getTimeMsOfRemove(arrayList) + " Ms\n" +
                "LinkedList = " + CollectionPerformanceTest.getTimeMsOfRemove(linkedList) + " Ms");

        System.out.println("\nSets:");
        Set hashSet = new HashSet();
        Set treeSet = new TreeSet();
        System.out.println("The result of 10000 items addition is \n" +
                "HashSet = " + CollectionPerformanceTest.getTimeMsOfInsert(hashSet) + " Ms\n" +
                "TreeSet = " + CollectionPerformanceTest.getTimeMsOfInsert(treeSet) + " Ms");
        System.out.println("The result of searching of 100000 items in 10000 items is \n" +
                "HashSet = " + CollectionPerformanceTest.getTimeMsOfSearch(hashSet) + " Ms\n" +
                "TreeSet = " + CollectionPerformanceTest.getTimeMsOfSearch(treeSet) + " Ms" );
        System.out.println("The result of 10000 items removing is \n" +
                "HashSet = " + CollectionPerformanceTest.getTimeMsOfRemove(hashSet) + " Ms\n" +
                "TreeSet = " + CollectionPerformanceTest.getTimeMsOfRemove(treeSet) + " Ms");

        System.out.println("\nMaps:");
        Map hashMap = new HashMap();
        Map treeMap = new TreeMap();
        System.out.println("The result of 10000 items addition is \n" +
                "HashMap = " + MapPerformanceTest.getTimeMsOfInsert(hashMap) + " Ms\n" +
                "TreeMap = " + MapPerformanceTest.getTimeMsOfInsert(treeMap) + " Ms");
        System.out.println("The result of searching of 100000 items in 10000 items is \n" +
                "HashMap = " + MapPerformanceTest.getTimeMsOfSearch(hashMap) + " Ms\n" +
                "TreeMap = " + MapPerformanceTest.getTimeMsOfSearch(treeMap) + " Ms" );
        System.out.println("The result of 10000 items removing is \n" +
                "HashMap = " + MapPerformanceTest.getTimeMsOfRemove(hashMap) + " Ms\n" +
                "TreeMap = " + MapPerformanceTest.getTimeMsOfRemove(treeMap) + " Ms");
    }

}
