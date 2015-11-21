package by.epam.module3.lecture2.task2;

import java.util.Collection;
import java.util.Date;

/**
 * Created by Siarhei_Chyhir on 11/4/2015.
 */
public class CollectionPerformanceTest {

    private static void insert(Collection collection)
    {
        for (int i=0;i<100000;i++){
            collection.add(i);}
    }

    private static void search(Collection collection)
    {
        for (int i = 0; i < 100000; i++) {
            collection.contains(i);
        }
    }


    private static void remove(Collection collection)
    {
            collection.removeAll(collection);
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

    public static long getTimeMsOfRemove(Collection collection)
    {
        Date currentTime = new Date();

        remove(collection);

        Date newTime = new Date();
        long msDelay = newTime.getTime() - currentTime.getTime();
        return msDelay;
    }

}
