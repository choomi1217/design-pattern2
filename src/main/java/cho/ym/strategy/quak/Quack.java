package cho.ym.strategy.quak;

public class Quack implements SpeakBehavior {

    @Override
    public void speak() {
        System.out.println("quack!!quack!!");
    }
}
