package by.epam.module3.lecture2.task2;

import java.util.Date;
import java.util.Map;

/**
 * Created by Siarhei_Chyhir on 11/4/2015.
 */
public class MapPerformanceTest {

    private static void insert(Map map)
    {
        for (int i=0;i<100000;i++){
            map.put(i, i);
        }
    }

    private static void search(Map map) {
        for (int i = 0; i < 100000; i++) {
            map.values().contains(i);
        }
    }

    private static void remove(Map map) {
        map.values().removeAll(map.values());
    }


    public static long getTimeMsOfInsert(Map map) {
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

    public static long getTimeMsOfRemove(Map map) {
        Date currentTime = new Date();

        remove(map);

        Date newTime = new Date();
        long msDelay = newTime.getTime() - currentTime.getTime();
        return msDelay;
    }
}
