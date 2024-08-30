package class_27_class_Object_methode_constructor_referencevaraible;

public class AverageOfAllNumbersBetweenTwoAndEight {
    public double findAverageOfNumbersBetweenTwoAndEight(){
        int sum = 0;
        int count = 0;
        double avg = 0;
        for (int i = 2; i <= 8; i++) {
            sum = sum + i;
            count++;
        }
        avg = sum / count;
        return avg;
    }

    public static void main(String[] args) {
        AverageOfAllNumbersBetweenTwoAndEight AverageOfAllNumbersBetweenTwoAndEight = new AverageOfAllNumbersBetweenTwoAndEight();
        System.out.println("Average of all numbers between 2 and 8 is: ");
        System.out.println(AverageOfAllNumbersBetweenTwoAndEight.findAverageOfNumbersBetweenTwoAndEight());
    }
}
