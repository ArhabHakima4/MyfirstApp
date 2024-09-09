package class_27_class_Object_methode_constructor_referencevaraible;

public class AllAlphabetFromAToZ {
    public void printAllAlphabetFromAToZ () {
        System.out.println("All Alphabet from A to Z");
        for (char a ='a'; a <= 'z'; a++){
            System.out.print(" "+a);
        }
    }

    public static void main(String[] args) {
        AllAlphabetFromAToZ AllAlphabetFromAToZ = new AllAlphabetFromAToZ();
        AllAlphabetFromAToZ.printAllAlphabetFromAToZ();
    }
}
