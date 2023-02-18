package pl.training.cdi.calculator.commons;

import lombok.Getter;

import java.util.Map;

@Getter
public class ModelAndView {

    private final String viewName;
    private final Map<String, String> data;

    public ModelAndView(String viewName, Map<String, String> data) {
        this.viewName = viewName;
        this.data = data;
    }

    public ModelAndView(String viewName) {
        this(viewName, Map.of());
    }

}
