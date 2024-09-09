package Class_30_java_class_6_git_GitHub_String;

import java.util.Arrays;

public class CounterOfNumberOfWordsInString {
    public static void main(String[] args) {
        String phrase = "I am at work today";
        String words [] = phrase.trim().split("\\s+");
        int number = words.length;
        System.out.println(Arrays.toString(words));
        System.out.println("number of words in string is : "+number);
    }
}
