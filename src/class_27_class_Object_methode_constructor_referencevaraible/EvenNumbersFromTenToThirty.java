package class_27_class_Object_methode_constructor_referencevaraible;

public class EvenNumbersFromTenToThirty {
    public void findEvenNumbersFromTenToThirty() {
        System.out.println("Even numbers from 10 to 30:");
        for (int i = 10; i <= 30; i++) {
            if (i % 2 == 0) {
                System.out.print(" "+i);
            }
        }
    }

    public static void main(String[] args) {
        EvenNumbersFromTenToThirty EvenNumbersFromTenToThirty = new EvenNumbersFromTenToThirty();
        EvenNumbersFromTenToThirty.findEvenNumbersFromTenToThirty();
    }
}
