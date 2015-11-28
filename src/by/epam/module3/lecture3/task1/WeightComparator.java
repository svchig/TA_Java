package by.epam.module3.lecture3.task1;

import by.epam.module3.lecture3.CustomExceptions.InvalidWeightException;

import java.util.Comparator;

/**
 * Created by Siarhei_Chyhir on 11/19/2015.
 */
public class WeightComparator implements Comparator<Candy>{

    @Override
    public int compare(Candy o1, Candy o2) {

        try {
            return o1.getWeight() < o2.getWeight() ? -1: o1.getWeight() == o2.getWeight() ? 0 : 1;
        } catch (InvalidWeightException e) {
            e.printStackTrace();
            return 0;
        }
    }

}
