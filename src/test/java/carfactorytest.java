import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


public class carfactorytest {

    CarFactory carFactory;
    String colour = "blue";
    String brand_1 = "volvo";
    String brand_2 = "BMW";

    @BeforeEach
    void setUp(){
        carFactory = new CarFactory(brand_1);
    }

    @Test
    void create_car_test(){
        Car car = carFactory.create(colour);

        Assertions.assertNotNull(car);
        Assertions.assertEquals(colour,car.getColour());
        Assertions.assertNotNull(car.getCarBrand());
        Assertions.assertNotNull(car.getRegNumber());
    }

    @Test
    void create_factory_with_brand_test(){
        carFactory = new CarFactory(brand_2);

        Car car = carFactory.create(colour);

        Assertions.assertEquals(brand_2,car.getCarBrand());
    }
}
