package com.zhx.subject;

import com.zhx.observer.Observer;

import java.util.ArrayList;
import java.util.List;

public abstract class Subject {

    public List<Observer> observers ;
    public Subject(){
        observers = new ArrayList<>();
    }
    /**
     * 注册观察者
     */
    public void registerObserver(Observer observer){
        System.out.println("注册观察者："+observer.getName());
        observers.add(observer);
    }

    /**
     * 移除观察者
     */
    public void removeObserver(Observer observer){
        observers.remove(observer);
        System.out.println("移除观察者："+observer.getName());
    }

    /**
     * 通知观察者
     */
    abstract void notifyObserver();
}
