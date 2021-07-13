package com.jornacondev.cursos.patronesdiseno.decorator;

public class Decaf extends Beverage {
    public Decaf() {
        setDescription("Dark Roast Coffee");
    }

    @Override
    public double cost() {
        return .80;
    }
}
