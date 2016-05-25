/**
 * Created by dd on 2016/5/25.
 */
public class RedApple extends GoatDecorator{
    public RedApple(Goat goat) {
        super(goat);
    }

    @Override
    public void run() {
        goat.run();

        System.out.println("  with a red apple");
    }
}
