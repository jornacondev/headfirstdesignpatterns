package com.jornacondev.cursos.patronesdiseno.strategy.behaviour.quack;

public class MuteQuack implements QuackBehaviour {
    @Override
    public String quack() {
        return "Silence";
    }
}
