/**
 * Created by dd on 2016/5/25.
 */
public class AlarmSystem {
    Alarm alarm = new Alarm();
    Camera camera = new Camera();
    Light light = new Light();
    Sensor sensor = new Sensor();

    public void on(){
        alarm.on();
        camera.on();
        light.on();
        sensor.on();
    }

    public void off(){
        alarm.off();
        camera.off();
        light.off();
        sensor.off();
    }
}
