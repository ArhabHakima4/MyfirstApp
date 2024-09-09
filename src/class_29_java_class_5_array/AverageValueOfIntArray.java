package class_29_java_class_5_array;

public class AverageValueOfIntArray {
   int a[];
   public AverageValueOfIntArray (int a []) {
       this.a = a;
   }
    public double calculateTheAverageValueOfIntArray (){
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
        AverageValueOfIntArray AverageValueOfIntArray = new AverageValueOfIntArray(a);
        double avg = AverageValueOfIntArray.calculateTheAverageValueOfIntArray();
        System.out.println("average of the Array is : "+ avg);
    }
}
