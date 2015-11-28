package by.epam.module3.lecture3.wirkingWithFile;

import java.util.*;


/**
 * Created by Siarhei_Chyhir on 11/22/2015.
 */
public class SearchBoxParser {

    /**
     * @param aSearchText is non-null, but may have no content,
     * and represents what the user has input in a search box.
     */
    public SearchBoxParser(String aSearchText) {
        if (aSearchText == null) {
            throw new IllegalArgumentException("Search Text cannot be null.");
        }
        fSearchText = aSearchText;
    }

    /**
     * Parse the user's search box input into a Set of String tokens.
     *
     * @return Set of Strings, one for each word in fSearchText; here "word"
     * is defined as either a lone word surrounded by whitespace, or as a series
     * of words surrounded by double quotes, "like this"; also, very common
     * words (and, the, etc.) do not qualify as possible search targets.
     */
    public List<String> parseSearchText(String stringDelims) {
        List<String> result = new ArrayList<>();

        boolean returnTokens = true;
        String currentDelims = stringDelims;
        StringTokenizer parser = new StringTokenizer(
                fSearchText, currentDelims, returnTokens
        );

        String token = null;
        while (parser.hasMoreTokens()) {
            token = parser.nextToken(currentDelims);
            if (!isDoubleQuote(token)){
                addNonTrivialWordToResult(token, result);
            }
            else {
                currentDelims = flipDelimiters(currentDelims);
            }
        }
        return result;
    }

    private String fSearchText;
    private static final String fDOUBLE_QUOTE = "\"";

    //the parser flips between these two lists of delimiters
    private static final String fWHITESPACE_AND_QUOTES = " \n\r\t\"";
    private static final String fQUOTES_ONLY ="\"";


    private boolean textHasContent(String aText){
        return (aText != null) && (!aText.trim().equals(""));
    }

    private void addNonTrivialWordToResult(String aToken, List<String> aResult){
        if (textHasContent(aToken)) {
            aResult.add(aToken.trim());
        }
    }

    private boolean isDoubleQuote(String aToken){
        return aToken.equals(fDOUBLE_QUOTE);
    }

    private String flipDelimiters(String aCurrentDelims){
        String result = null;
        if (aCurrentDelims.equals(fWHITESPACE_AND_QUOTES)){
            result = fQUOTES_ONLY;
        }
        else {
            result = fWHITESPACE_AND_QUOTES;
        }
        return result;
    }

}
