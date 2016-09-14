package kn222gn_assign2.Exercise2;

/**
 * Created by Golde on 2016-09-14.
 */
public class Vehicle {

    int space;
    int noPassangers;
    int costPerPassenger;
    int feeForVehicle;

    public void setPriceForVehicle(int price){

        feeForVehicle = price;
    }
    public void setNumberOfPassengers(int numberOfPassengers){

        noPassangers = numberOfPassengers;
    }
    public void setSpace(int newSpace){

        space = newSpace;
    }
    public void setCostPerPassenger(int costPassenger){

        costPerPassenger = costPassenger;
    }

}
