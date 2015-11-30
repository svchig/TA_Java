package by.epam.module3.lecture4.json;

/**
 * Created by Siarhei_Chyhir on 11/29/2015.
 */
public class JsonCandy {
    private int id;
    private String name;

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setCustom_parameter(String custom_parameter) {
        this.custom_parameter = custom_parameter;
    }

    private int weight;
    private String type;

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getWeight() {
        return weight;
    }

    public String getType() {
        return type;
    }

    public String getCustom_parameter() {
        return custom_parameter;
    }

    private String custom_parameter;


}
