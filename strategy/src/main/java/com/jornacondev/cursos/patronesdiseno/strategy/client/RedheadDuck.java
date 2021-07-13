package com.jornacondev.cursos.patronesdiseno.strategy.client;

import com.jornacondev.cursos.patronesdiseno.strategy.behaviour.fly.Fly;
import com.jornacondev.cursos.patronesdiseno.strategy.behaviour.quack.Quack;

public class RedheadDuck extends Duck {
    public RedheadDuck() {
        super(new Fly(), new Quack());
    }

    @Override
    public void display() {
        System.out.println("Looks like Redhead Duck");
    }
}
