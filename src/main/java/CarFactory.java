public class CarFactory {
    private String factoryBrand;

    public CarFactory(String brand) {
        this.factoryBrand = brand;
    }

    public Car create(String colour) {
        return new Car(colour,factoryBrand);
    }
}
