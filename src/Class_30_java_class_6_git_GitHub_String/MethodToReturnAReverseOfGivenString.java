package Class_30_java_class_6_git_GitHub_String;

import java.util.Arrays;

public class MethodToReturnAReverseOfGivenString {
    public char [] returnTheReverseOfTheString (String a) {
        char b [] = a.toCharArray();
        char c [] = new char [a.length()];
        for (int i = 0; i < a.length(); i++) {
            c [i] = b [a.length()-1-i];
        }
        return c;
    }

    public static void main(String[] args) {
        String a = "azouaou dahmoune";
        MethodToReturnAReverseOfGivenString MethodToReturnAReverseOfGivenString = new MethodToReturnAReverseOfGivenString();
        System.out.println(MethodToReturnAReverseOfGivenString.returnTheReverseOfTheString(a));
    }

}
