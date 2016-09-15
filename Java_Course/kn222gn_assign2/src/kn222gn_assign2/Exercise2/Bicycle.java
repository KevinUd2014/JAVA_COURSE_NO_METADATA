package kn222gn_assign2.Exercise2;

import java.util.List;

/**
 * Created by Golde on 2016-09-14.
 */
public class Bicycle extends Vehicle{

    private int maxNumberofpassengers = 1;

    protected Bicycle(int numbersOfPassengers){

        super(numbersOfPassengers);

        if(numbersOfPassengers <= maxNumberofpassengers){

            setNumberOfPassengers(numbersOfPassengers);
            setPriceForVehicle(40);
            setSpace(0.2);
        }
        else{

            System.out.println(" The amount of passengers in the Bicycle is not allowed ");
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
