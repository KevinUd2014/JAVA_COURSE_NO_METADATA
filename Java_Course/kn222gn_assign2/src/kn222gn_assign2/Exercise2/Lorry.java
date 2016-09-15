package kn222gn_assign2.Exercise2;

import java.util.List;

/**
 * Created by Golde on 2016-09-14.
 */
public class Lorry extends Vehicle{

    private int maxNumberofpassengers = 2;

    public Lorry(int numbersOfPassengers){

        super(numbersOfPassengers);

        if(numbersOfPassengers <= maxNumberofpassengers){

            setNumberOfPassengers(numbersOfPassengers);
            setCostPerPassenger(15);
            setPriceForVehicle(300);
            setSpace(8.0);
        }
        else{

            System.out.println(" The amount of passengers in the lorry is not allowed ");
        }
    }

    @Override
    protected double getSpace() {

        return space;
    }

    @Override
    protected int getFeeForVehicle(){

        return feeForVehicle;
    }

    @Override
    protected List<Passenger> getAllPassengers()
    {
        return super.getAllPassengers();
    }
}
