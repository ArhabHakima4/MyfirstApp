package class_27_class_Object_methode_constructor_referencevaraible;

public class OddNumbersFromZeroToTwenty {
    public void findOddNumbersFromZeroToTwenty() {
        System.out.println("Odd numbers from 0 to 20:");
        for (int i = 1; i <= 20; i++) {
            if (i % 2 != 0) {
                System.out.println(i);
            }
        }
    }

    public static void main(String[] args) {
        OddNumbersFromZeroToTwenty OddNumbersFromZeroToTwenty = new OddNumbersFromZeroToTwenty();
        OddNumbersFromZeroToTwenty.findOddNumbersFromZeroToTwenty();
    }
}

