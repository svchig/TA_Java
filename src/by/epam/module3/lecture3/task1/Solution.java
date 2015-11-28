package by.epam.module3.lecture3.task1;


import by.epam.module3.lecture3.CustomExceptions.FileTypeException;
import by.epam.module3.lecture3.CustomExceptions.InvalidCandyTypeException;
import by.epam.module3.lecture3.CustomExceptions.InvalidWeightException;
import by.epam.module3.lecture3.wirkingWithFile.IOTextFile;
import by.epam.module3.lecture3.wirkingWithFile.SearchBoxParser;

import java.io.File;
import java.io.IOException;
import java.util.List;

/**
 * Created by Siarhei_Chyhir on 11/4/2015.
 */
public class Solution {
    public static void main (String... aArguments) throws InvalidWeightException, InvalidCandyTypeException, FileTypeException, IOException {

        File sourceFile = new File("Temp/blah.txt");
        File destFile = new File("Temp/blah1.txt");
        if (!destFile.exists()){
            destFile.createNewFile();
        }
        String textData = IOTextFile.getContents(sourceFile);
        SearchBoxParser parser = new SearchBoxParser(textData);
        List<String> tokens = parser.parseSearchText("\r\n");
        NYGift nyGift = new NYGift();

        for (String item : tokens){
            parser = new SearchBoxParser(item);
            List<String> tokens1 = parser.parseSearchText(" \t\"");
            if (item.toLowerCase().contains("chocolate")){
                nyGift.candy1.add(new Chocolate(tokens1.get(0), Integer.parseInt(tokens1.get(1)), tokens1.get(2), tokens1.get(3)));
            }else if (item.toLowerCase().contains("caramel")){
                nyGift.candy1.add(new Caramel(tokens1.get(0), Integer.parseInt(tokens1.get(1)), tokens1.get(2), tokens1.get(3)));
            }else {
                nyGift.candy1.add(new Candy(tokens1.get(0), Integer.parseInt(tokens1.get(1)), tokens1.get(2)));
            }
        }

        IOTextFile.setContents(destFile, "The weight of the 1st gift is " + nyGift.getPackWeight() + " g.\n", false);
        IOTextFile.setContents(destFile, "The 1st gift contains from\n", true);
        IOTextFile.setContents(destFile, String.valueOf(nyGift.candy1) + "\n", true);
        IOTextFile.setContents(destFile, String.valueOf(nyGift.findCandy("Ideal"))+ "\n", true);
        IOTextFile.setContents(destFile, String.valueOf(nyGift.findCandy("Ideal", 100))+ "\n", true);
        IOTextFile.setContents(destFile, String.valueOf(nyGift.findCandy("Ideal", "Chocolate")), true);

        System.out.println(IOTextFile.getContents(destFile));

    }

}
