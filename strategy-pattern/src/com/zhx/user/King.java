package com.zhx.user;

import com.zhx.tools.SwordBehavior;

public class King extends Character {
    public King(){
        super(new SwordBehavior());
        System.out.println("I am King!");
        System.out.println("I born with a Sword!");
    }

}
