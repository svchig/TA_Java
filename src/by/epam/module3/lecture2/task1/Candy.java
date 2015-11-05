package by.epam.module3.lecture2.task1;

import java.util.Comparator;
/**
 * Created by Siarhei_Chyhir on 11/5/2015.
 */
public class Candy {
    private String name;
    private int weight;

    protected Candy(String name, int weight){
        this.name = name;
        this.weight = weight;
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

    public static Comparator<Candy> GiftNameComparator = new Comparator<Candy>() {
        public int compare(Candy s1, Candy s2) {
            String CandyName1 = s1.getName().toUpperCase();
            String CandyName2 = s2.getName().toUpperCase();

            //ascending order
            return CandyName1.compareTo(CandyName2);

            //descending order
            //return CandyName2.compareTo(CandyName1);
        }
    };

    public static Comparator<Candy> GiftWeightComparator = new Comparator<Candy>() {

        public int compare(Candy s1, Candy s2) {

            int weight1 = s1.getWeight();
            int weight2 = s2.getWeight();

	   /*For ascending order*/
            return weight1-weight2;

	   /*For descending order*/
            //return weight2-weight1;
        }};

        public String toString(){
        return "[ name=" + name + ", weight=" + weight + "]";
    }
}
