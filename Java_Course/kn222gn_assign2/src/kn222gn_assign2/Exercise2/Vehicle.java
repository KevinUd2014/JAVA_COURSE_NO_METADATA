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
    protected String typeOfVehicle;
    protected List<Passenger> passengerList;

    protected Vehicle(){

    }

    protected Vehicle(int numOfPassengers)
    {
        passengerList = new LinkedList<Passenger>();

        for(int i = 0; i < numOfPassengers; i++)
        {
            passengerList.add(new Passenger());
        }
    }
    //*setters
    // These will set all the values for the program
    // */
    protected void setPriceForVehicle(int pricePerVehicle){

        feeForVehicle = pricePerVehicle;
    }
    protected void setCost(int cost){

        this.cost = cost;
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
    protected void setTypeOfVehicle(String typeOfVehicle){

        this.typeOfVehicle = typeOfVehicle;
    }

    //list loop
    protected List<Passenger> getAllPassengers(){

       /* for(int i = 0; i < getNumberOfPassengers(); i += 1){

            passengerList.add(new Passenger(getCostPerPassenger()));
        }*/
        return passengerList;
    }

    //*getters
    // These will be called to get certain values in the program
    // */
    protected double getSpace(){

        return space;
    }
    protected int getCost(){

        return cost;
    }
    protected int getCostPerPassenger(){

        return costPerPassenger;
    }
    protected int getFeeForVehicle(){

        return feeForVehicle;
    }
    protected int getNumberOfPassengers(){

        return _numberOfPassengers;
    }
    protected String getTypeOfVehicle(){

        return typeOfVehicle;
    }
}