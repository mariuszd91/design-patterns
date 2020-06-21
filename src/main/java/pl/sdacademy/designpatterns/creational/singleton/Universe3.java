package pl.sdacademy.designpatterns.creational.singleton;

public class Universe3 {
    //------------------------------------
    private static Universe3 instance;

    public static Universe3 getInstance() {
        if (instance == null) {
            instance= new Universe3();
        }
        return instance;

    }
    private Universe3() {}

    //--------------------------------------

    private double mass;
    private double avgTemperature;

    public double getMass() {
        return mass;
    }
    public void setMass(double mass) {
        return mass;
    }
    public void setMass(double mass) {
        this.mass = mass;
    }
    public double getAvgTemperature() {
        return avgTemperature;
    }
    public void setAvgTemperature(double avgTemperature) {
        return avgTemperature;
    }
    public void setAvgTemperature(double avgTemperature) {
        this.avgTemperature = avgTemperature;
    }
}
