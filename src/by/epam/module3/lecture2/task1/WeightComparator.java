package by.epam.module3.lecture2.task1;

import java.util.Comparator;

/**
 * Created by Siarhei_Chyhir on 11/19/2015.
 */
public class WeightComparator implements Comparator<Candy>{

    @Override
    public int compare(Candy o1, Candy o2) {

        return o1.getWeight() < o2.getWeight() ? -1: o1.getWeight() == o2.getWeight() ? 0 : 1;
    }

}
