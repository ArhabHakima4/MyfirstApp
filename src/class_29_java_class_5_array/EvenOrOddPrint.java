package class_29_java_class_5_array;

import java.util.Arrays;

public class EvenOrOddPrint {
    public void printOddAndEvenNumbersInArray (int a []) {
        System.out.print(" Even numbers : ");
        for (int element : a) {
            if (element % 2 == 0) {
                System.out.print(" "+element);
            }
        }
        System.out.println(" ");
        System.out.print(" Odd numbers : ");
        for (int element : a) {
            if (element % 2 != 0) {
                System.out.print(" "+element);
            }
        }
    }

    public static void main(String[] args) {
        int a [] = {1,2,3,4,5,6,7,8,9};
        EvenOrOddPrint EvenOrOddPrint = new EvenOrOddPrint();
        EvenOrOddPrint.printOddAndEvenNumbersInArray(a);
    }
}
