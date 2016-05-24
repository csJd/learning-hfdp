package builder;

/**
 * Created by dd on 2016/5/24.
 */
public interface CarBuilder {
    public void buildWheel();

    public void buildOilBox();

    public void buildBody();

    public Car getCar();
}
