package lab7.lab7.controller;

import org.springframework.web.bind.annotation.*;
import java.util.List;
import lab7.lab7.repository.flower.Flower;
import lab7.lab7.repository.flower.FlowerColor;
import lab7.lab7.repository.flower.FlowerType;

@RestController
@RequestMapping("/api/flowers")
public class FlowerController {

    @GetMapping
    public List<Flower> getAll() {
        return List.of(
                new Flower(12, FlowerColor.RED, 100,   FlowerType.ROSE),
                new Flower(10,  FlowerColor.YELLOW, 80,FlowerType.TULIP)
        );
    }
}
