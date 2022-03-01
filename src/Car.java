public class Car {

    // FIELDS:

    private double topSpeed;
    private double acceleration;
    private Tires tires;
    private String make;
    private String model;


    // CONSTRUCTOR:

    public Car(double topSpeed, double acceleration, Tires tires, String make, String model) {

        setTopSpeed(topSpeed);

        setAcceleration(acceleration);

        this.tires = tires;
        this.make = make;
        this.model = model;
    }



    // GETTERS/SETTERS:

    public double getTopSpeed() {
        return topSpeed;
    }

    public void setTopSpeed(double topSpeed) {
        if (topSpeed <= 0) {
            this.topSpeed = 0.1;
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



    // OTHER PUBLIC METHODS:

    public void drive(double distance) {
        if (distance < 0) {
            System.out.println("Why do you want to drive in reverse?");
        } else {
            System.out.println("Our " + make + " " + model + " covers " + distance + "km in " + calculateTime() + " hours.");
        }
    }



    // PRIVATE METHODS:

    private double calculateTime() {

        // Denne delen av koden regner ut hvor lang tid bilen bruker på en gitt avstand.
        // Den er ikke viktig for å forstå metoder, jeg måtte bare ha noe fungerende
        // kode som et eksempel. Om dere ikke forstår denne delen, kan dere se bort fra den.
        double time = (topSpeed * topSpeed)/(2 * acceleration)/360;

        // Runder av til 2 desimaler
        time = (double) Math.round(time * 100)/100;

        return time;
    }


}
