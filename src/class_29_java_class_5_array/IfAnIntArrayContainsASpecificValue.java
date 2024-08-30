package class_29_java_class_5_array;

import java.util.Arrays;

public class IfAnIntArrayContainsASpecificValue {
    public boolean testIfAnIntArrayContainsASpecificValue(int a[], int v) {
        for (int i = 0; i < a.length; i++) {
            if (a[i] == v) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int a[] = {1, 39, 15, 23, 30};
        int v = 30;
        IfAnIntArrayContainsASpecificValue IfAnIntArrayContainsASpecificValue = new IfAnIntArrayContainsASpecificValue();
        boolean Istrue = IfAnIntArrayContainsASpecificValue.testIfAnIntArrayContainsASpecificValue(a, v);
        System.out.println("the Array: "+ Arrays.toString(a)+" contains the value "+v+" : "+Istrue);
    }
}
