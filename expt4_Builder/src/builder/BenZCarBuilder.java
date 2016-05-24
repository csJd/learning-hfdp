package builder;

/**
 * Created by dd on 2016/5/24.
 */
public class BenZCarBuilder implements CarBuilder {
    private Car car = new Car();

    @Override
    public void buildWheel() {
        car.setWheel("BenZWheel");
    }

    @Override
    public void buildOilBox() {
        car.setOilBox("BenZOixBox");
    }

    @Override
    public Car getCar() {
        return car;
    }

    @Override
    public void buildBody() {
        car.setBody("BenZBody");
    }
}
