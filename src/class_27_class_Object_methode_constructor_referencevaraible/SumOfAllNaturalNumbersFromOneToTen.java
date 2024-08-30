package class_27_class_Object_methode_constructor_referencevaraible;

public class SumOfAllNaturalNumbersFromOneToTen {
    public void findTheSumOfAllNaturalNumbersFromZeroToTen() {
        int sum = 0;
        for (int i = 0; i <= 10; i++) {
            sum = sum + i;
        }
        System.out.println("Sum of all natural numbers from 0 to 10 is: "+ sum);
    }

    public static void main(String[] args) {
        SumOfAllNaturalNumbersFromOneToTen SumOfAllNaturalNumbersFromOneToTen = new SumOfAllNaturalNumbersFromOneToTen();
        SumOfAllNaturalNumbersFromOneToTen.findTheSumOfAllNaturalNumbersFromZeroToTen();
    }
}
