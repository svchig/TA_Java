package by.epam.module3.lecture2.task1;

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

    public int getWeight(){
        return weight;
    }

    public void setWeight(int weight){
        this.weight = weight;
    }

    public String getType(){
        return type;
    }

    public void setType(String type){
        this.type = type;
    }

    public String toString(){
        return "[name=" + name + ", weight=" + weight + ", type=" + type + "]";
    }
}
