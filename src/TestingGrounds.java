import java.time.LocalDateTime;

// Legg merke til at klassen som inneholder main-metoden ikke heter Program eller Main. Den kan hete hva som helst.
public class TestingGrounds {

    // En static-metode som tilhører TestingGrounds-klassen.
    public static LocalDateTime getCurrentTime() {
        return LocalDateTime.now();
    }

    // main-metoden er "hovedinngangsporten" til programmet vi lager.
    // Uten den kan ikke programmet kjøre.
    // Prøv å endre navn på metoden og se om det går an å kjøre programmet.
    public static void main(String[] args) {

        // Oppretter et objekt av klassen Car ved hjelp av en konstruktør uten parametere.
        Car myNonSpecificCar = new Car();

        // Kjører drive()-metoden på myNonSpecificCar-objektet.
        myNonSpecificCar.drive(250);

        // Metodekallet to linjer under vil ikke fungere siden metoden er private.
        // Prøv å fjerne "//" på begynnelsen av linja og se hva som skjer.
        // double time = myNonSpecificCar.calculateTime(distance);

        // Oppretter enda et objekt av klassen Car.
        // Denne gang bruker jeg den andre konstruktøren, som har parametere.
        Car myTrustyCar = new Car(220.28, 7.5, Tires.SUMMER, "Honda", "Civic");

        // Kjører drive()-metoden på myTrustyCar-objektet.
        // Legg merke til at siden verdiene i fields her er annerledes, blir output i konsollen også annerledes,
        // selv om distansen er den samme.
        myTrustyCar.drive(250);

        // Tester hva som skjer om distansen er negativ.
        myTrustyCar.drive(-100);

        // Lager et tredje objekt av klassen Car.
        Car myOtherCar = new Car();

        // Bruker setters til å endre på fields-verdiene i myOtherCar-objektet.
        myOtherCar.setTopSpeed(188.29);
        myOtherCar.setAcceleration(7.3);
        myOtherCar.setTires(Tires.WINTER);
        myOtherCar.setMake("Toyota");
        myOtherCar.setModel("Corolla");

        // Bruker noen gettere til å sette sammen en String som viser merke og modell.
        String myCorolla = myOtherCar.getMake() + " " + myOtherCar.getModel();

        // Printer myCorolla-stringen.
        System.out.println("\n" + myCorolla);

        // Printer returverdien til statiske metoden getCurrentTime() i Car-klassen i konsollen.
        System.out.println(Car.getCurrentTime());

        // Printer returverdien til statiske metoden getCurrentTime() i TestingGrounds-klassen i konsollen.
        // Legg merke til at jeg ikke måtte skrive "TestingGround.getCurrentTime()" her, fordi vi er allerede inne
        // i klassen som metoden er i.
        System.out.println("\n" + getCurrentTime());
    }
}
