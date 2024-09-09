package Class_31_java_7_OOPS_object_constructor_inheritance;

public class Cars extends Vehicles{
    //class global variables:
    String model;
    String color;
    int year;
    int price;

    //constructor:
    public Cars(String model, String color, int year, int price) {
        this.model = model;
        this.color = color;
        this.year = year;
        this.price = price;
    }

    public void findIfCarIsOld() {
        if (year >= 2022) {
            System.out.println("This car is new");
        } else if (year >= 2015 && year < 2022) {
            System.out.println("This car is average");
        } else {
            System.out.println("This car is old");
        }
    }

    public void findIfCarIsCheap() {
        if (price > 65000) {
            System.out.println("This car is expensive");
        } else if (price > 40000) {
            System.out.println("This car price is average");
        } else {
            System.out.println("This car is cheap");
        }
    }

    public void findIfCarHasGoodValue() {
        if (year >= 2022 && price > 65000 || year >= 2015 && year <2022 && price > 40000
                || year < 2015 && price <= 40000) {
            System.out.println("This "+year+" "+model+ " car has fair value");
        } else if (year >= 2022 && price < 65000 || year >= 2015 && price < 40000) {
            System.out.println("This "+year+" "+model+" car has very good value");
        } else {
            System.out.println("This "+year+" "+model+" car has bad value");
        }
    }
    public void findTypeOfVehicle(int weight) {
        if (weight >= 4000 && weight <= 6000) {
            System.out.println("This vehicle is an SUV");
        } else if (weight < 4000) {
            System.out.println(" This vehicle is a sedan");
        } else {
            System.out.println(" This vehiicle is a van or box truck");
        }
    }

    public static void main(String[] args) {
        Cars tesla = new Cars("y", "black", 2023, 65000);
        tesla.findTypeOfVehicle(20000);
        Vehicles Vehicle = new Vehicles();
        Vehicle.findTypeOfVehicle(2000);

    }
}
