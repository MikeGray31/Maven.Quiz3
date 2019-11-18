package rocks.zipcode.io.quiz3.fundamentals;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.stream.Collectors;

import static java.lang.Character.isAlphabetic;

/**
 * @author leon on 09/12/2018.
 */
public class StringUtils {
    public static String capitalizeNthCharacter(String str, Integer indexToCapitalize) {
        return str.substring(0,indexToCapitalize) + (char)(str.charAt(indexToCapitalize) - 32) + str.substring(indexToCapitalize + 1);
    }

    public static Boolean isCharacterAtIndex(String baseString, Character characterToCheckFor, Integer indexOfString) {
        return baseString.charAt(indexOfString) == characterToCheckFor;
    }

    public static String[] getAllSubStrings(String string) {
        string = string + " ";
        HashSet<String> results = new HashSet<>();
        for(int i = 0; i < string.length() - 1; i++){
            for(int j = i + 1; j < string.length(); j++){
                results.add(string.substring(i, j));
            }
        }
        String[] resultsArray = new String[results.size()];
        return results.toArray(resultsArray);

    }

    public static Integer getNumberOfSubStrings(String input){
        return getAllSubStrings(input).length;
    }
}
