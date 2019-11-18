package rocks.zipcode.io.quiz3.fundamentals;

/**
 * @author leon on 09/12/2018.
 */
public class PigLatinGenerator {
    public String translate(String str) {
        String result = "";
        String[] words = str.split(" ");
        for(int i = 0; i < words.length; i++){
            String next = "";
            if(words[i].charAt(0) == 'a' || words[i].toLowerCase().charAt(0) =='e' || words[i].toLowerCase().charAt(0) =='i' || words[i].toLowerCase().charAt(0) =='o' || words[i].toLowerCase().charAt(0) =='u'){
                next = words[i] + "way";
            }
            else {
                next = words[i].charAt(findFirstVowelIndex(words[i])) + words[i].substring(findFirstVowelIndex(words[i]) + 1) + words[i].substring(0, findFirstVowelIndex(words[i])) + "ay";
            }
            result += next;
            if(i < words.length - 1) result += " ";
        }
//        result += words[words.length - 1].charAt(findFirstVowelIndex(words[words.length - 1])) + words[words.length - 1].substring(findFirstVowelIndex(words[words.length - 1]) + 1) + words[words.length - 1].substring(0,findFirstVowelIndex(words[words.length - 1])) + "ay";
//        if(words[i].charAt(0) == 'a' || words[i].charAt(0) =='e' || words[i].charAt(0) =='i' || words[i].charAt(0) =='o' || words[i].charAt(0) =='u'){
//            result += words[words.length - 1] + "way";
//       result += words[words.length - 1].charAt(findFirstVowelIndex(words[words.length - 1])) + words[words.length - 1].substring(findFirstVowelIndex(words[words.length - 1]) + 1) + words[words.length - 1].substring(0,findFirstVowelIndex(words[words.length - 1])) + "ay";
//        }
//        else {
//            next = words[i].charAt(findFirstVowelIndex(words[i])) + words[i].substring(findFirstVowelIndex(words[i]) + 1) + words[i].substring(0, findFirstVowelIndex(words[i])) + "ay ";
//        }
        return result;
    }

    public Integer findFirstVowelIndex(String word){
        word = word.toLowerCase();
        for(int i = 0; i < word.length(); i++){
            if(word.charAt(i) == 'a' || word.charAt(i) == 'e' || word.charAt(i) == 'i' || word.charAt(i) == 'o' || word.charAt(i) == 'u'){
                return i;
            }
        }
        return word.length()-1;
    }
}
