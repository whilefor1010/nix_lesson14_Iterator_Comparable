package org.example;

import java.util.*;

public class App
{
    public static void main( String[] args )
    {
        ArrayList<Car> cars = new ArrayList<>(List.of(  new Car(1988, 2000),
                                                        new Car(1915, 7000),
                                                        new Car(1972, 1100),
                                                        new Car(1927, 2000)));
        System.out.println("input list:");
        System.out.println(cars);

        System.out.println("sort by capacity:");
        Comparator<Car> comparatorByCapacity = Comparator.comparing(Car::getEngineCapacity);
        cars.sort(comparatorByCapacity);
        System.out.println(cars);

        System.out.println("sort by year:");
        Comparator<Car> comparatorByYear = Comparator.comparing(Car::getYearOfManufacture);

        TreeSet<Car> carsTree = new TreeSet<>(comparatorByYear);
        carsTree.addAll(cars);
        System.out.println(carsTree);
    }
}
