package com.jornacondev.cursos.patronesdiseno.strategy.client;

import com.jornacondev.cursos.patronesdiseno.strategy.behaviour.fly.FlyBehaviour;
import com.jornacondev.cursos.patronesdiseno.strategy.behaviour.quack.QuackBehaviour;

public abstract class Duck {
    private final FlyBehaviour flyBehaviour;
    private final QuackBehaviour quackBehaviour;

    public Duck(FlyBehaviour flyBehaviour, QuackBehaviour quackBehaviour) {
        this.flyBehaviour = flyBehaviour;
        this.quackBehaviour = quackBehaviour;
    }

    public void swim() {
        System.out.println("Swim");
    }

    public void performQuack() {
        System.out.println(quackBehaviour.quack());
    }

    public void performFly() {
        System.out.println(flyBehaviour.fly());
    }

    public abstract void display();
}
