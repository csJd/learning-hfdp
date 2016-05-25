/**
 * Created by dd on 2016/5/25.
 */
public abstract class GoatDecorator extends Goat{
    Goat goat;

    public GoatDecorator(Goat goat) {
        this.goat = goat;
    }

    public abstract void run();
}
