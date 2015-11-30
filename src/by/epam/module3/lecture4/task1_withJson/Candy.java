package by.epam.module3.lecture4.task1_withJson;

import by.epam.module3.lecture3.CustomExceptions.InvalidCandyTypeException;
import by.epam.module3.lecture3.CustomExceptions.InvalidWeightException;

/**
 * Created by Siarhei_Chyhir on 11/5/2015.
 */
public class Candy {
    private String name;
    private int weight;
    private String type;

    protected Candy(String name, int weight, String type){
        this.name = name;
        this.weight = weight;
        this.type = type;
    }

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public int getWeight() throws InvalidWeightException{
        if (weight <= 0) throw new InvalidWeightException("The weight should be greater than 0");
        else
        return weight;
    }

    public void setWeight(int weight){
        this.weight = weight;
    }

    public String getType() throws InvalidCandyTypeException{
        if (type.equalsIgnoreCase("Chocolate")||type.equalsIgnoreCase("Caramel")||type.equalsIgnoreCase("Candy"))
            return type;
        else
            throw new InvalidCandyTypeException("The candy type: "+ type+" is incorrect.");

    }

    public void setType(String type){
        this.type = type;
    }

    public String toString(){
        return "[name=" + name + ", weight=" + weight + ", type=" + type + "]";
    }
}
