package Class_31_java_7_OOPS_object_constructor_inheritance;

public class Vehicles {
    int weight;
    int height;

    public void findTypeOfVehicle(int weight) {
        if (weight >= 25000) {
            System.out.println("This vehicle requires a class B driver licence");
        } else if (weight >= 10000 && weight < 25000) {
            System.out.println(" This vehicle requires a class A driver licence");
        } else {
            System.out.println(" This vehiicle requires a class C driver licence");
        }
    }

    public void findTypeOfVehicle(String shape) {
        if (shape == "bulky") {
            System.out.println(" vehicle is a truck");
        } else if (shape == "long") {
            System.out.println("vehicle is a bus");
        } else if (shape == "compact") {
            System.out.println("vehicle is a car");
        }
    }

    public void FindIfVehicleHasRestrictions(int height) {
        if (height > 10) {
            System.out.println("Warning this vehicle cannot pass in certain roads");
        } else {
            System.out.println("This vehicle is safe to drive the majority of roads");
        }
    }


    public static void main(String[] args) {
        Vehicles Vehicle = new Vehicles();

        Vehicle.findTypeOfVehicle("compact");
    }
}
