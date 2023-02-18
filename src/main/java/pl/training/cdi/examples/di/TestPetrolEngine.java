package pl.training.cdi.examples.di;

import jakarta.enterprise.inject.Alternative;
import jakarta.inject.Inject;
import lombok.Setter;
import lombok.ToString;
import lombok.extern.java.Log;
import pl.training.cdi.examples.di.qualifiers.Id;
import pl.training.cdi.examples.di.qualifiers.Motor;

@Log
@Alternative
@Motor(value = "petrol", description = "Super efficient")
//@Petrol
@ToString
public class TestPetrolEngine implements Engine {

    @Id
    @Inject
    @Setter
    private String id;

    @Override
    public void start() {
        log.info("Test petrol engine started");
    }

}
