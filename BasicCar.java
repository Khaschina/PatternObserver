package com.Ekhashchina.PatternObserver;

/**
 * Created by 222 on 07.03.2016.
 */
public class BasicCar implements ChangePriceCar, DollarObserver{
    private double dollar;

    private DollarsSubject dollarsSubject;

    public BasicCar(DollarsSubject dollarsSubject)
    {

        this.dollarsSubject = dollarsSubject;
        dollarsSubject.registerDollarObserver(this);
    }


    @Override
    public void update(double dollar) {
        this.dollar = dollar;
    }

    @Override
    public void priceCar(int costCar) {
        System.out.println(dollar * costCar);
    }

    @Override
    public void description() {
        System.out.println("BasicCarsSet");
    }
}
