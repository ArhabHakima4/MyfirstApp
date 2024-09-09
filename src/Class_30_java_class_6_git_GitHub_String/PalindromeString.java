package Class_30_java_class_6_git_GitHub_String;

public class PalindromeString {
    public boolean findIfStringIsPalindrome(String a) {
        char b[] = a.toCharArray();
        char c[] = new char[a.length()];
        boolean Istrue = true;
        for (int i = 0; i < a.length(); i++) {
            c[i] = b[a.length() - 1 - i];
        }
        for (int i = 0; i < a.length(); i++) {
            if (b[i] == c[i]) {
                Istrue = true;
            } else {
                Istrue = false;
            }
        }
        return Istrue;
    }

    public static void main(String[] args) {
        String a = "ouauo";
        PalindromeString PalindromeString = new PalindromeString();
        boolean b = PalindromeString.findIfStringIsPalindrome(a);
        System.out.println("'"+a+"' is a Palindrome: "+b);
    }
}