package brainacad_org.CafeSpringProject.service;

import brainacad_org.CafeSpringProject.entity.Drink;
import brainacad_org.CafeSpringProject.repository.DrinkRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DrinkService
{
    private final DrinkRepository drinkRepository;

    public DrinkService(DrinkRepository drinkRepository)
    {
        this.drinkRepository = drinkRepository;
    }

    public Drink addDrink(Drink drink)
    {
        return drinkRepository.save(drink);
    }

    public List<Drink> getAllDrinks()
    {
        return drinkRepository.findAll();
    }
}