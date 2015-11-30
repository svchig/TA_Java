package by.epam.module3.lecture4.json;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;

/**
 * Created by Siarhei_Chyhir on 11/29/2015.
 */
public class JsonData {

    public static ArrayList<String> getJsonDataFile(String filePath){
        Gson gson = new GsonBuilder().setPrettyPrinting().create();
        try {
            ArrayList<String> dataFromJson = new ArrayList<>();
            FileReader fileReader = new FileReader(filePath);
            Candies candies2 = gson.fromJson(fileReader, Candies.class);
            for (JsonCandy c: candies2.candies){
                String name = c.getName();
                int weight = c.getWeight();
                String type = c.getType();
                String custom_parameter = c.getCustom_parameter();
                dataFromJson.add(name + " " + weight + " " + type + " " + custom_parameter);
            }
            return dataFromJson;
        } catch (FileNotFoundException e) {
            e.printStackTrace();
            return null;
        }
    }

}
