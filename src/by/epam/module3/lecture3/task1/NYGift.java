package by.epam.module3.lecture3.task1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


/**
 * Created by Siarhei_Chyhir on 11/5/2015.
 */
public class NYGift {
    List<Candy> candy1 = new ArrayList<Candy>();

    public int getPackWeight() {
        int summ = 0;
        for (Candy candy : candy1) {
            summ = summ + candy.getWeight();
        }
        return summ;
    }

    public void sortByName(){
        Collections.sort(candy1, new NameComparator());
    }

    public void sortByWeight(){
        Collections.sort(candy1, new WeightComparator());
    }

    public void toShowCandy(){
        for(Candy str: candy1){
            System.out.println(str);
        }
    }

    public Object findCandy(String name){
        for (Candy candy : candy1) {
            if (candy.getName().compareToIgnoreCase(name)==0) {
                return "The candy with " + name + " name is " + candy.toString();
            }
        }
        return "The candy with " + name + " name is not found.";
    }

    public Object findCandy(int weight){
        for (Candy candy : candy1) {
            if (candy.getWeight()==weight) {
                return "The candy with " + weight + " weight is " + candy.toString();
            }
        }
        return "The candy with " + weight + " weight is not found.";
    }

    public Object findCandy(String name, int weight){
        for (Candy candy : candy1) {
            if((candy.getName().compareToIgnoreCase(name)==0)&& (candy.getWeight()==weight)) {
                return "The candy with " + name + " name and " + weight + " weight is " + candy.toString();
            }
        }
        return "The candy with " + name + " name and " + weight + " weight is not found.";
    }

    public Object findCandy(String name, String type){
        for (Candy candy : candy1) {
            if((candy.getName().compareToIgnoreCase(name)==0)&& (candy.getType().compareToIgnoreCase(type)==0)) {
                return "The candy with " + name + " name and " + type + " type is " + candy.toString();
            }
        }
        return "The candy with " + name + " name and " + type + " type is not found.";
    }
}
