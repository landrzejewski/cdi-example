package pl.training.cdi.examples.di;

import jakarta.enterprise.inject.Alternative;
import jakarta.enterprise.inject.Any;
import jakarta.enterprise.util.AnnotationLiteral;
import lombok.extern.java.Log;
import org.jboss.weld.environment.se.Weld;
import pl.training.cdi.examples.di.qualifiers.Petrol;

@Log
public class Application {

    public static void main(String[] args) {
        /*var engine = new DieselEngine();
        var car = new Car(engine);*/
        var weld = new Weld();
        try (var container = weld.initialize()) {
            var car = container.select(Car.class, new AnnotationLiteral<Petrol>(){}).get();
            car.go();
            log.info(car.toString());
        }
    }

}
