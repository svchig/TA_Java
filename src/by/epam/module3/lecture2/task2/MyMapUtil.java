package by.epam.module3.lecture2.task2;

import java.util.Date;
import java.util.Map;

/**
 * Created by Siarhei_Chyhir on 11/4/2015.
 */
public class MyMapUtil {
    public static void insert(Map map)
    {
        for (int i=0;i<10000;i++){
            map.put(i, i);
        }
    }

    public static void insert(Map map, Integer count)
    {
        for (int i=0;i<count;i++){
            map.put(i, i);
        }
    }

    public static void search(Map map)
    {
        for (Object item : map.values()){
            if (item.equals(5000)) break;
        }
    }

    public static void search(Map map, Object o)
    {
        for (Object item : map.values()){
            if (item.equals(o)) break;
        }
    }

    public static void contain(Map map)
    {
        for (int i = 0; i < 100000; i++) {
            map.values().contains(i);
        }
    }

    public static void contain(Map map, Object o)
    {
        for (int i = 0; i < 100000; i++) {
            map.containsValue(o);
        }
    }

    public static void remove(Map map)
    {
        map.values().removeAll(map.values());
    }

    public static void remove(Map map, Object o)
    {
        for (Object item : map.values()){
            if (item.equals(o)) map.values().remove(o);
        }
    }

    public static long getTimeMsOfInsert(Map map)
    {
        Date currentTime = new Date();

        insert(map);

        Date newTime = new Date();
        long msDelay = newTime.getTime() - currentTime.getTime();
        return msDelay;
    }

    public static long getTimeMsOfSearch(Map map) {
        Date currentTime = new Date();

        search(map);

        Date newTime = new Date();
        long msDelay = newTime.getTime() - currentTime.getTime();
        return msDelay;
    }

    public static long getTimeMsOfContain(Map map) {
        Date currentTime = new Date();

        contain(map);

        Date newTime = new Date();
        long msDelay = newTime.getTime() - currentTime.getTime();
        return msDelay;
    }

    public static long getTimeMsOfRemove(Map map)
    {
        Date currentTime = new Date();

        remove(map);

        Date newTime = new Date();
        long msDelay = newTime.getTime() - currentTime.getTime();
        return msDelay;
    }
}
