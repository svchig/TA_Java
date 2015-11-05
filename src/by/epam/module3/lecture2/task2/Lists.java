package by.epam.module3.lecture2.task2;

import java.util.*;
import java.util.List;


/**
 * Created by Siarhei_Chyhir on 11/3/2015.
 */
public class Lists {
    List arrayList = new ArrayList();
    List linkedList = new LinkedList();

    public void compareListAddintion(){
        System.out.println("the result of 10000 items addition is \nArrayList = " + MyCollectionUtil.getTimeMsOfInsert(arrayList) + " Ms\nLinkedList = " + MyCollectionUtil.getTimeMsOfInsert(linkedList) + " Ms");
    }
    public void compareListSerching(){
        System.out.println("the result of searching from 10000 items is \nArrayList = " + MyCollectionUtil.getTimeMsOfSearch(arrayList) + " Ms\nLinkedList = " + MyCollectionUtil.getTimeMsOfSearch(linkedList) + " Ms" );
    }
    public void compareListContain(){
        System.out.println("the result of checking on contain of 100000 items in 10000 items is \nArrayList = " + MyCollectionUtil.getTimeMsOfContain(arrayList) + " Ms\nLinkedList = " + MyCollectionUtil.getTimeMsOfContain(linkedList) + " Ms" );
    }
    public void compareListRemoving(){
        System.out.println("the result of 10000 items removing is \nArrayList = " + MyCollectionUtil.getTimeMsOfRemove(arrayList) + " Ms\nLinkedList = " + MyCollectionUtil.getTimeMsOfRemove(linkedList) + " Ms");
    }

}
