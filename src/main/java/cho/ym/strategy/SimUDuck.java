package cho.ym.strategy;

import cho.ym.strategy.fly.FlyWithWings;
import cho.ym.strategy.quak.Quack;

public class SimUDuck extends StrategyDuck {

    public SimUDuck() {
        super(new FlyWithWings(), new Quack());
    }

    public void display() {
        System.out.println("I'm a real duck!!");
    }
}
