package com.zhx.observer;

/**
 * 简单天气布告板
 */
public class EasyWeatherBoard extends Observer {
    private float degree;
    private float humidity;
    private float windPower;

    public EasyWeatherBoard(){
        super("简易天气预报板");
    }
    @Override
    public void update(float degree,float humidity,float windPower) {
        this.degree = degree;
        this.humidity = humidity;
        this.windPower = windPower;
        showWeather();
    }
    public void showWeather(){
        if(degree >= 20 && degree <= 30){
            System.out.println("Today is nice! degree is "+degree+",humidity is "+humidity+",windPower is "+windPower);
        }else if(degree<20){
            System.out.println("Today is cold! Stay home,don't go out!");
        }else if(degree>30){
            System.out.println("Wow! It is hot today,eat an ice cream can feel better!");
        }
    }
}
