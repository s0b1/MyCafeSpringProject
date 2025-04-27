package brainacad_org.CafeSpringProject.controller;

import brainacad_org.CafeSpringProject.entity.Drink;
import brainacad_org.CafeSpringProject.service.DrinkService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/drinks")
public class DrinkController
{
    private final DrinkService drinkService;

    public DrinkController(DrinkService drinkService)
    {
        this.drinkService = drinkService;
    }

    @PostMapping
    public Drink addDrink(@RequestBody Drink drink)
    {
        return drinkService.addDrink(drink);
    }

    @GetMapping
    public List<Drink> getAllDrinks()
    {
        return drinkService.getAllDrinks();
    }
}