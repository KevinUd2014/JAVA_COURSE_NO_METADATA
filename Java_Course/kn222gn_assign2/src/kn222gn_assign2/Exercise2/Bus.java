package kn222gn_assign2.Exercise2;
import java.util.LinkedList;

/**
 * Created by Golde on 2016-09-14.
 */
public class Bus extends Vehicle {

    private int maxNumberofpassengers = 20;

    protected Bus(int numbersOfPassengers){
        passengerList = new LinkedList<Passenger>();

        if(numbersOfPassengers <= maxNumberofpassengers){

            setNumberOfPassengers(numbersOfPassengers);
            setCostPerPassenger(10);
            setPriceForVehicle(200);
            setSpace(4.0);
            setTypeOfVehicle("Bus");
        }
        else{

            System.out.println(" The amount of passengers in the Bus is not allowed ");
        }
    }

    @Override
    protected double getSpace() {
        return space;
    }
}
