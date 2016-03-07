package com.Ekhashchina.PatternObserver;

import java.util.ArrayList;

/**
 * Created by 222 on 07.03.2016.
 */
public class DollarRate implements DollarsSubject{

    private ArrayList<DollarObserver> dollarObservers;
    private double dollar;

    public DollarRate()
    {
        dollarObservers = new ArrayList<>();
    }


    @Override
    public void registerDollarObserver(DollarObserver observer) {
        dollarObservers.add(observer);
    }

    @Override
    public void removeDollarObserver(DollarObserver observer) {
        int i = dollarObservers.indexOf(observer);
        if(i>=0)
        {
            dollarObservers.remove(observer);
        }
    }

    @Override
    public void notifyPbserver() {
        for(int i = 0; i < dollarObservers.size();i++ )
        {
            DollarObserver notifyDollarObservers = dollarObservers.get(i);
            notifyDollarObservers.update(dollar);
        }
    }

   public void setChangeDollarRate(double dollar)
   {
       this.dollar = dollar;
       notifyPbserver();
   }
}
