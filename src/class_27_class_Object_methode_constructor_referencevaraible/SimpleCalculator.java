package class_27_class_Object_methode_constructor_referencevaraible;

public class SimpleCalculator {
    public double calculate(double a, char operator, double b) {
        switch (operator) {
            case '+':
                return a + b;
            case '-':
                return a - b;
            case '*':
                return a * b;
            case '/':
                if (b != 0) {
                    return a / b;
                }else {
                    System.out.println("division by 0 not allowed");
                    return 0;
                }
            case '%':
                return a % b;
            default:
                System.out.println("invalid operator");
                return 0;
        }
    }

    public static void main(String[] args) {
        SimpleCalculator SimpleCalculator = new SimpleCalculator();
        System.out.println("result of the calculation = "+SimpleCalculator.calculate(5, '/',2));
    }
}
