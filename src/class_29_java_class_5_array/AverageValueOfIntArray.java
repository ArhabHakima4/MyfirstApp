package class_29_java_class_5_array;

public class AverageValueOfIntArray {
    public double calculateTheAverageValueOfIntArray (int a []){
        int sum = 0;
        double avg = 0;
        for (int value : a) {
            sum = sum + value;
        }
        avg = sum / a.length;
        return avg;
    }

    public static void main(String[] args) {
        int a [] = {30, 25, 35, 40, 45};
        AverageValueOfIntArray AverageValueOfIntArray = new AverageValueOfIntArray();
        double avg = AverageValueOfIntArray.calculateTheAverageValueOfIntArray(a);
        System.out.println("average of the Array is : "+ avg);
    }
}
