public class CarFactory {
    private String factoryBrand = "volvo";
    public Car create(String colour) {
        return new Car(colour,factoryBrand);
    }
}
