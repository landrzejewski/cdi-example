package pl.training.cdi.examples.decorators;

import jakarta.decorator.Decorator;
import jakarta.decorator.Delegate;
import jakarta.inject.Inject;
import lombok.Setter;
import lombok.extern.java.Log;
import pl.training.cdi.examples.di.Car;
import pl.training.cdi.examples.di.Vehicle;

@Decorator
@Log
public abstract class SmartCar implements Vehicle {

    @Delegate
    @Inject
    @Setter
    private Car car;

    @Override
    public void go() {
        log.info("Turn on lights");
        car.go();
    }

    public void stop() {
        log.info("Stopping...");
    }

}
