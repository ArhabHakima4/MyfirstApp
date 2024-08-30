package class_27_class_Object_methode_constructor_referencevaraible;

public class IsNumberDivisibleByFive {
    public void findIfNumberIsDivisibleByFive (int a){
        if (a % 5 == 0){
            System.out.println(a+" is divisible by 5");
        }else {
            System.out.println(a+" is not divisible by 5");
        }
    }

    public static void main(String[] args) {
        IsNumberDivisibleByFive IsNumberDivisibleByFive = new IsNumberDivisibleByFive();
        IsNumberDivisibleByFive.findIfNumberIsDivisibleByFive(6);
    }
}
