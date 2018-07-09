package com.zhx.observer;

public abstract class Observer {
    private String name;
    public Observer(String name){
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public abstract void update(float degree, float humidity, float windPower);
}
