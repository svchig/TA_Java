package by.epam.module3.lecture2.task2;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

/**
 * Created by Siarhei_Chyhir on 11/3/2015.
 */
public class Sets{
    Set hashSet = new HashSet();
    Set treeSet = new TreeSet();

    public void compareSetAddintion(){
        System.out.println("the result of 10000 items addition is \nHashSet = " + MyCollectionUtil.getTimeMsOfInsert(hashSet) + " Ms\nTreeSet = " + MyCollectionUtil.getTimeMsOfInsert(treeSet) + " Ms");
    }
    public void compareSetSerching(){
        System.out.println("the result of searching from 10000 items is \nHashSet = " + MyCollectionUtil.getTimeMsOfSearch(hashSet) + " Ms\nTreeSet = " + MyCollectionUtil.getTimeMsOfSearch(treeSet) + " Ms" );
    }
    public void compareSetContain(){
        System.out.println("the result of checking on contain of 100000 items in 10000 items is \nHashSet = " + MyCollectionUtil.getTimeMsOfContain(hashSet) + " Ms\nTreeSet = " + MyCollectionUtil.getTimeMsOfContain(treeSet) + " Ms" );
    }
    public void compareSetRemoving(){
        System.out.println("the result of 10000 items removing is \nHashSet = " + MyCollectionUtil.getTimeMsOfRemove(hashSet) + " Ms\nTreeSet = " + MyCollectionUtil.getTimeMsOfRemove(treeSet) + " Ms");
    }

}
