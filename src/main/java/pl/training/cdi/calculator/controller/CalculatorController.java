package pl.training.cdi.calculator.controller;

import jakarta.inject.Inject;
import lombok.RequiredArgsConstructor;
import pl.training.cdi.calculator.commons.Controller;
import pl.training.cdi.calculator.commons.ModelAndView;
import pl.training.cdi.calculator.model.Calculator;

@Controller
@RequiredArgsConstructor(onConstructor_ = @Inject)
public class CalculatorController {

    private final Calculator calculator;

    public ModelAndView optionSelected(String option) {
        return new ModelAndView("");
    }

    public ModelAndView showMenu() {
        return new ModelAndView("Menu");
    }

}
