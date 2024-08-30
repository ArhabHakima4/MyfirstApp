package class_27_class_Object_methode_constructor_referencevaraible;

public class IsNumberDivisibleByFiveAndEleven {
    public void findIfNumberIsDivisibleByFiveAndEleven(int a) {
        if (a % 5 == 0 && a % 11 == 0) {
            System.out.println(a + " is divisible by Five 5 and 11");
        } else {
            System.out.println(a + " is not divisible by 5 and 11");
        }
    }

    public static void main(String[] args) {
        IsNumberDivisibleByFiveAndEleven IsNumberDivisibleByFiveAndEleven = new IsNumberDivisibleByFiveAndEleven();
        IsNumberDivisibleByFiveAndEleven.findIfNumberIsDivisibleByFiveAndEleven(275);
    }
}
