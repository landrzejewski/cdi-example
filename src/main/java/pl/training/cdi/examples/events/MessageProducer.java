package pl.training.cdi.examples.events;

import jakarta.enterprise.event.Event;
import jakarta.inject.Inject;
import pl.training.cdi.examples.di.qualifiers.SystemMessage;

public class MessageProducer {

    private Event<Message> eventEmitter;

    @Inject
    public MessageProducer(@SystemMessage Event<Message> eventEmitter) {
        this.eventEmitter = eventEmitter;
    }

    public void send(Message message) {
        eventEmitter.fire(message);
    }

}
