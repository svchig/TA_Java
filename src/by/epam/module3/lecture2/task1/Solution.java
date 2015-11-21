package by.epam.module3.lecture2.task1;


/**
 * Created by Siarhei_Chyhir on 11/4/2015.
 */
public class Solution {
    public static void main(String[] args) {
        NYGift nyGift = new NYGift();
        nyGift.candy1.add(new Candy("Shottogen", 200, "Chocolate"));
        nyGift.candy1.add(new Chocolate("Ideal", 100, "Chocolate", "Milk"));
        nyGift.candy1.add(new Caramel("Korovka", 25, "Caramel", "Jam"));
        NYGift nyGift2 = new NYGift();
        nyGift2.candy1.add(new Chocolate("Shottogen", 200, "Chocolate", "Brut"));
        nyGift2.candy1.add(new Chocolate("Ideal", 100, "Chocolate", "Milk"));
        nyGift2.candy1.add(new Caramel("Korovka", 25, "Caramel", "Jam"));
        nyGift2.candy1.add(new Caramel("Kuznechik", 20, "Caramel", "Halva"));

        System.out.println("The weight of the 1st gift is " + nyGift.getPackWeight() + " g.");
        System.out.println("The weight of the 2nd gift is " + nyGift2.getPackWeight() + " g.");

        System.out.println("");

        System.out.println("The 1st gift contains from");
        nyGift.toShowCandy();
        System.out.println("The 1st gift sorting by weight:");
        nyGift.sortByWeight();
        System.out.println(nyGift.candy1);
        System.out.println(nyGift.findCandy("Ideal"));
        System.out.println(nyGift.findCandy("Ideal", 100));
        System.out.println(nyGift.findCandy("Ideal", "Chocolate"));

        System.out.println("");

        System.out.println("The 2nd gift contains from");
        nyGift2.toShowCandy();
        System.out.println("The 2nd gift sorting by name:");
        nyGift2.sortByName();
        System.out.println(nyGift2.candy1);
        System.out.println(nyGift2.findCandy(100));
        System.out.println(nyGift2.findCandy("Ideal", "Milk"));




    }
}
