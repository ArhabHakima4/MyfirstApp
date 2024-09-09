package Class_30_java_class_6_git_GitHub_String;

public class StringObjectCallingPractice {
    public static void main(String[] args) {
        String a = "Azouaou Dahmoune is a java programmer";
        //calling the MethodToReturnAReverseOfGivenString method
        MethodToReturnAReverseOfGivenString MethodToReturnAReverseOfGivenString = new MethodToReturnAReverseOfGivenString();
        System.out.println(MethodToReturnAReverseOfGivenString.returnTheReverseOfTheString(a));
        // calling the PalindromeString class
        PalindromeString PalindromeString = new PalindromeString ();
        System.out.println("is Palindrome ?: "+PalindromeString.findIfStringIsPalindrome(a));
    }
}
