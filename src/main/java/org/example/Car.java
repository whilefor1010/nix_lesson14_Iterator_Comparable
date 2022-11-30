package org.example;

public class Car implements Comparable<Car> {

    private int yearOfManufacture;
    private int engineCapacity;

    @Override
    public int compareTo(Car o) {
        return Integer.compare(this.yearOfManufacture, o.yearOfManufacture);
    }

    @Override
    public String toString() {
        return "Car{" +
                "yearOfManufacture=" + yearOfManufacture +
                ", engineCapacity=" + engineCapacity +
                '}';
    }

    public Car(int yearOfManufacture, int engineCapacity) {

        this.yearOfManufacture = yearOfManufacture;
        this.engineCapacity = engineCapacity;
    }

    public int getYearOfManufacture() {
        return yearOfManufacture;
    }

    public int getEngineCapacity() {
        return engineCapacity;
    }


}
