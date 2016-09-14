package kn222gn_assign2.Exercise2;

/**
 * Created by Golde on 2016-09-14.
 */
public class Passenger {

    int cost;

    protected Passenger(){

        cost = 20;
    }

    protected Passenger(int _cost){

        cost = _cost;
    }
    protected int getCost(){

        return cost;
    }

}
