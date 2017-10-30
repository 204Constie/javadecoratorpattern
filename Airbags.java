package com.company;

/**
 * Created by constie on 29.10.2017.
 */
public class Airbags extends ACarDecorator {

    public Airbags(ICar newCar){
        super(newCar);
    };

    public String add(){
      return basicCar.add() + ", airbags";
    };

    public int cost(){
      return basicCar.cost() + 6;
    };

    public int discount(){
        return basicCar.discount() + 1;
    }
}
