import java.util.Random;

public class CarFactory {
    private String factoryBrand;
    private String engine;
    private Random rng;
    public CarFactory(String brand,String engine) {
        this.factoryBrand = brand;
        this.engine = engine;
        this.rng = new Random();
    }

    public Car create(String colour) {
        return new Car(colour,factoryBrand,engine,generateRegNumber());
    }

    private String generateRegNumber() {
        String regNumber = "";
        while (regNumber.length() < 3){
            regNumber += (char) (rng.nextInt(24) + 65);
        }
        while (regNumber.length() < 6){
            regNumber += (char) (rng.nextInt(10) + 48);
        }
        return regNumber;
    }

    public String getEngine() {
        return this.engine;
    }
}
