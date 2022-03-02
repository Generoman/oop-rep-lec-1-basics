public class TestingGrounds {

    public static void main(String[] args) {

        Car myNonSpecificCar = new Car();

        myNonSpecificCar.drive(250);

        // Metodekallet på linje 11 vil ikke fungere siden metoden er private.
        // Prøv å fjerne "//" på begynnelsen av linja og se hva som skjer.
        // double time = myNonSpecificCar.calculateTime(distance);

        Car myTrustyCar = new Car(220.28, 7.5, Tires.SUMMER, "Honda", "Civic");

        myTrustyCar.drive(250);
    }
}
