package class_27_class_Object_methode_constructor_referencevaraible;

public class LargestAmongTwoNumbers {
    public void findLargestNumber (int a, int b){
        if (a>b) {
            System.out.println(a+" is larger than "+b);
        } else if (a < b) {
            System.out.println(b+" larger than "+a);
        }else {
            System.out.println(a+" and "+b+" are equal");
        }
    }

    public static void main(String[] args) {
        LargestAmongTwoNumbers LargestAmongTwoNumbers = new LargestAmongTwoNumbers();
        LargestAmongTwoNumbers.findLargestNumber(6,6);
    }
}
