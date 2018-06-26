package com.zhx.user;

import com.zhx.tools.BowAndArrowBehavior;

public class Queen extends Character{

    public Queen(){
        super(new BowAndArrowBehavior());
        System.out.println("I am a Queen!");
        System.out.println("I born with a BowAndArrow!");
    }

}
