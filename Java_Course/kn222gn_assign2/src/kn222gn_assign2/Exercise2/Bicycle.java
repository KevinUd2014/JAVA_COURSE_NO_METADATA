package kn222gn_assign2.Exercise2;

import java.util.List;

/**
 * Created by Golde on 2016-09-14.
 */
public class Bicycle extends Vehicle{

   // private int maxNumberOfPassengers = 1;

    protected Bicycle(int numbersOfPassengers){

        super(numbersOfPassengers);

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
    protected double getSpace() {

        return space;
    }

    @Override
    protected List<Passenger> getAllPassengers()
    {
        return super.getAllPassengers();
    }
}
