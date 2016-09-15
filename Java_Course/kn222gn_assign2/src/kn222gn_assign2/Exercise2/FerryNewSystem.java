package kn222gn_assign2.Exercise2;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * Created by Golde on 2016-09-14.
 */
public class FerryNewSystem implements Ferry{

    private int totalNumberOfPassengers = 200;
    private int totalNumberOfSpace = 40;

    private ArrayList<Vehicle> vehicles;
    private ArrayList<Passenger> passenger;

    private int amountOfMoney;

    public FerryNewSystem(){

        //creates the new array lists
        vehicles = new ArrayList<>();
        passenger = new ArrayList<>();

        amountOfMoney = 0;
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
            //sum = Math.round(sum);
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

        if(hasSpaceFor(v)){

            vehicles.add(v);
            this.amountOfMoney += v.getFeeForVehicle();

            for(Passenger _passenger : v.getAllPassengers()){

                embark(new Passenger(v.costPerPassenger));//har ett error här den räknar inte med alla passagerare i bilens kostnader
            }
        }
        else {
            System.err.println("\n Ferry is now full ");
        }
    }

    @Override
    public void embark(Passenger p) {

        //checks if there is any room left.
        if(hasRoomFor(p)){

            this.amountOfMoney += p.getCost();
            this.passenger.add(p);
        }
        else {
            System.err.println("\n Ferry is now full ");
        }

    }

    @Override
    public void disembark() {

        //Clears all the lists with all the vehicles and passengers
        vehicles.clear();
        passenger.clear();
        amountOfMoney = 0;
        //usedSpace = 0;
    }

    @Override
    public boolean hasSpaceFor(Vehicle v) {

        //if vehicle already exists
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

        return new Iterator<Vehicle>() {

            private int countVehicles = 0;

            public boolean hasNext(){

                return countVehicles<vehicles.size();
            }
            public Vehicle next(){

                return vehicles.get(countVehicles++);
            }
        };
    }

    public String toString(){

        String text = "";

        return text;
    }
}