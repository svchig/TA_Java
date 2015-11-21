package by.epam.module3.lecture2.task1;

/**
 * Created by Siarhei_Chyhir on 11/5/2015.
 */
public class Chocolate extends Candy {
    private String sortOfChocolate;

    public String getSortOfChocolate(){
        return sortOfChocolate;
    }

    protected Chocolate(String name, int weight, String type, String sortOfChocolate) {
        super(name, weight, type);
        this.sortOfChocolate = sortOfChocolate;
    }

}
