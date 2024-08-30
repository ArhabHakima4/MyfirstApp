package class_27_class_Object_methode_constructor_referencevaraible;

    public class FibonacciSeriesUptoTen {
        public void printFibonacciSerie() {
            int n1 = 0, n2 = 1, n3;
            System.out.print(n1 + " " + n2); // print the first two terms

            for (int i = 2; i < 10; i++) { // loop starts from 2 because 0 and 1 are already printed
                n3 = n1 + n2;
                System.out.print(" " + n3);
                n1 = n2;
                n2 = n3;
            }
        }

        public static void main(String[] args) {
            FibonacciSeriesUptoTen fibonacci = new FibonacciSeriesUptoTen();
            fibonacci.printFibonacciSerie();
        }
    }

