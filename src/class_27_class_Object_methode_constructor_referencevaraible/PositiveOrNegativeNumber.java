package class_27_class_Object_methode_constructor_referencevaraible;

public class PositiveOrNegativeNumber {
    public void PositiveOrNegative(int a) {
        if (a > 0) {
            System.out.println("Number " + a + " is positive");
        } else if (a < 0) {
            System.out.println("Number " + a + " is negative");
        } else {
            System.out.println("Number " + a + " is null");
        }
    }

    public static void main(String[] args) {
        PositiveOrNegativeNumber PositiveOrNegativeNumber = new PositiveOrNegativeNumber();
        PositiveOrNegativeNumber.PositiveOrNegative(7);
    }
}
