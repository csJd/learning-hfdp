/**
 * Created by dd on 2016/5/25.
 */
public class GreenApple extends GoatDecorator{
    public GreenApple(Goat goat) {
        super(goat);
    }

    @Override
    public void run() {
        goat.run();
        System.out.println("  with a green apple");
    }
}
