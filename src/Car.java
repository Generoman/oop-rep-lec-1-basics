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
            this.topSpeed = 0.1;
        // Høyeste toppfart jeg kunne finne på en bil er 447,19 km/t.
        // Derfor setter jeg øvre grense på 447.19 her.
        // Siden Java er på engelsk, brukes punktum istedenfor komma i desimaltall.
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
        // Siden Java er på engelsk, brukes punktum istedenfor komma i desimaltall.
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

    public Car() {
        this.topSpeed = 100;
        this.acceleration = 10;
        this.tires = Tires.SUMMER;
        this.make = "car of unspecified make";
        this.model = "and model";
    }

    public Car(double topSpeed, double acceleration, Tires tires, String make, String model) {

        // setTopSpeed-metoden har en sjekk på om toppfarta er mulig.
        // Derfor bruker jeg den istedenfor "this.topSpeed = topSpeed".
        setTopSpeed(topSpeed);

        // setAcceleration-metoden har en sjekk på om akselerasjonen er mulig.
        // Derfor bruker jeg den istedenfor "this.acceleration = acceleration".
        setAcceleration(acceleration);

        this.tires = tires;
        this.make = make;
        this.model = model;
    }



    // ANDRE PUBLIC-METODER:

    public void drive(double distance) {
        if (distance < 0) {
            // "\n" er bare der for at teksten skal komme på en ny linje og være litt lettere å lese i konsollen
            System.out.println("\nWhy do you want to drive " + distance + "km in reverse?");
        } else {
            double time = calculateTime(distance);
            // "\n" er bare der for at teksten skal komme på en ny linje og være litt lettere å lese i konsollen
            System.out.println("\nOur " + make + " " + model + " covers " + distance + "km in " + time + " hours");
            System.out.println("...if there are no speed limits.");
        }
    }



    // PRIVATE-METODER:

    private double calculateTime(double distance) {

        // Regner ut hvor lang tid bilen bruker (i timer) på en gitt avstand.
        double time = distance/topSpeed;

        // Runder av til 2 desimaler
        time = (double) Math.round(time * 100)/100;

        return time;
    }


}
