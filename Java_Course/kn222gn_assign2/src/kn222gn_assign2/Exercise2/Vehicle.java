package kn222gn_assign2.Exercise2;

/**
 * Created by Golde on 2016-09-14.
 */
public class Vehicle {

    protected double space;
    protected int numberOfPassengers;
    protected int costPerPassenger;
    protected int feeForVehicle;
    protected String typeOfVehicle;

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