package cho.ym.strategy.quak;

public class Mute implements SpeakBehavior {

    @Override
    public void speak() {
        System.out.println("<<silence>>");
    }
}
