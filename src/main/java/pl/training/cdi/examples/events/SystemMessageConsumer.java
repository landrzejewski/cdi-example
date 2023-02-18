package pl.training.cdi.examples.events;

import jakarta.enterprise.event.Observes;
import lombok.extern.java.Log;
import pl.training.cdi.examples.di.qualifiers.SystemMessage;

@Log
public class SystemMessageConsumer {

    public void onMessage(@Observes @SystemMessage Message message) {
        log.info("New system message: " + message);
    }

}
