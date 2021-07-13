package com.jornacondev.cursos.patronesdiseno.strategy;

import com.jornacondev.cursos.patronesdiseno.strategy.client.DecoyDuck;
import com.jornacondev.cursos.patronesdiseno.strategy.client.Duck;
import com.jornacondev.cursos.patronesdiseno.strategy.client.MallardDuck;
import com.jornacondev.cursos.patronesdiseno.strategy.client.RedheadDuck;
import com.jornacondev.cursos.patronesdiseno.strategy.client.RubberDuck;

/**
 * The Strategy Pattern defines a family of algorithms,
 * encapsulates each one, and makes them interchangeable.
 * Strategy lets the algorithm vary independently from
 * clients that use it.
 */
public class Main {
    public static void main(String[] args) {
        Duck mallardDuck = new MallardDuck();
        Duck redheadDuck = new RedheadDuck();
        Duck rubberDuck = new RubberDuck();
        Duck decoyDuck = new DecoyDuck();

        /*
         * Mallard Duck
         */
        mallardDuck.display();
        mallardDuck.swim();
        mallardDuck.performFly();
        mallardDuck.performQuack();

        /*
         * Redhead Duck
         */
        redheadDuck.display();
        redheadDuck.swim();
        redheadDuck.performFly();
        redheadDuck.performQuack();

        /*
         * Rubber Duck
         */
        rubberDuck.display();
        rubberDuck.swim();
        rubberDuck.performFly();
        rubberDuck.performQuack();

        /*
         * Decoy Duck
         */
        decoyDuck.display();
        decoyDuck.swim();
        decoyDuck.performFly();
        decoyDuck.performQuack();
    }
}
