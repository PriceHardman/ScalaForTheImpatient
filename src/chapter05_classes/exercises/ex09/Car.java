package chapter05_classes.exercises.ex09;

/*
    Reimplement the class of the preceding exercise
    in Java, C#, or C++ (your choice).
    How much shorter is the Scala class?


    Scala: 19 lines
    Java: 29 lines
 */

public class Car {
    private String make;
    private String model;
    private int year = -1;
    private String licensePlate = "";

    Car(String make, String model){
        this.make = make;
        this.model = model;
    }
    Car(String make, String model, int year){
        this(make,model);
        this.year = year;
    }
    Car(String make, String model, String licensePlate){
        this(make,model);
        this.licensePlate = licensePlate;
    }
    Car(String make, String model, int year, String licensePlate){
        this(make,model);
        this.year = year;
        this.licensePlate = licensePlate;
    }
    public String getMake(){return make;}
    public String getModel(){return model;}
    public int getYear(){return year;}
    public String getLicensePlate(){return licensePlate;}
    public void setLicensePlate(String licensePlate){this.licensePlate = licensePlate;}
}
