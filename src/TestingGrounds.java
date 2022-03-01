public class TestingGrounds {

    public static void main(String[] args) {

        Car myNonSpecificCar = new Car();

        myNonSpecificCar.drive(250);

        Car myTrustyCar = new Car(220.28, 7.5, Tires.SUMMER, "Honda", "Civic");

        myTrustyCar.drive(250);
    }
}
