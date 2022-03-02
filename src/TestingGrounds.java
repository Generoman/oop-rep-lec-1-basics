import java.time.LocalDateTime;

public class TestingGrounds {

    public static LocalDateTime getCurrentTime() {
        return LocalDateTime.now();
    }

    public static void main(String[] args) {

        // Oppretter et objekt av klassen Car ved hjelp av en konstruktør uten parametere:
        Car myNonSpecificCar = new Car();

        myNonSpecificCar.drive(250);

        // Metodekallet to linjer under vil ikke fungere siden metoden er private.
        // Prøv å fjerne "//" på begynnelsen av linja og se hva som skjer.
        // double time = myNonSpecificCar.calculateTime(distance);

        Car myTrustyCar = new Car(220.28, 7.5, Tires.SUMMER, "Honda", "Civic");

        myTrustyCar.drive(250.5);

        myTrustyCar.drive(-100);

        Car myOtherCar = new Car(254.10, 6.8, Tires.WINTER, "Toyota", "Corolla");

        String myCorolla = myOtherCar.getMake() + " " + myOtherCar.getModel();
        System.out.println("\n" + myCorolla);

        System.out.println(Car.getCurrentTime());
    }
}
