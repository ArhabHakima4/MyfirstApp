package class_29_java_class_5_array;

public class SumValuesOfTwoDArray {
    public int findTheSumOfTheValuesOfATwoDArray(int a[][]) {
        int sum = 0;
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[0].length; j++) {
                sum = sum + a[i][j];
            }
        }
        return sum;
    }
    public static void main(String[] args) {
        int a[][] = {{1, 1, 1}, {1, 1, 1}, {1, 1, 1}};
        SumValuesOfTwoDArray SumValuesOfTwoDArray = new SumValuesOfTwoDArray();
        int sum = SumValuesOfTwoDArray.findTheSumOfTheValuesOfATwoDArray(a);
        System.out.println("the sum of all the elements is : " + sum);
    }
}
