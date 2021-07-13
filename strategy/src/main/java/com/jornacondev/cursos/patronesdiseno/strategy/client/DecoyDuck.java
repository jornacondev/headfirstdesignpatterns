package com.jornacondev.cursos.patronesdiseno.strategy.client;

import com.jornacondev.cursos.patronesdiseno.strategy.behaviour.fly.FlyNoWay;
import com.jornacondev.cursos.patronesdiseno.strategy.behaviour.quack.MuteQuack;

public class DecoyDuck extends Duck {
    public DecoyDuck() {
        super(new FlyNoWay(), new MuteQuack());
    }

    @Override
    public void display() {
        System.out.println("Looks like Decoy Duck");
    }
}
