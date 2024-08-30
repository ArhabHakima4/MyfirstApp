package class_27_class_Object_methode_constructor_referencevaraible;

public class FirstTenNaturalNumbersInReverse {
    public void findFirstTenNaturalNumbersInReverse () {
        System.out.println("The first 10 natural numbers in reverse are: ");
        for (int i = 10; i >= 0; i--){
            System.out.println(i);
        }
    }

    public static void main(String[] args) {
        FirstTenNaturalNumbersInReverse FirstTenNaturalNumbersInReverse = new FirstTenNaturalNumbersInReverse();
        FirstTenNaturalNumbersInReverse.findFirstTenNaturalNumbersInReverse();
    }
}
