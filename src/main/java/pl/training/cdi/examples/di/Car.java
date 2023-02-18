package pl.training.cdi.examples.di;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import jakarta.inject.Inject;
import lombok.ToString;
import lombok.extern.java.Log;
import pl.training.cdi.examples.di.qualifiers.Motor;

import java.util.logging.Level;
import java.util.logging.Logger;

@ToString
public class Car {

    //@Setter(onMethod = @__({@Inject}))
    private Engine engine;
    private Logger logger;

    /*@Inject
    public void setEngine(Engine engine) {
        this.engine = engine;
    }*/

    //@Inject
    public Car(/*@Motor("petrol")*/ Engine engine, Logger logger) {
        this.engine = engine;
        this.logger = logger;
    }

    public void go() {
        engine.start();
        logger.log(Level.INFO, "Driving...");
    }

    //@PostConstruct
    public void init() {
        logger.log(Level.INFO,"Initializing...");
    }

    //@PreDestroy
    public void destroy() {
        logger.log(Level.INFO,"Destroying...");
    }

}
