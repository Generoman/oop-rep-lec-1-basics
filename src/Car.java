import java.time.LocalDateTime;

public class Car {

    // FIELDS:

    private double topSpeed;
    private double acceleration;
    private Tires tires;
    private String make;
    private String model;



    // GETTERE OG SETTERE:

    public double getTopSpeed() {
        return topSpeed;
    }

    public void setTopSpeed(double topSpeed) {

        // Toppfarta kan ikke være 0 eller negativ.
        // Derfor er nedre grense satt på 0,1 km/t.
        if (topSpeed <= 0) {
        // Siden Java er på engelsk, brukes punktum istedenfor komma i desimaltall.
            this.topSpeed = 0.1;
        // Høyeste toppfart jeg kunne finne på en bil er 447,19 km/t.
        // Derfor setter jeg øvre grense på 447.19 her.
        }else if (topSpeed > 447.19) {
            this.topSpeed = 447.19;
        } else {
            this.topSpeed = topSpeed;
        }
    }

    public double getAcceleration() {
        return acceleration;
    }

    public void setAcceleration(double acceleration) {

        // Høyeste akselerasjon jeg kunne finne på en bil er 0-100 km/t på 2,3 sekunder.
        // Derfor setter jeg en nedre grense på 2.3 her.
        if (acceleration < 2.3) {
            this.acceleration = 2.3;
        } else {
            this.acceleration = acceleration;
        }
    }

    public Tires getTires() {
        return tires;
    }

    public void setTires(Tires tires) {
        this.tires = tires;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }



    // KONSTRUKTØRER:

    public Car(double topSpeed, double acceleration, Tires tires, String make, String model) {

        // setTopSpeed-metoden har en sjekk på om toppfarta er mulig.
        // Derfor bruker jeg den istedenfor "this.topSpeed = topSpeed".
        setTopSpeed(topSpeed);

        // setAcceleration-metoden har en sjekk på om akselerasjonen er mulig.
        // Derfor bruker jeg den istedenfor "this.acceleration = acceleration".
        setAcceleration(acceleration);

        // "this" er et selvrefererende nøkkelord.
        // "this.tires" betyr "tires-fieldet som tilhører denne klassen".
        // Bare "tires" refererer til parameteren definert i metodesignaturen.
        this.tires = tires;
        this.make = make;
        this.model = model;
    }

    public Car() {
        // I en konstruktør som ikke har parametere trenger vi ikke å bruke "this",
        // siden vi ikke har en referanse (parameter eller lokal variabel) med samme navn som et field
        topSpeed = 100;
        acceleration = 10;
        tires = Tires.SUMMER;
        make = "car of unspecified make";
        model = "and model";
    }



    // ANDRE PUBLIC-METODER:

    public void drive(double distance) {
        if (distance < 0) {
            // "\n" er bare der for at teksten skal komme på en ny linje og være litt lettere å lese i konsollen
            System.out.println("\nWhy do you want to drive " + distance*-1 + "km in reverse?");
        } else {
            double time = calculateTime(distance);

            System.out.println("\nOur " + make + " " + model + " covers " + distance + "km in " + time + " hours");
            System.out.println("...if there are no speed limits.");
        }
    }

    // Eksempel på en static metode:
    public static String getCurrentTime() {

        String time = "\nI have no idea what time it is. I'm a car, not a clock!";

        // Merk at "return time;" her har INGENTING å gjøre med "return time;" i calculateTime()-metoden.
        // "time" i getCurrentTime()- og calculateTime()-metodene har fullstendig ulike verdier.
        return time;
    }



    // PRIVATE-METODER:

    private double calculateTime(double distance) {

        // Regner ut hvor lang tid bilen bruker (i timer) på en gitt avstand.
        double time = distance/topSpeed;

        // Runder av til 2 desimaler
        // Se bort ifra "(double)" her, det vil bli forklart i en senere forelesning.
        time = (double) Math.round(time * 100)/100;

        // Merk at "return time;" her har INGENTING å gjøre med "return time;" i getCurrentTime()-metoden.
        // "time" i getCurrentTime()- og calculateTime()-metodene har fullstendig ulike verdier.
        return time;
    }

}
