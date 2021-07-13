package com.jornacondev.cursos.patronesdiseno.strategy.client;

import com.jornacondev.cursos.patronesdiseno.strategy.behaviour.fly.FlyNoWay;
import com.jornacondev.cursos.patronesdiseno.strategy.behaviour.quack.Squeak;

public class RubberDuck extends Duck {
    public RubberDuck() {
        super(new FlyNoWay(), new Squeak());
    }

    @Override
    public void display() {
        System.out.println("Looks like Rubber Duck");
    }
}
