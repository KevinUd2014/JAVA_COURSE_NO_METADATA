package kn222gn_assign2.Exercise2;

/**
 * Created by Golde on 2016-09-14.
 */
public class FerryMain {

    public static void main(String args[]){

        FerryNewSystem ferrySystem = new FerryNewSystem();

        ferrySystem.embark(new Car(4));
        //ferrySystem.embark(new Car(4));

        //It won't count the bicycles if it's less than 5 of them!
        ferrySystem.embark(new Bicycle(1));
        //ferrySystem.embark(new Bicycle(1));
        //ferrySystem.embark(new Bicycle(1));
        //ferrySystem.embark(new Bicycle(1));
        ferrySystem.embark(new Bicycle(1));

        ferrySystem.embark(new Bus(20));
        ferrySystem.embark(new Bus(20));

        ferrySystem.embark(new Lorry(2));
        ferrySystem.embark(new Lorry(2));

        System.out.println(" Spaces taken: " + ferrySystem.countVehicleSpace());
        System.out.println(" Passengers: " + ferrySystem.countPassengers());

        System.out.println("\n Count passengers: " + ferrySystem.countPassengers() + "        //Should be 57 ");
        System.out.println("\n Counting vehicle spaces: " + ferrySystem.countVehicleSpace() + " //Should be 27 ");

        System.out.println("\n Counting the money earned: " + ferrySystem.countMoney() + " Should be 2130");

        System.out.println("\n\n Will now add one more bus (11 passengers) and one car and 2 other passengers");

        for(int i = 0; i<2; i+=1){

            ferrySystem.embark(new Passenger());
        }
        ferrySystem.embark(new Bus(11));

        System.out.println("\n Count passengers: " + ferrySystem.countPassengers() + "        //Should be 70 ");
        System.out.println("\n Counting vehicle spaces: " + ferrySystem.countVehicleSpace() + " //Should be 31 ");

        ferrySystem.disembark();

        ferrySystem.embark(new Car(0));
        ferrySystem.embark(new Car(0));
        ferrySystem.embark(new Bus(1));
        //ferrySystem.embark(new Passenger());


        System.out.println("\n Count passengers: " + ferrySystem.countPassengers() + "        //Should be 70 ");
        System.out.println("\n Counting vehicle spaces: " + ferrySystem.countVehicleSpace() + " //Should be 31 ");

        System.out.println("\n Counting the money earned: " + ferrySystem.countMoney() + " Should be 410");

    }
}
