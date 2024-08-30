package class_27_class_Object_methode_constructor_referencevaraible;

public class FactorialOfAGivenNumber {
    public int findTheFactorialOfTheGivenNumber(int a) {
        int prod = a;
        if (a == 0) {
            return 1;
        }
        for (int i = (a - 1); i >= 1; i--) {
            prod = prod * i;
        }
        return prod;
    }

    public static void main(String[] args) {
        FactorialOfAGivenNumber FactorialOfAGivenNumber = new FactorialOfAGivenNumber();
        System.out.println(FactorialOfAGivenNumber.findTheFactorialOfTheGivenNumber(1));
    }
}
