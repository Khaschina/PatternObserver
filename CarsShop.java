package com.Ekhashchina.PatternObserver;

/**
 * Created by 222 on 07.03.2016.
 */
public class CarsShop {

    public static void main(String[] args) {
        DollarRate dollarRate= new DollarRate();

        PriceCar priceCar = new PriceCar(dollarRate);
        ChangePriceCar basicCar = new BasicCar(dollarRate);

        dollarRate.setChangeDollarRate(76);
        basicCar.description();
        basicCar.priceCar(25000);

        dollarRate.setChangeDollarRate(43.4);
        basicCar.description();
        basicCar.priceCar(25000);

        dollarRate.setChangeDollarRate(54.776);
        basicCar.description();
        basicCar.priceCar(25000);
    }
}
