package kn222gn_assign2.Exercise2;

/**
 * Created by Golde on 2016-09-14.
 */
public class Car extends Vehicle {

    private int maxNumberofpassengers = 4;

    protected Car(int numbersOfPassengers){

        if(numberOfPassengers > maxNumberofpassengers){

            setNumberOfPassengers(numbersOfPassengers);
            setCostPerPassenger(15);
            setPriceForVehicle(100);
            setSpace(1.0);
            setTypeOfVehicle("Car");
        }
        else{

            System.out.println(" The amount of passengers in the car is not allowed ");
        }
    }
}