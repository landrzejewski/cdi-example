package pl.training.cdi.calculator.view;

import jakarta.inject.Inject;
import lombok.RequiredArgsConstructor;
import pl.training.cdi.calculator.commons.View;
import pl.training.cdi.calculator.controller.CalculatorController;

import java.util.Map;
import java.util.Scanner;

@RequiredArgsConstructor(onConstructor_ = @Inject)
public class MenuView implements View {

    private final Scanner scanner;
    private final CalculatorController controller;

    @Override
    public void render(Map<String, String> data) {
        System.out.println("Menu");
        System.out.println("1 - Dodaj");
        System.out.println("2 - Odejmij");
        System.out.println("3 - Wyjdź");
        var option = scanner.next();
        controller.optionSelected(option);
    }

}
