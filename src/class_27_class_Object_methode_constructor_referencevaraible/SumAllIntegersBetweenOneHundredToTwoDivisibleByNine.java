package class_27_class_Object_methode_constructor_referencevaraible;

public class SumAllIntegersBetweenOneHundredToTwoDivisibleByNine {
    public void printSumOfIntegersBetween100And200DivisibleBy9() {
        int num = 0;
        int sum = 0;
        for (int i = 100; i <= 200; i++) {
            if (i % 9 == 0) {
                num = num + 1;
                sum = sum + i;
                System.out.print(i+" ");
            }
        }
        System.out.println(".");
        System.out.println("Number of integers between 100 and 200 divisible by 9 is : "+num);
        System.out.println("The sum of all these numbers is : "+sum);
    }

    public static void main(String[] args) {
        SumAllIntegersBetweenOneHundredToTwoDivisibleByNine SumAllIntegersBetweenOneHundredToTwoDivisibleByNine = new SumAllIntegersBetweenOneHundredToTwoDivisibleByNine();
        SumAllIntegersBetweenOneHundredToTwoDivisibleByNine.printSumOfIntegersBetween100And200DivisibleBy9();
    }
}