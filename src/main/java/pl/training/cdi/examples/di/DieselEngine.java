package pl.training.cdi.examples.di;

import jakarta.inject.Inject;
import lombok.Data;
import lombok.Setter;
import lombok.ToString;
import lombok.extern.java.Log;
import pl.training.cdi.examples.di.qualifiers.Id;
import pl.training.cdi.examples.di.qualifiers.Motor;

@Log
@Motor("diesel")
//@Diesel
@ToString
public class DieselEngine implements Engine {

    @Id
    @Inject
    @Setter
    private String id;

    @Override
    public void start() {
        log.info("Kleklekele diesel engine started");
    }

}
