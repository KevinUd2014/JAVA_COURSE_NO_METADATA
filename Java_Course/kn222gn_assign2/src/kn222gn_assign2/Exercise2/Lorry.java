package kn222gn_assign2.Exercise2;

/**
 * Created by Golde on 2016-09-14.
 */
public class Lorry extends Vehicle{

    private int maxNumberofpassengers = 2;

    public Lorry(int numbersOfPassengers){

        if(numberOfPassengers > maxNumberofpassengers){

            setNumberOfPassengers(numbersOfPassengers);
            setCostPerPassenger(15);
            setPriceForVehicle(300);
            setSpace(8.0);
            setTypeOfVehicle("Lorry");
        }
        else{

            System.out.println(" The amount of passengers in the lorry is not allowed ");
        }
    }
}
