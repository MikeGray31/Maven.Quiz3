package rocks.zipcode.io.quiz3.arrays;

import java.util.ArrayList;
import java.util.List;

import static java.lang.Character.isAlphabetic;

/**
 * @author leon on 09/12/2018.
 */
public class WaveGenerator {
    public static String[] wave(String str) {
        str = str.toLowerCase();
        List<String> result = new ArrayList<>();
        for(int i = 0; i < str.length(); i++){
            if(isAlphabetic(str.charAt(i))){
                String newString = str.substring(0, i) + (char)(str.charAt(i) - 32) + str.substring(i+1);
                result.add(newString);
            }
        }
        String[] arrayResult = new String[result.size()];
        return result.toArray(arrayResult);
    }
}
