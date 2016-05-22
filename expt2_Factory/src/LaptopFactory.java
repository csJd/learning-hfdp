/**
 * Created by dd on 2016/5/22.
 */
public class LaptopFactory {
    Laptop laptop = null;
    public Laptop createLaptop(String oem){
        if(oem.equals("Dell")) laptop = new DellLaptop();
        else if(oem.equals("Lenovo")) laptop = new LenovoLaptop();
        else if(oem.equals("Acer")) laptop = new AcerLaptop();
        return laptop;
    }
}
