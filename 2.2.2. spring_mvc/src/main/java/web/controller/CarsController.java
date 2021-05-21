package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.model.Cars;
import web.service.CarsService;

import java.util.List;

@Controller
@RequestMapping("/cars")
public class CarsController {

    @GetMapping
    public String allCars(Model model) {
        CarsService carsService = new CarsService();
        List<Cars> cars = carsService.getCars(5);
        model.addAttribute("car", cars);
        return "cars";
    }

    @GetMapping(params = "count")
    public String printCars(@RequestParam("count") int count, Model model) {
        CarsService carsService = new CarsService();
        List<Cars> cars = carsService.getCars(count);
        model.addAttribute("car", cars);

        return "cars";
    }
}
