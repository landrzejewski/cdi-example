package pl.training.cdi.calculator.controller;

import jakarta.inject.Inject;
import lombok.RequiredArgsConstructor;
import pl.training.cdi.calculator.commons.Controller;
import pl.training.cdi.calculator.commons.ModelAndView;
import pl.training.cdi.calculator.model.Calculator;

import java.math.BigDecimal;
import java.util.Map;

@Controller
@RequiredArgsConstructor(onConstructor_ = @Inject)
public class CalculatorController {

    private final Calculator calculator;

    public ModelAndView optionSelected(String option) {
        return switch (option) {
            case "1" -> new ModelAndView("AddValues");
            case "2" -> new ModelAndView("SubtractValues");
            case "3" -> new ModelAndView("Exit");
            default -> throw new IllegalArgumentException();
        };
    }

    public ModelAndView showMenu() {
        return new ModelAndView("Menu");
    }

    public ModelAndView addValues(BigDecimal firstNumber, BigDecimal secondNumber) {
        var result = calculator.add(firstNumber, secondNumber).toString();
        return new ModelAndView("Results", Map.of("result", result));
    }

    public ModelAndView subtractValues(BigDecimal firstNumber, BigDecimal secondNumber) {
        var result = calculator.subtract(firstNumber, secondNumber).toString();
        return new ModelAndView("Results", Map.of("result", result));
    }

}
