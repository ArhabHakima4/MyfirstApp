package class_27_class_Object_methode_constructor_referencevaraible;

public class FirstTenNaturalNumbers {
    public void findFirstTenNaturalNumbers() {
        System.out.println(" The first 10 Natural numbers are: ");
        for (int i = 1; i <= 10; i++){
            System.out.println(i);
        }
    }

    public static void main(String[] args) {
        FirstTenNaturalNumbers FirstTenNaturalNumbers = new FirstTenNaturalNumbers();
        FirstTenNaturalNumbers.findFirstTenNaturalNumbers();
    }
}
