package web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.model.Cars;
import web.service.CarsService;

import java.util.List;

@Controller
public class CarsController {

    @Autowired
    private CarsService carsService;

    @GetMapping(value = "/cars")
    public String printCars(@RequestParam(defaultValue = "5") int count, Model model) {
        List<Cars> cars = carsService.getCars(count);
        model.addAttribute("car", cars);

        return "cars";
    }
}
