package com.zhx.user;

import com.zhx.tools.WeaponBehavior;

public abstract class Character {
    private WeaponBehavior wb;
    public void fight(){
        wb.useWeapon();
    };
    public Character(WeaponBehavior wb){
        this.wb = wb;
    }
    public void setWeapon(WeaponBehavior wb){
        this.wb = wb;
    }
}
