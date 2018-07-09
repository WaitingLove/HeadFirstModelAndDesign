package com.zhx.subject;

import com.zhx.observer.Observer;

public class WeatherSubject extends Subject {

    private float degree;
    private float humidity;
    private float windPower;
    public WeatherSubject(float degree,float humidity,float windPower){
        this.degree = degree;
        this.humidity = humidity;
        this.windPower = windPower;
    }
    public void setWeatherDatas(float degree,float humidity,float windPower){
        this.degree = degree;
        this.humidity = humidity;
        this.windPower = windPower;
        notifyObserver();
    }
    @Override
    public void notifyObserver() {
        for(Observer observer:observers){
            observer.update(degree,humidity,windPower);
        }
    }
}
