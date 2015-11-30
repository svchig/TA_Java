package by.epam.module3.lecture4.json;

import java.util.List;

/**
 * Created by Siarhei_Chyhir on 11/29/2015.
 */
public class Candies {
    List<JsonCandy> candies;

    public void setCandies(List<JsonCandy> candies) {
        this.candies = candies;
    }

    public List<JsonCandy> getCandies() {

        return candies;
    }
}
