package class_27_class_Object_methode_constructor_referencevaraible;

public class  IsAlphabetVowelOrConsonant {
    public void FindIfCharacterIsVowelOrConsonant(char a) {
        if (a >= 'a' && a <= 'z' || a >= 'A' && a <= 'Z') {
            if (a == 'a' || a == 'e' || a == 'o' || a == 'i' || a == 'u' ||
                    a == 'A' || a == 'E' || a == 'O' || a == 'I' || a == 'U') {
                System.out.println(a+" is a vowel");
            } else {
                System.out.println(a+" is a consonant");
            }
        }
    }

    public static void main(String[] args) {
        IsAlphabetVowelOrConsonant IsAlphabetVowelOrConsonant = new IsAlphabetVowelOrConsonant();
        IsAlphabetVowelOrConsonant.FindIfCharacterIsVowelOrConsonant('V');
    }
}
