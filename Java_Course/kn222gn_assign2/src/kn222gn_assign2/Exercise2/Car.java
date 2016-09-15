package kn222gn_assign2.Exercise2;
import java.util.LinkedList;
import java.util.List;

/**
 * Created by Golde on 2016-09-14.
 */
public class Car extends Vehicle {

    private int maxNumberofpassengers = 4;

    protected Car(int numbersOfPassengers){

        super(numbersOfPassengers);

        //passengerList = new LinkedList<Passenger>();

        if(numbersOfPassengers <= maxNumberofpassengers){

            setNumberOfPassengers(numbersOfPassengers);
            setCostPerPassenger(15);
            setPriceForVehicle(100);
            setSpace(1.0);
        }
        else{

            System.out.println(" The amount of passengers in the car is not allowed ");
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