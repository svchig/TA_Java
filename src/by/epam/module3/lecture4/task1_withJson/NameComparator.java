package by.epam.module3.lecture4.task1_withJson;

import java.util.Comparator;

/**
 * Created by Siarhei_Chyhir on 11/20/2015.
 */
public class NameComparator implements Comparator<Candy> {

    @Override
    public int compare(Candy o1, Candy o2) {
        return o1.getName().compareToIgnoreCase(o2.getName());
    }
}
