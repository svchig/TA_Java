package by.epam.module3.lecture2.task1;



/**
 * Created by Siarhei_Chyhir on 11/4/2015.
 */
public class Solution {
    public static void main(String[] args) {
        NYGift nyGift = new NYGift();
        nyGift.add(new Candy("Shottogen", 200));
        nyGift.add(new Chocolate("Ideal", 100));
        nyGift.add(new Caramel("Korovka", 25));
        NYGift nyGift2 = new NYGift();
        nyGift2.add(new Chocolate("Shottogen", 200));
        nyGift2.add(new Chocolate("Ideal", 100));
        nyGift2.add(new Caramel("Korovka", 25));
        nyGift2.add(new Caramel("Kuznechik", 20));

        System.out.println("The weight of the 1st gift is " + nyGift.getPackWeight() + " g.");
        System.out.println("The weight of the 2nd gift is " + nyGift2.getPackWeight() + " g.");


        nyGift.toShowCandy();
        nyGift.sortByWeight();
        nyGift.toShowCandy();

    }
}
