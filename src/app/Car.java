package app;

/**
 * Represents a Car with various properties.
 */
public class Car {

    private int year;
    private String make;
    private String model;
    private int odometer;
    private double engineLiters;

    /**
     * Default constructor to initialize Car with default values.
     */
    public Car() {
        year = 0;
        make = "";
        model = "";
        odometer = 0;
        engineLiters = 0;
    }

    /**
     * Parameterized constructor to create a Car with specified values.
     *
     * @param year          The year of the car.
     * @param make          The make of the car.
     * @param model         The model of the car.
     * @param odometer      The odometer reading of the car.
     * @param engineLiters  The engine size of the car in liters.
     */
    public Car(int year, String make, String model, int odometer, double engineLiters) {
        this.year = year;
        this.make = make;
        this.model = model;
        this.odometer = odometer;
        this.engineLiters = engineLiters;
    }

    // Getter methods

    /**
     * Get the year of the car.
     *
     * @return The year of the car.
     */
    public int getYear() {
        return year;
    }

    /**
     * Get the make of the car.
     *
     * @return The make of the car.
     */
    public String getMake() {
        return make;
    }

    /**
     * Get the model of the car.
     *
     * @return The model of the car.
     */
    public String getModel() {
        return model;
    }

    /**
     * Get the odometer reading of the car.
     *
     * @return The odometer reading of the car.
     */
    public int getOdometer() {
        return odometer;
    }

    /**
     * Get the engine size of the car in liters.
     *
     * @return The engine size of the car.
     */
    public double getEngineLiters() {
        return engineLiters;
    }

    // Setter methods

    /**
     * Set the year of the car.
     *
     * @param year The year of the car.
     */
    public void setYear(int year) {
        this.year = year;
    }

    /**
     * Set the make of the car.
     *
     * @param make The make of the car.
     */
    public void setMake(String make) {
        this.make = make;
    }

    /**
     * Set the model of the car.
     *
     * @param model The model of the car.
     */
    public void setModel(String model) {
        this.model = model;
    }

    /**
     * Set the odometer reading of the car.
     *
     * @param odometer The odometer reading of the car.
     */
    public void setOdometer(int odometer) {
        this.odometer = odometer;
    }

    /**
     * Set the engine size of the car in liters.
     *
     * @param engineLiters The engine size of the car.
     */
    public void setEngineLiters(double engineLiters) {
        this.engineLiters = engineLiters;
    }

    /**
     * The main method of the Car class (not used for application logic).
     *
     * @param args The command-line arguments.
     */
    public static void main(String[] args) {

    }
}