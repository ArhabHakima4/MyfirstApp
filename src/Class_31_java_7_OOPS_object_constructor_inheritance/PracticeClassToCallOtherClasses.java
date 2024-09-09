package Class_31_java_7_OOPS_object_constructor_inheritance;

public class PracticeClassToCallOtherClasses {
    public static void main(String[] args) {
        Cars Tesla = new Cars("model X","Red", 2023, 85000);
        Tesla.findIfCarHasGoodValue();
        Tesla.findIfCarIsOld();
        Tesla.findIfCarIsCheap();
        Cars Mercedes = new Cars("model S200", "black", 2016, 2000);
        Mercedes.findIfCarHasGoodValue();
        Mercedes.findIfCarIsOld();
        Mercedes.findIfCarIsCheap();
        Tesla.FindIfVehicleHasRestrictions(5);
        Tesla.findTypeOfVehicle(6000);
        Tesla.findTypeOfVehicle("compact");
        Tesla.findTypeOfVehicle(20000);
        Vehicles Vehicle = new Vehicles ();
        Vehicle.findTypeOfVehicle("long");
        Vehicle.findTypeOfVehicle(30000);
    }
}
