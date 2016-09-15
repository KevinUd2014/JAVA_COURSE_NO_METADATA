package kn222gn_assign2.Exercise2;

/**
 * Created by Golde on 2016-09-14.
 */
public class FerryMain {

    public static void main(String args[]){

        FerryNewSystem ferrySystem = new FerryNewSystem();

        Car c = new Car(1);
        ferrySystem.embark(c);
        Car c2 = new Car(2);
        ferrySystem.embark(c2);


        /*Bicycle bicycle = new Bicycle(1);
        Car car = new Car(2);
        Lorry lorry = new Lorry(2);
        Bus bus = new Bus(2);
        Bus bus2 = new Bus(18);

        ferrySystem.embark(car);
        ferrySystem.embark(bus);
        ferrySystem.embark(bus2);
        ferrySystem.embark(lorry);
        ferrySystem.embark(bicycle);*/

        System.out.println("Spaces taken: " + ferrySystem.countVehicleSpace());
        System.out.println("Passengers: " + ferrySystem.countPassengers());

    }
}
