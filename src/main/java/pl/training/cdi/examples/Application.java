package pl.training.cdi.examples;

import jakarta.enterprise.util.AnnotationLiteral;
import lombok.extern.java.Log;
import org.jboss.weld.environment.se.Weld;
import pl.training.cdi.examples.di.Car;
import pl.training.cdi.examples.di.qualifiers.Petrol;
import pl.training.cdi.examples.events.Message;
import pl.training.cdi.examples.events.MessageProducer;

@Log
public class Application {

    public static void main(String[] args) {
        /*var engine = new DieselEngine();
        var car = new Car(engine);*/
        var weld = new Weld();
        try (var container = weld.initialize()) {
            var car = container.select(Car.class/*, new AnnotationLiteral<Petrol>(){}*/).get();
            car.go();
            var messageProducer = container.select(MessageProducer.class).get();
            var message = new Message();
            message.setText("Hello CDI");
            messageProducer.send(message);
        }
    }

}
