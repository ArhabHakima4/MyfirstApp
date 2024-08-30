package class_27_class_Object_methode_constructor_referencevaraible;

public class MultiplicationOfAlNumbersFromOneToTen {
    public int findMultiplicationOfAllNumbersFromOneToTen() {
        int mult = 1;
        for (int i = 1; i <= 10; i++) {
            mult = mult * i;
        }
        return mult;
    }

    public static void main(String[] args) {
        MultiplicationOfAlNumbersFromOneToTen MultiplicationOfAlNumbersFromOneToTen = new MultiplicationOfAlNumbersFromOneToTen();
        System.out.println("The multiplication of all natural numbers  from 1 to 10 equals: ");
        System.out.println(MultiplicationOfAlNumbersFromOneToTen.findMultiplicationOfAllNumbersFromOneToTen());
    }
}
