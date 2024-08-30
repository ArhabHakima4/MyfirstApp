package class_29_java_class_5_array;

import java.util.Arrays;

public class NumericAndStringArraySorted {
    public static void main(String[] args) {
        int IntegerArray[] = {90, 2, 35, 39, 3};
        String StringArray[] = {"Juba", "Hakima", "Nelia", "Azouaou"};
        Arrays.sort(IntegerArray);
        System.out.println("sorted integer Array : "+ Arrays.toString(IntegerArray));
        Arrays.sort(StringArray);
        System.out.println("sorted string Array : "+ Arrays.toString(StringArray));
    }
}
