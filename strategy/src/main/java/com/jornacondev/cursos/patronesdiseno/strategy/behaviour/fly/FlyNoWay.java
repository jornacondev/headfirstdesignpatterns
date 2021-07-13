package com.jornacondev.cursos.patronesdiseno.strategy.behaviour.fly;

public class FlyNoWay implements FlyBehaviour {
    @Override
    public String fly() {
        return "Can't fly";
    }
}
