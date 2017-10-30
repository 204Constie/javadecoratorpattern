package com.company;

/**
 * Created by constie on 29.10.2017.
 */
public class BasicCar implements ICar {
    public boolean airbags;
    public boolean fancyColor;
    public boolean parkAssist;


    public BasicCar(){

    };

    public String add(){

        return "Basic car chassis";
    };

    public int cost(){
      return 55;
    };

    public int discount(){
        return 0;
    }
}
