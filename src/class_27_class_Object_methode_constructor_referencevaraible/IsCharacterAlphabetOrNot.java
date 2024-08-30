package class_27_class_Object_methode_constructor_referencevaraible;

public class IsCharacterAlphabetOrNot {
    public void findIfCharacterIsAlphabet (char a) {
        if (a >='a' && a <= 'z' || a >= 'A' && a <= 'Z') {
            System.out.println(a+" is an Alphabet Charcter");
        } else {
            System.out.println(a+" is not an Alphabet Charcter");
        }
    }

    public static void main(String[] args) {
        IsCharacterAlphabetOrNot IsCharacterAlphabetOrNot = new IsCharacterAlphabetOrNot();
        IsCharacterAlphabetOrNot.findIfCharacterIsAlphabet('V');
    }
}
