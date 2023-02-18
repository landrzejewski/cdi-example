package pl.training.cdi.calculator.view;

import jakarta.inject.Inject;
import lombok.RequiredArgsConstructor;
import pl.training.cdi.calculator.commons.View;
import pl.training.cdi.calculator.controller.CalculatorController;

import java.util.Map;

@RequiredArgsConstructor(onConstructor_ = @Inject)
public class ResultsView implements View {

    private final CalculatorController controller;

    @Override
    public void render(Map<String, String> data) {
        System.out.println("Wynik: %s".formatted(data.get("result")));
        controller.showMenu();
    }

}
