package class_27_class_Object_methode_constructor_referencevaraible;

public class UppercaseOrLowercaseCharcter {
    public void findIfCharacterIsUppercaseOrLowercase (char a) {
        if (a >= 'a' && a <='z') {
            System.out.println(a+" is Lowercase");
        } else if (a >= 'A' && a <='Z') {
            System.out.println(a+" is Uppercase");
        }else {
            System.out.println(a+" is not an alphabet character");
        }
    }

    public static void main(String[] args) {
        UppercaseOrLowercaseCharcter UppercaseOrLowercaseCharcter = new UppercaseOrLowercaseCharcter();
        UppercaseOrLowercaseCharcter.findIfCharacterIsUppercaseOrLowercase('#');
    }
}
