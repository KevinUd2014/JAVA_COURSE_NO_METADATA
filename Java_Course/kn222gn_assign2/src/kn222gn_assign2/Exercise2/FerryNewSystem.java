package kn222gn_assign2.Exercise2;

import java.util.Iterator;

/**
 * Created by Golde on 2016-09-14.
 */
public class FerryNewSystem implements Ferry{

    private int totalNumberOfPassengers = 200;
    private int totalNumberOfCars = 40;

    private int sizeOfCar = 0;
    private int amountOfMoney = 0;

    

    @Override
    public int countPassengers() {

        return 0;
    }

    @Override
    public int countVehicleSpace() {

        return 0;
    }

    @Override
    public int countMoney() {

        return 0;
    }

    @Override
    public void embark(Vehicle v) {

    }

    @Override
    public void embark(Passenger p) {

    }

    @Override
    public void disembark() {

    }

    @Override
    public boolean hasSpaceFor(Vehicle v) {

        return false;
    }

    @Override
    public boolean hasRoomFor(Passenger p) {

        return false;
    }

    @Override
    public Iterator<Vehicle> iterator() {

        return null;
    }
}