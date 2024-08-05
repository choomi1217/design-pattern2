package cho.ym.strategy.fly;

public class FlyWithRocket implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("I'm flying with a rocket!!");
    }
}
