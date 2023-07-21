package web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import web.service.CarService;

@Controller
@RequestMapping("/cars")
public class CarController {
    private CarService carService;
    @Autowired
    public CarController(CarService carService) {
        this.carService = carService;
    }

    @GetMapping()
    public String getAllCars(Model model) {
        model.addAttribute("cars", carService.showAllCars());
        return "cars";
    }
    @GetMapping("/{count}")
    public String showCars(@PathVariable("count") int count, Model model) {
        model.addAttribute("cars", carService.showCarNumber(count));
        return "cars";
    }
}
