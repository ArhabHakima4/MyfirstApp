package class_27_class_Object_methode_constructor_referencevaraible;

public class EvenOrOddNumber {
    public void findIfNumberIsEvenOrOdd (int a ) {
        if (a % 2 == 0) {
            System.out.println(a+" is Even");
        }else{
            System.out.println(a+" is Odd");
        }
    }

    public static void main(String[] args) {
        EvenOrOddNumber EvenOrOddNumber = new EvenOrOddNumber();
        EvenOrOddNumber.findIfNumberIsEvenOrOdd(11);
    }
}
