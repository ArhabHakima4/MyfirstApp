package class_29_java_class_5_array;

public class SumValuesOfIntegerArrayMethod1 {
    public int  coutSumValuesOfIntegerArray (int a []) {
        int sum = 0;
        for (int i = 0; i < a.length; i++) {
            sum = sum + a [i];
        }
        return sum;
    }

    public static void main(String[] args) {
        int a [] = {0, 1, 2, 4, 44};
        SumValuesOfIntegerArrayMethod1 SumValuesOfIntegerArray = new SumValuesOfIntegerArrayMethod1();
        System.out.println(SumValuesOfIntegerArray.coutSumValuesOfIntegerArray(a));
    }
}
