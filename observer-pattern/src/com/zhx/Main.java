package com.zhx;

import com.zhx.observer.EasyWeatherBoard;
import com.zhx.subject.WeatherSubject;

public class Main {
    public static void main(String[] args) {
        WeatherSubject weatherSubject = new WeatherSubject(28,15,4);
        EasyWeatherBoard ewb = new EasyWeatherBoard();
        weatherSubject.registerObserver(ewb);

        weatherSubject.setWeatherDatas(35,15,9);
    }
}
