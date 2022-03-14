public class Car {
    private String colour;
    private String brand;
    private String regNumber;

    public Car(String colour,String factoryBrand) {
        this.colour = colour;
        this.brand = factoryBrand;
        this.regNumber = "ABC123";
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
}
