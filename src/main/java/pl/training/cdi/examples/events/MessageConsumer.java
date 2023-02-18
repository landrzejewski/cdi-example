package pl.training.cdi.examples.events;

import jakarta.enterprise.event.Observes;
import jakarta.enterprise.inject.Default;
import lombok.extern.java.Log;

@Log
public class MessageConsumer {

    public void onMessage(@Observes @Default Message message) {
        log.info("New message: " + message);
    }

}
