package de.htwberlin.webtech.PlanYourDay.web;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class ControllerPlanYourDay {

    @GetMapping(path = "/hello")
    public ModelAndView showPlanYourDayPage(Model model) {
        return new ModelAndView("PlanYourDay");
    }

}
