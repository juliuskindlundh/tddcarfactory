public class Car {
    private String engine;
    private String colour;
    private String brand;
    private String regNumber;

    public Car(String colour,String factoryBrand,String engine,String regNumber) {
        this.colour = colour;
        this.brand = factoryBrand;
        this.regNumber = regNumber;
        this.engine = engine;
    }

    public String getColour() {
        return this.colour;
    }

    public String getCarBrand() {
        return this.brand;
    }

    public String getRegNumber() {
        return this.regNumber;
    }

    public String getEngine() {
        return this.engine;
    }
}
