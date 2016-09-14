package kn222gn_assign2.Exercise2;

import java.util.List;

/**
 * Created by Golde on 2016-09-14.
 */
public class Vehicle {

    protected double space;
    protected int numberOfPassengers;
    protected int costPerPassenger;
    protected int feeForVehicle;
    protected String typeOfVehicle;
    protected List<Passenger> countPassengersInVehicle;


    //*setters
    // These will set all the values for the program
    // */
    protected void setPriceForVehicle(int pricePerVehicle){

        feeForVehicle = pricePerVehicle;
    }
    protected void setNumberOfPassengers(int numberOfPassengers){

        this.numberOfPassengers = numberOfPassengers;
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

        for(int i = 0; i < getNumberOfPassengers(); i += 1){

            countPassengersInVehicle.add(new Passenger(getCostPerPassenger()));
        }
        return countPassengersInVehicle;
    }

    //*getters
    // These will be called to get certain values in the program
    // */
    protected double getSpace(){

        return space;
    }
    protected int getCostPerPassenger(){

        return costPerPassenger;
    }
    protected int getFeeForVehicle(){

        return feeForVehicle;
    }
    protected int getNumberOfPassengers(){

        return numberOfPassengers;
    }
    protected String getTypeOfVehicle(){

        return typeOfVehicle;
    }
}