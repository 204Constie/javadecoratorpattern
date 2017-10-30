package com.company;

/**
 * Created by constie on 29.10.2017.
 */
public class FancyColor extends ACarDecorator {

    public FancyColor(ICar newCar){
        super(newCar);
    };

    public String add(){
        return basicCar.add() + ", fancy color";
    };

    public int cost(){
        return basicCar.cost() + 3;
    };

    public int discount(){
        return basicCar.discount() + 1;
    }
}
