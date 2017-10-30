package com.company;

/**
 * Created by constie on 29.10.2017.
 */
public class ParkAssist extends ACarDecorator {

    public ParkAssist(ICar newCar){
        super(newCar);
    };

    public String add(){
        return basicCar.add() + ", park assist";
    };

    public int cost(){
        return basicCar.cost() + 8;
    };

    public int discount(){
        return basicCar.discount() + 1;
    }
}

