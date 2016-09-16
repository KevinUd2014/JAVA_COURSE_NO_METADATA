package kn222gn_assign2.Exercise2;

import java.util.List;

/**
 * Created by Golde on 2016-09-14.
 */
public class Lorry extends Vehicle{

    //private int maxNumberofpassengers = 2;

    public Lorry(int numbersOfPassengers){

        super(numbersOfPassengers);

        maxNumberOfPassengers = 2;
        if(numbersOfPassengers <= maxNumberOfPassengers){

            setNumberOfPassengers(numbersOfPassengers);
            setCostPerPassenger(15);
            setPriceForVehicle(300);
            setSpace(8.0);
        }
        else{

            System.err.println(" The amount of passengers in the lorry is not allowed ");
        }
    }
    @Override
    public String toString(){
        String text= "";

        text += "Lorry: " + getSpace() + " How many passengers: " + getPassengerPerVehicle();

        return text;

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
