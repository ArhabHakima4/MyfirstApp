package class_29_java_class_5_array;

public class MaxAndMinOfTwoDArray {
    public void findTheMinAndMaxOfTwoDArray(int a[][]) {
        int min = a[0][0];
        int max = a[0][0];
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[0].length; j++) {
                if (a[i][j] < min) {
                    min = a[i][j];
                }
                if (a[i][j] > max) {
                    max = a[i][j];
                }
            }
        }
        System.out.print("the minimum :" + min);
        System.out.println();
        System.out.print("the maximum :" + max);
    }

    public static void main(String[] args) {
        int a[][] = {{4, 30, 3}, {15, 9, 8}, {49, 2, 50}};
        MaxAndMinOfTwoDArray MaxAndMinOfTwoDArray = new MaxAndMinOfTwoDArray();
        MaxAndMinOfTwoDArray.findTheMinAndMaxOfTwoDArray(a);
    }
}
