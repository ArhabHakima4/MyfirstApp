package class_27_class_Object_methode_constructor_referencevaraible;

public class NumbersDivisibleByThreeAndFive {
    public void findNumbersDivisibleByThreeAndFiveFromZeroToOneHundred(){
        System.out.println("Numbers divisible by 3 and 5 from 0 to 100: ");
        for (int i = 0; i <= 100; i++){
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println(i);
            }
        }
    }

    public static void main(String[] args) {
        NumbersDivisibleByThreeAndFive NumbersDivisibleByThreeAndFive = new NumbersDivisibleByThreeAndFive();
        NumbersDivisibleByThreeAndFive.findNumbersDivisibleByThreeAndFiveFromZeroToOneHundred();
    }
}
