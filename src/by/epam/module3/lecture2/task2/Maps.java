package by.epam.module3.lecture2.task2;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

/**
 * Created by Siarhei_Chyhir on 11/3/2015.
 */
public class Maps {
    Map hashMap = new HashMap();
    Map treeMap = new TreeMap();

    public void compareMapAddintion(){
        System.out.println("the result of 10000 items addition is \nHashMap = " + MyMapUtil.getTimeMsOfInsert(hashMap) + " Ms\nTreeMap = " + MyMapUtil.getTimeMsOfInsert(treeMap) + " Ms");
    }
    public void compareMapSerching(){
        System.out.println("the result of searching from 10000 items is \nHashMap = " + MyMapUtil.getTimeMsOfSearch(hashMap) + " Ms\nTreeMap = " + MyMapUtil.getTimeMsOfSearch(treeMap) + " Ms" );
    }
    public void compareMapContain(){
        System.out.println("the result of checking on contain of 100000 items in 10000 items is \nHashMap = " + MyMapUtil.getTimeMsOfContain(hashMap) + " Ms\nTreeMap = " + MyMapUtil.getTimeMsOfContain(treeMap) + " Ms" );
    }
    public void compareMapRemoving(){
        System.out.println("the result of 10000 items removing is \nHashMap = " + MyMapUtil.getTimeMsOfRemove(hashMap) + " Ms\nTreeMap = " + MyMapUtil.getTimeMsOfRemove(treeMap) + " Ms");
    }

}
