package class_29_java_class_5_array;

import java.util.Arrays;

public class ElementsOfAnArrayPrintedInReverseOrder {
    public int[] printTheElementsOfAnArrayInerverseOrder(int a[]) {
        int reversedArray [] = new int [a.length];
        for (int i = 0; i < a.length; i++) {
            reversedArray[i] = a[a.length - 1 - i];
        }
        return reversedArray;
    }

    public static void main(String[] args) {
        int a[] = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        ElementsOfAnArrayPrintedInReverseOrder ElementsOfAnArrayPrintedInReverseOrder = new ElementsOfAnArrayPrintedInReverseOrder();
        int reversea[] = ElementsOfAnArrayPrintedInReverseOrder.printTheElementsOfAnArrayInerverseOrder(a);
        System.out.println(Arrays.toString(reversea));
    }
}