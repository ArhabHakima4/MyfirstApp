package class_29_java_class_5_array;

import java.util.Arrays;

public class ArrayObjectCallingPractice {
    public static void main(String[] args) {

        int b[] = {2, 4, 6, 8, 10};
        int c[][] = {{1, 3, 20}, {5, 2, 4}, {11, 6, 9}};
        // calling the AverageValueOfIntArray class
        AverageValueOfIntArray AverageValueOfIntArray = new AverageValueOfIntArray(new int [5]);
        int a [] = AverageValueOfIntArray.a = new int [] {1, 2, 3, 4, 5};
        double avg = AverageValueOfIntArray.calculateTheAverageValueOfIntArray();
        System.out.println("the average of array "+Arrays.toString(a)+" is : " + avg);
        // calling ElementsOfAnArrayPrintedInReverseOrder class
        ElementsOfAnArrayPrintedInReverseOrder ElementsOfAnArrayPrintedInReverseOrder = new ElementsOfAnArrayPrintedInReverseOrder();
        int reverse[] = ElementsOfAnArrayPrintedInReverseOrder.printTheElementsOfAnArrayInerverseOrder(a);
        System.out.println("reverse array is : " + Arrays.toString(reverse));
        //calling EvenOrOddPrint class
        EvenOrOddPrint EvenOrOddPrint = new EvenOrOddPrint();
        EvenOrOddPrint.printOddAndEvenNumbersInArray(a);
        System.out.println("");
        //calling IfAnIntArrayContainsASpecificValue class
        int value = 9;
        IfAnIntArrayContainsASpecificValue IfAnIntArrayContainsASpecificValue = new IfAnIntArrayContainsASpecificValue();
        System.out.println("array contains " + value + "?: " + IfAnIntArrayContainsASpecificValue.testIfAnIntArrayContainsASpecificValue(a, value));
        // calling MaxAndMinOfTwoDArray
        MaxAndMinOfTwoDArray MaxAndMinOfTwoDArray = new MaxAndMinOfTwoDArray();
        System.out.println("min and max of 2D array " + Arrays.deepToString(c) + " is:");
        MaxAndMinOfTwoDArray.findTheMinAndMaxOfTwoDArray(c);
        System.out.println("");
        //calling findTheMinimumOfAnArray
        System.out.println("the min and max of array "+Arrays.toString(a));
        MaximumAndMinimumOfAnArrayMethod1 MaximumAndMinimumOfAnArrayMethod1 = new MaximumAndMinimumOfAnArrayMethod1();
        int min = MaximumAndMinimumOfAnArrayMethod1.findTheMinimumOfAnArray(a);
        int max = MaximumAndMinimumOfAnArrayMethod1.findTheMaximumOfAnArray(a);
        System.out.println(min);
        System.out.println(max);
        System.out.println("the min and max of array "+Arrays.toString(b));
        int min1 = MaximumAndMinimumOfAnArrayMethod1.findTheMinimumOfAnArray(b);
        int max1 = MaximumAndMinimumOfAnArrayMethod1.findTheMaximumOfAnArray(b);
        System.out.println("min : "+min1);
        System.out.println("max : "+max1);
        //calling SumValuesOfIntegerArrayMethod1
        SumValuesOfIntegerArrayMethod1 SumValuesOfIntegerArrayMethod1 = new SumValuesOfIntegerArrayMethod1();
        int sum = SumValuesOfIntegerArrayMethod1.coutSumValuesOfIntegerArray(a);
        System.out.println("sum of values of Array :"+Arrays.toString(a)+" is : "+sum);

        int sum2 = SumValuesOfIntegerArrayMethod1.coutSumValuesOfIntegerArray(b);
        System.out.println("sum of values of Array :"+Arrays.toString(b)+" is : "+sum2);
        // calling SumValuesOfTwoDArray class
        SumValuesOfTwoDArray SumValuesOfTwoDArray = new SumValuesOfTwoDArray();
        int sum2d = SumValuesOfTwoDArray.findTheSumOfTheValuesOfATwoDArray(c);
        System.out.println("some of element of 2D array "+Arrays.deepToString(c)+" is : "+sum2d);

    }
}
