package com.zhx;

import com.zhx.tools.AxeBehavior;
import com.zhx.user.King;

public class Main {
    public static void main(String[] args) {
        King user1 = new King();
        user1.fight();
        user1.setWeapon(new AxeBehavior());
        System.out.println("I got a weapon Axe!");
        user1.fight();
    }
}
