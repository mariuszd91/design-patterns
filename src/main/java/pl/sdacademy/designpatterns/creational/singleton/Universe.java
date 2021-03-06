package pl.sdacademy.designpatterns.creational.singleton;

public enum Universe {
    INSTANCE;

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
