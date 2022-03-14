import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


public class carfactorytest {

    CarFactory carFactory;
    String colour = "blue";

    @BeforeEach
    void setUp(){
        carFactory = new CarFactory();
    }

    @Test
    void create_car_test(){
        Car car = carFactory.create(colour);

        Assertions.assertNotNull(car);
        Assertions.assertEquals(colour,car.getColour());
        Assertions.assertNotNull(car.getCarBrand());
        Assertions.assertNotNull(car.getRegNumber());
    }
}
