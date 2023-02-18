package pl.training.cdi.calculator.view;

import pl.training.cdi.calculator.commons.View;

import java.util.Map;

public class ExitView implements View {

    @Override
    public void render(Map<String, String> data) {
        System.out.println("Do zobaczenia");
    }

}
