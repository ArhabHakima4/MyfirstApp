package class_29_java_class_5_array;

import java.util.Arrays;

public class MaximumAndMinimumOfAnArrayMethode2 {
    public int [] findMinAndMaxOfAnArray (int a[]) {
        int min = a [0];
        int max = a [0];
        if (a.length == 0) {
            System.out.println("Empty Array");
        }
        for (int i = 0; i < a.length; i++) {
            if (a [i] < min) {
                min = a [i];
            }
            if (a [i] > max) {
                max = a [i];
            }
        }
        return new int [] {min, max};
    }

    public static void main(String[] args) {
        int a [] = {0, 150, 3, -45, 87};
        MaximumAndMinimumOfAnArrayMethode2 MaximumAndMinimumOfAnArrayMethode2 = new MaximumAndMinimumOfAnArrayMethode2();
        int minmax [] = MaximumAndMinimumOfAnArrayMethode2.findMinAndMaxOfAnArray(a);
        System.out.println(Arrays.toString(minmax));
    }
}
