package kn222gn_assign2.Exercise2;

import java.util.List;

/**
 * Created by Golde on 2016-09-14.
 */
public class Bicycle extends Vehicle{

   // private int maxNumberOfPassengers = 1;

    protected Bicycle(int numbersOfPassengers){//sets all the values for the vehicle

        super(numbersOfPassengers);//adds this value to the superclass

        maxNumberOfPassengers = 1;
        if(numbersOfPassengers <= maxNumberOfPassengers){

            setNumberOfPassengers(numbersOfPassengers);
            setPriceForVehicle(40);
            setSpace(0.2);
        }
        else{

            System.err.println(" The amount of passengers in the Bicycle is not allowed ");
        }
    }

    @Override
    public String toString(){ // will write this as a string in the toString.
        String text= "";

        text += "Bicycle: " + getSpace() + " How many passengers: " + getPassengerPerVehicle();

        return text;

    }

    @Override
    protected double getSpace() {

        return space;
    }

    @Override
    protected List<Passenger> getAllPassengers()
    {
        return super.getAllPassengers();
    }
}
