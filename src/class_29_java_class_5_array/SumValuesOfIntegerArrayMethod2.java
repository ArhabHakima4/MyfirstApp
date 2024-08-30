package class_29_java_class_5_array;

public class SumValuesOfIntegerArrayMethod2 {
    public static int calculateSum(int[] array) {
        int sum = 0;
        for (int value : array) {
            sum += value;  // Add each element to the sum
        }
        return sum;
    }
    public static void main(String[] args) {
        // Define an integer array
        int[] numericArray = {5, 2, 9, 1, 5, 6};

        // Call the method to calculate the sum
        int sum = calculateSum(numericArray);

        // Print the result
        System.out.println("Sum of array values: " + sum);
    }
}
