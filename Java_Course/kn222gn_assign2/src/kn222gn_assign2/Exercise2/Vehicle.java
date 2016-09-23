package kn222gn_assign2.Exercise2;

import java.util.List;
import java.util.LinkedList;

/**
 * Created by Golde on 2016-09-14.
 */
public abstract class Vehicle {

    protected double space;
    protected int _numberOfPassengers;
    protected int costPerPassenger;
    protected int cost;
    protected int feeForVehicle;
    protected List<Passenger> passengerList;
    protected int maxNumberOfPassengers;

    protected Vehicle(){//empty constructor

    }
    protected Vehicle(int numOfPassengers)//sets the number of passengers
    {
        passengerList = new LinkedList<Passenger>();

        for(int i = 0; i < numOfPassengers; i++)
        {
            passengerList.add(new Passenger(costPerPassenger));
        }
    }
    //*setters
    // These will set all the values for the program
    // */
    protected void setPriceForVehicle(int pricePerVehicle){

        feeForVehicle = pricePerVehicle;
    }
    protected void setNumberOfPassengers(int numberOfPassengers){

        this._numberOfPassengers = numberOfPassengers;
    }
    protected void setSpace(double spaceForVehicle){

        space = spaceForVehicle;
    }
    protected void setCostPerPassenger(int costPerPassenger){

        this.costPerPassenger = costPerPassenger;
    }

    //list loop
    protected List<Passenger> getAllPassengers(){

        return passengerList;
    }

    //*getters
    // These will be called to get certain values in the program
    // */
    protected double getSpace(){

        return space;
    }
    protected int getFeeForVehicle(){

        return feeForVehicle;
    }
    protected int getPassengerPerVehicle(){

        return _numberOfPassengers;
    }
    public abstract String toString(); // to string function
}