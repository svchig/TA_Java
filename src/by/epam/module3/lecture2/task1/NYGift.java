package by.epam.module3.lecture2.task1;

import java.util.ArrayList;
import java.util.Collections;


/**
 * Created by Siarhei_Chyhir on 11/5/2015.
 */
public class NYGift extends ArrayList<Candy>{
    public int getPackWeight() {
        int summ = 0;
        for (Candy candy : this) {
            summ = summ + candy.getWeight();
        }
        return summ;
    }

    public void sortByName(){
        System.out.println("Sorting by name:");
        Collections.sort(this, Candy.GiftNameComparator);
    }

    public void sortByWeight(){
        System.out.println("Sorting by weight:");
        Collections.sort(this, Candy.GiftWeightComparator);
    }

    public void toShowCandy(){
        for(Candy str: this){
            System.out.println(str);
        }
    }

}
