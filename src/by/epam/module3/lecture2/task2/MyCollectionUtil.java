package by.epam.module3.lecture2.task2;

import java.util.Collection;
import java.util.Date;

/**
 * Created by Siarhei_Chyhir on 11/4/2015.
 */
public class MyCollectionUtil {

    public static void insert(Collection collection)
    {
        for (int i=0;i<10000;i++){
            collection.add(i);}
    }

    public static void insert(Collection collection, Integer count)
    {
        for (int i=0;i<count;i++){
        collection.add(i);}
    }

    public static void search(Collection collection)
    {
        for (Object item : collection){
            if (item.equals(5000)) break;
        }
    }

    public static void search(Collection collection, Object o)
    {
        for (Object item : collection){
            if (item.equals(o)) break;
        }
    }

    public static void contain(Collection collection)
    {
        for (int i = 0; i < 100000; i++) {
            collection.contains(i);
        }
    }

    public static void contain(Collection collection, Object o)
    {
        for (int i = 0; i < 100000; i++) {
            collection.contains(o);
        }
    }

    public static void remove(Collection collection)
    {
            collection.removeAll(collection);
    }

    public static void remove(Collection collection, Object o)
    {
        for (Object item : collection){
            if (item.equals(o)) collection.remove(o);
        }
    }

    public static long getTimeMsOfInsert(Collection collection)
    {
        Date currentTime = new Date();

        insert(collection);

        Date newTime = new Date();
        long msDelay = newTime.getTime() - currentTime.getTime();
        return msDelay;
    }

    public static long getTimeMsOfSearch(Collection collection) {
        Date currentTime = new Date();

        search(collection);

        Date newTime = new Date();
        long msDelay = newTime.getTime() - currentTime.getTime();
        return msDelay;
    }

    public static long getTimeMsOfContain(Collection collection) {
        Date currentTime = new Date();

        contain(collection);

        Date newTime = new Date();
        long msDelay = newTime.getTime() - currentTime.getTime();
        return msDelay;
    }

    public static long getTimeMsOfRemove(Collection collection)
    {
        Date currentTime = new Date();

        remove(collection);

        Date newTime = new Date();
        long msDelay = newTime.getTime() - currentTime.getTime();
        return msDelay;
    }

}
