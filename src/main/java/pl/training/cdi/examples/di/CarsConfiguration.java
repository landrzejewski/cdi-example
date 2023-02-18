package pl.training.cdi.examples.di;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.enterprise.inject.Any;
import jakarta.enterprise.inject.Disposes;
import jakarta.enterprise.inject.Produces;
import jakarta.enterprise.inject.spi.InjectionPoint;
import pl.training.cdi.examples.di.qualifiers.Diesel;
import pl.training.cdi.examples.di.qualifiers.Id;
import pl.training.cdi.examples.di.qualifiers.Motor;
import pl.training.cdi.examples.di.qualifiers.Petrol;

import java.util.UUID;
import java.util.logging.Logger;

@ApplicationScoped
public class CarsConfiguration {

    @Diesel
    @Produces
    public Car dieselCar(@Motor("diesel") DieselEngine engine, Logger logger) {
        var car = new Car(engine, logger);
        car.init();
        return car;
    }

    @Petrol
    @Produces
    public Car petrolCar(@Motor("petrol") Engine engine, Logger logger) {
        var car = new Car(engine, logger);
        car.init();
        return car;
    }

    public void destroyCar(@Any @Disposes Car car) {
        car.destroy();
    }

    @Id
    @Produces
    public String uuid() {
        return UUID.randomUUID().toString();
    }

    @Produces
    public Logger logger(InjectionPoint injectionPoint) {
        var className = injectionPoint.getMember().getDeclaringClass().getName();
        return Logger.getLogger(className);
    }

}
