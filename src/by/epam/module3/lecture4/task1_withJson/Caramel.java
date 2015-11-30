package by.epam.module3.lecture4.task1_withJson;


/**
 * Created by Siarhei_Chyhir on 11/5/2015.
 */
public class Caramel extends Candy {
    private String filling;

    public String getFilling(){
        return filling;
    }
    protected Caramel(String name, int weight, String type, String filling) {
        super(name, weight, type);
        this.filling = filling;
    }

}
