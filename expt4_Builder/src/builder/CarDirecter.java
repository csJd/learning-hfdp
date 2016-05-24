package builder;

/**
 * Created by dd on 2016/5/24.
 */
public class CarDirecter {
    private CarBuilder builder = null;

    public CarDirecter(String type) {
        if (type.equals("BMW")) {
            builder = new BMWCarBuilder();
        } else builder = new BenZCarBuilder();
    }

    public Car constractCar() {
        builder.buildBody();
        builder.buildOilBox();
        builder.buildWheel();
        return builder.getCar();
    }
}
