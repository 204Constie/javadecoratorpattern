package com.company;

/**
 * Created by constie on 29.10.2017.
 */
abstract class ACarDecorator implements ICar {
    protected ICar basicCar;

    public ACarDecorator(ICar newCar){
        basicCar = newCar;
    };
    public String add(){
        return basicCar.add();

    };

    public int cost(){
        return basicCar.cost();
    };

    public int discount(){
        return basicCar.discount();
    }
}
