package class_29_java_class_5_array;

public class TwoDArrayElementsPrint {
    public void printElementsOfA2DArray (int a [][]) {
        for (int i = 0; i <a.length; i++) {
            for (int j = 0; j < a [0].length; j++) {
                System.out.print(a [i][j]+ " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int a [][] = {{1,3,5}, {2, 6, 9}, {3, 3, 5}};
        TwoDArrayElementsPrint TwoDArrayElementsPrint = new TwoDArrayElementsPrint();
        TwoDArrayElementsPrint.printElementsOfA2DArray(a);
    }
}
