package kn222gn_assign2.Exercise2;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * Created by Golde on 2016-09-14.
 */
public class FerryNewSystem implements Ferry{

    private int totalNumberOfPassengers;
    private int totalNumberOfSpace;

    private ArrayList<Vehicle> vehicles;
    private ArrayList<Passenger> passenger;

    private int amountOfMoney;

    public FerryNewSystem(){

        //creates the new array lists
        vehicles = new ArrayList<>();
        passenger = new ArrayList<>();

        amountOfMoney = 0;
        totalNumberOfSpace = 40;
        totalNumberOfPassengers = 200;
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

    public double countDoubleVehiclespace()//This one is needed because a bike is smaller than a car since car is 1....
    {
        double sum = 0;

        for(Vehicle vehicle : this.vehicles){

            sum += vehicle.getSpace();
            //sum = Math.round(sum);
        }
        sum = Math.round(sum * 100.0) / 100.0;
        return sum;
    }

    @Override
    public int countMoney() {

        //returns the amount of money
        return amountOfMoney;
    }

    @Override
    public void embark(Vehicle v) {

        if(hasSpaceFor(v)){
            if(v.getAllPassengers().size() <= v.maxNumberOfPassengers && passenger.size() + v.maxNumberOfPassengers <= totalNumberOfPassengers){
                vehicles.add(v);
                this.amountOfMoney += v.getFeeForVehicle();

                for(Passenger _passenger : v.getAllPassengers()){


                    embark(new Passenger(v.costPerPassenger));
                }
            }
            else{

                System.err.println("");
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

            if(passenger.size() < totalNumberOfPassengers){
                this.amountOfMoney += p.getCost();
                this.passenger.add(p);
            }
            else{

                System.err.println(" Ferry is now full, no more passengers \n");
            }
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
        //System.out.println(countVehicleSpace() + v.getSpace() <= totalNumberOfSpace);
        if(vehicles.contains(v)){

            return false;
        }
        else if(countDoubleVehiclespace() + v.getSpace() <= totalNumberOfSpace){

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

        text += " _________________________\n";
        text += " Information from the ferry\n";
        text += " _________________________\n";
        text += " Vehicles on ship: " + vehicles.size() + "\n";
        text += " Passengers on ship: " + passenger.size() + "/" + totalNumberOfPassengers + "\n";
        text += " Space occupied: " + countDoubleVehiclespace() + "/" + totalNumberOfSpace + "\n";
        text += " Total income: " + amountOfMoney + "\n";
        text += " _________________________\n";
        text += " Vehicle details \n";
        text += "";
        Iterator<Vehicle> iterator = vehicles.iterator();
        while (iterator.hasNext()) {
            text += iterator.next().toString() + "\n";
        }
        return text;
    }
}