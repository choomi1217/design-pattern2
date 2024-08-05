package cho.ym.strategy;

import cho.ym.strategy.fly.FlyBehavior;
import cho.ym.strategy.quak.SpeakBehavior;

public abstract class StrategyDuck {
    private FlyBehavior flyBehavior;
    private SpeakBehavior speakBehavior;

    public StrategyDuck(FlyBehavior flyBehavior, SpeakBehavior speakBehavior) {
        this.flyBehavior = flyBehavior;
        this.speakBehavior = speakBehavior;
    }

    public void fly() {
        flyBehavior.fly();
    }

    public void speak() {
        speakBehavior.speak();
    }
}
