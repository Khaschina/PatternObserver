package com.Ekhashchina.PatternObserver;

/**
 * Created by 222 on 07.03.2016.
 */
public class PriceCar implements DollarObserver {
    private double dollar;
    private DollarsSubject dollarsSubject;



    public PriceCar(DollarsSubject dollarsSubject)
    {

        this.dollarsSubject = dollarsSubject;
        dollarsSubject.registerDollarObserver(this);
    }

    @Override
    public void update(double dollar) {
        this.dollar = dollar;
        displayDollarRate();
    }

    void displayDollarRate()
    {
        System.out.println("DollarRate = " + dollar);
    }
}
