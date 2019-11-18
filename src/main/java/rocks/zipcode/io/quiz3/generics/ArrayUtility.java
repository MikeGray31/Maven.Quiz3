package rocks.zipcode.io.quiz3.generics;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

/**
 * @author leon on 09/12/2018.
 */
public class ArrayUtility<SomeType> {
    private final SomeType[] array;

    public ArrayUtility(SomeType[] array) {
        this.array = array;
    }

    public SomeType findOddOccurringValue() {
        for(SomeType s : this.array){
            if(getNumberOfOccurrences(s) % 2 == 1){
                return s;
            }
        }
        return null;
    }

    public SomeType findEvenOccurringValue() {
        for(SomeType s : this.array){
            if(getNumberOfOccurrences(s) % 2 == 0){
                return s;
            }
        }
        return null;
    }

    public Integer getNumberOfOccurrences(SomeType valueToEvaluate) {
        int counter = 0;
        for (SomeType s : this.array){
            if (s.equals(valueToEvaluate)){
                counter++;
            }
        }
        return counter;
    }

    public SomeType[] filter(Function<SomeType, Boolean> predicate) {
        List<SomeType> results = new ArrayList<>();
        for(SomeType s : this.array){
            if(predicate.apply(s)){
                results.add(s);
            }
        }
        SomeType[] arrayResult = this.array;
        if(this.array[0] instanceof Integer){
            arrayResult = (SomeType[]) new Integer[results.size()];
        }
        else if(this.array[0] instanceof String){
            arrayResult = (SomeType[]) new String[results.size()];
        }
        return results.toArray(arrayResult);
    }
}
