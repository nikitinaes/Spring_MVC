package web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import web.dao.CarDAO;
import web.models.Car;

import java.util.List;

@Controller
@RequestMapping("/cars")
public class CarController {
    private final CarDAO carDAO;
    @Autowired
    public CarController(CarDAO carDAO) {
        this.carDAO = carDAO;
    }

    @GetMapping()
    public String index (Model model) {
        model.addAttribute("cars", carDAO.index());
        return "cars";
    }
    @GetMapping("/{count}")
    public String show(@PathVariable("count") int count, Model model) {
        model.addAttribute("cars", carDAO.showCarNumber(count));
        return "cars";
    }
}
