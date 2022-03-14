public class CarFactory {
    private String factoryBrand;
    private String engine;
    public CarFactory(String brand,String engine) {
        this.factoryBrand = brand;
        this.engine = engine;
    }

    public Car create(String colour) {
        return new Car(colour,factoryBrand,engine);
    }

    public String getEngine() {
        return this.engine;
    }
}
