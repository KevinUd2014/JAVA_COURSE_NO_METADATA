package kn222gn_assign2.Exercise2;
import java.util.LinkedList;
import java.util.List;

/**
 * Created by Golde on 2016-09-14.
 */
public class Bus extends Vehicle {

    //private int maxNumberofpassengers = 20;

    protected Bus(int numbersOfPassengers){

        super(numbersOfPassengers);
        maxNumberOfPassengers = 20;
        if(numbersOfPassengers <= maxNumberOfPassengers){

            setNumberOfPassengers(numbersOfPassengers);
            setCostPerPassenger(10);
            setPriceForVehicle(200);
            setSpace(4.0);
        }
        else{

            System.err.println(" The amount of passengers in the Bus is not allowed ");
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
