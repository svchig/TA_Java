package by.epam.module3.lecture4.json;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.util.ArrayList;

/**
 * Created by Siarhei_Chyhir on 11/29/2015.
 */
public class JsonData {


    static String file = "";

    public static void main(String[] args){
        Gson gson = new GsonBuilder().setPrettyPrinting().create();
        ArrayList<JsonCandy> candies =  new ArrayList<>();
        candies.add(getJsonCandy());
        candies.add(getJsonCandy());
        candies.add(getJsonCandy());
        candies.add(getJsonCandy());
        candies.add(getJsonCandy());
        candies.add(getJsonCandy());
        candies.add(getJsonCandy());
        Candies candies1 = new Candies();
        candies1.setCandies(candies);
        System.out.println(gson.toJson(candies1));
//        gson.
    }

    private static JsonCandy getJsonCandy(){
        JsonCandy jsonCandy = new JsonCandy();
        jsonCandy.setId(1);
        jsonCandy.setName("Shottogen");
        jsonCandy.setWeight(200);
        jsonCandy.setType("Chocolate");
        jsonCandy.setCustom_parameter("Brut");
        return jsonCandy;
    }
}
