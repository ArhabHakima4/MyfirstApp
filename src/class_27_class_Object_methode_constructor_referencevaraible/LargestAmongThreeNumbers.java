package class_27_class_Object_methode_constructor_referencevaraible;

public class LargestAmongThreeNumbers {
    public void findLargestAmongTheeNumbers(int a, int b, int c) {
        if (a > b && a > c) {
            System.out.println(a + " is the largest");
        } else if (b > a && b > c) {
            System.out.println(b + " is the largest");
        } else if (c > a && c > b) {
            System.out.println(c + " is the largest");
        } else if (a == b && a > c) {
            System.out.println(a + " and " + b + " are equal and greater than " + c);
        } else if (a == c && a > b) {
            System.out.println(a + " and " + c + " are equal and greater than " + b);
        } else if (b == c && b > a) {
            System.out.println(b + " and " + c + " are equal and greater than " + a);
        } else {
            System.out.println(" numbers are equal");
        }
    }

    public static void main(String[] args) {
        LargestAmongThreeNumbers LargestAmongThreeNumbers = new LargestAmongThreeNumbers();
        LargestAmongThreeNumbers.findLargestAmongTheeNumbers(9,9,3);
    }
}
