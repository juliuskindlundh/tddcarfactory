public class Car {
    private String colour;
    private String brand;

    public Car(String colour,String factoryBrand) {
        this.colour = colour;
        this.brand = factoryBrand;
    }

    public String getColour() {
        return this.colour;
    }

    public String getCarBrand() {
        return this.brand;
    }
}
