package pl.training.cdi.examples.di;

import jakarta.inject.Inject;
import lombok.Data;
import lombok.Setter;
import lombok.ToString;
import lombok.extern.java.Log;
import pl.training.cdi.examples.di.qualifiers.Id;
import pl.training.cdi.examples.di.qualifiers.Motor;

@Log
@Motor(value = "petrol", description = "Super efficient")
//@Petrol
@ToString
public class PetrolEngine implements Engine {

    @Id
    @Inject
    @Setter
    private String id;

    @Override
    public void start() {
        log.info("Petrol engine started");
    }

}
