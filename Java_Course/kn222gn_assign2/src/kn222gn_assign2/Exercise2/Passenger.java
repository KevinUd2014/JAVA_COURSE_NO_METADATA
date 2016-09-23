package kn222gn_assign2.Exercise2;

/**
 * Created by Golde on 2016-09-14.
 */
public class Passenger {

    private int cost;

    public Passenger(){

        this.cost = 20;//sets the cost for the passenger
    }

    protected Passenger(int _cost){

        cost = _cost;
    }
    protected int getCost(){

        return this.cost;
    }

}
