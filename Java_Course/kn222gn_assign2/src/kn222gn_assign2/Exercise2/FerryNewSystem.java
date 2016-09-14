package kn222gn_assign2.Exercise2;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * Created by Golde on 2016-09-14.
 */
public class FerryNewSystem implements Ferry{

    private int totalNumberOfPassengers = 200;
    private int totalNumberOfSpace = 40;
    //private int usedSpace = 0;

    private ArrayList<Vehicle> vehicles;
    private ArrayList<Passenger> passenger;

    private int sizeOfCar = 0;
    private int amountOfMoney = 0;

    public FerryNewSystem(){

        //creates the new array lists
        vehicles = new ArrayList<>();
        passenger = new ArrayList<>();
    }

    @Override
    public int countPassengers() {

        //returns the size of the passenger list
        return passenger.size();
    }

    @Override
    public int countVehicleSpace() {

        //returns the sum of all the vehicles in the list
        double sum = 0;

        for(Vehicle vehicle : this.vehicles){

            sum += vehicle.getSpace();
            sum = Math.round(sum);
        }
        return (int)sum;
    }

    @Override
    public int countMoney() {

        //returns the amount of money
        return amountOfMoney;
    }

    @Override
    public void embark(Vehicle v) {

    }

    @Override
    public void embark(Passenger p) {

    }

    @Override
    public void disembark() {

        //Clears all the lists with all the vehicles and passengers
        vehicles.clear();
        passenger.clear();
        //usedSpace = 0;
    }

    @Override
    public boolean hasSpaceFor(Vehicle v) {

        if(vehicles.contains(v)){

            return false;
        }
        else if(countVehicleSpace() + v.getSpace() <= totalNumberOfSpace){

            return true;
        }
        else{

            return false;
        }
    }

    @Override
    public boolean hasRoomFor(Passenger p) {

        if(countPassengers() > totalNumberOfPassengers && passenger.contains(p)){

            return false;
        }
        else{

            return true;
        }
    }

    @Override
    public Iterator<Vehicle> iterator() {

        return null;
    }

    public String toString(){

        String text = "";

        return text;
    }
}