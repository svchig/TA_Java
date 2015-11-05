package by.epam.module3.lecture2.task2;

/**
 * Created by Siarhei_Chyhir on 11/3/2015.
 */
public class CompareCollections {

    public static void main(String[] args){

        System.out.println("This program compares the performance of collections");
        System.out.println("\nLists:");
        Lists list  = new Lists();
        list.compareListAddintion();
        list.compareListContain();
        list.compareListSerching();
        list.compareListRemoving();
        System.out.println("\nSets:");
        Sets set = new Sets();
        set.compareSetAddintion();
        set.compareSetContain();
        set.compareSetSerching();
        set.compareSetRemoving();
        System.out.println("\nMaps:");
        Maps map = new Maps();
        map.compareMapAddintion();
        map.compareMapContain();
        map.compareMapSerching();
        map.compareMapRemoving();
    }

}
