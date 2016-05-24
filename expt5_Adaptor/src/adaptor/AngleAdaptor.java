package adaptor;

/**
 * Created by dd on 2016/5/18.
 */
public class AngleAdaptor extends Shape {
    Angle angle = new Angle();

    @Override
    public void draw() {
        angle.drawAngle();
    }
}
