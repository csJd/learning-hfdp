package builder;

/**
 * Created by dd on 2016/5/24.
 */
public class Car {
    private String wheel, oilBox, body;

    public String getWheel() {
        return wheel;
    }

    public void setWheel(String wheel) {
        this.wheel = wheel;
    }

    public String getOilBox() {
        return oilBox;
    }

    public void setOilBox(String oilBox) {
        this.oilBox = oilBox;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public void show() {
        System.out.println("A car with " + wheel + ", " + oilBox + ", " + body);
    }
}
