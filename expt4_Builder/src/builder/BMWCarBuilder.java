package builder;

/**
 * Created by dd on 2016/5/24.
 */
public class BMWCarBuilder implements CarBuilder {
    private Car car = new Car();

    @Override
    public void buildWheel() {
        car.setWheel("BMWWheel");
    }

    @Override
    public Car getCar() {
        return car;
    }

    @Override
    public void buildOilBox() {
        car.setOilBox("BMWOilBox");
    }

    @Override
    public void buildBody() {
        car.setBody("BMWBody");
    }
}
