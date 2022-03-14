import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


public class carfactorytest {

    CarFactory carFactory;
    String colour = "blue";
    String brand_1 = "volvo";
    String brand_2 = "BMW";
    String engine = "engine_1";

    @BeforeEach
    void setUp(){
        carFactory = new CarFactory(brand_1,engine);
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
        carFactory = new CarFactory(brand_2,engine);

        Car car = carFactory.create(colour);

        Assertions.assertEquals(brand_2,car.getCarBrand());
    }

    @Test
    void created_car_hasEngine_test(){
        Car car = carFactory.create(colour);

        Assertions.assertEquals(carFactory.getEngine(),car.getEngine());
    }

    @Test
    void regNumber_generation_test(){
        Car car_1 = carFactory.create(colour);
        Car car_2 = carFactory.create(colour);
        System.out.println(car_1.getRegNumber());
        System.out.println(car_2.getRegNumber());
        Assertions.assertNotEquals(car_1.getRegNumber(),car_2.getRegNumber());
    }
}
