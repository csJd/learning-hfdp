/**
 * Created by dd on 2016/5/25.
 */
public class YellowApple extends GoatDecorator{
    public YellowApple(Goat goat) {
        super(goat);
    }

    @Override
    public void run() {
        goat.run();
        System.out.println("  with a yellow apple");
    }
}
