public class Test {

    public static void main(String[] args) {
        LaptopFactory factory = new LaptopFactory();
        Laptop laptop1 = factory.createLaptop("Dell");
        Laptop laptop2 = factory.createLaptop("Lenovo");
        Laptop laptop3 = factory.createLaptop("Acer");
        laptop1.showBrands();
        laptop2.showBrands();
        laptop3.showBrands();
    }
}
