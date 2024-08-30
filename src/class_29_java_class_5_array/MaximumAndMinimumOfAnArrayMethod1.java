package class_29_java_class_5_array;

public class MaximumAndMinimumOfAnArrayMethod1 {
    public int findTheMaximumOfAnArray(int a[]) {
        int max = a [0];
        for (int i = 0; i < a.length; i++) {
            if (a[i] > max) {
                max = a[i];
            }
        }
        return max;
    }

    public int findTheMinimumOfAnArray(int a[]) {
        int min = a [0];
        for (int i = 0; i < a.length; i++) {
            if (a[i] < min) {
                min = a[i];
            }
        }
        return min;
    }

    public static void main(String[] args) {
        int a[] = {95, 35, 3, 23, 80, 3, 35, 100};
        MaximumAndMinimumOfAnArrayMethod1 MaximumAndMinimumOfAnArray = new MaximumAndMinimumOfAnArrayMethod1();
        int max = MaximumAndMinimumOfAnArray.findTheMaximumOfAnArray(a);
        System.out.println(max);
        int min = MaximumAndMinimumOfAnArray.findTheMinimumOfAnArray(a);
        System.out.println(min);
    }
}
