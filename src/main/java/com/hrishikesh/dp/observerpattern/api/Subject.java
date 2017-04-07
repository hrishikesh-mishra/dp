package com.hrishikesh.dp.observerpattern.api;

/**
 * <p>
 *     Subject
 * </p>
 * Created by hrishikesh.mishra
 */
public interface Subject {

    void registerObserver(Observer o);

    void removeObserver(Observer o);

    void notifyObservers();
}
