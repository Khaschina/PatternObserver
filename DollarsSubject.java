package com.Ekhashchina.PatternObserver;

/**
 * Created by 222 on 07.03.2016.
 */
public interface DollarsSubject {
    void registerDollarObserver(DollarObserver dollarObserver);
    void removeDollarObserver(DollarObserver dollarObserver);
    void notifyPbserver();
}
