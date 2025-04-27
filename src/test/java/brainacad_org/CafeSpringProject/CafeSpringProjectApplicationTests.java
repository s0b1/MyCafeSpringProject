package brainacad_org.CafeSpringProject;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import brainacad_org.CafeSpringProject.entity.Drink;
import brainacad_org.CafeSpringProject.service.DrinkService;
import brainacad_org.CafeSpringProject.repository.DrinkRepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
public class CafeSpringProjectApplicationTests {

	@Autowired
	private DrinkService drinkService;

	@Autowired
	private DrinkRepository drinkRepository;

	@BeforeEach
	void setUp()
	{
		drinkRepository.deleteAll();
	}

	@Test
	void testAddDrink()
	{

		Drink drink = new Drink();
		drink.setNameEn("Latte");
		drink.setNameOtherLang("Латте");
		drink.setPrice(5.99);

		Drink savedDrink = drinkService.addDrink(drink);

		assertNotNull(savedDrink.getId());
		assertEquals("Latte", savedDrink.getNameEn());
		assertEquals("Латте", savedDrink.getNameOtherLang());
		assertEquals(5.99, savedDrink.getPrice());
	}

	@Test
	void testGetAllDrinks()
	{

		Drink drink1 = new Drink();
		drink1.setNameEn("Espresso");
		drink1.setNameOtherLang("Эспрессо");
		drink1.setPrice(4.50);
		drinkService.addDrink(drink1);

		Drink drink2 = new Drink();
		drink2.setNameEn("Cappuccino");
		drink2.setNameOtherLang("Капучино");
		drink2.setPrice(6.00);
		drinkService.addDrink(drink2);

		List<Drink> drinks = drinkService.getAllDrinks();

		assertNotNull(drinks);
		assertEquals(2, drinks.size());
	}

	@Test
	void testUpdateDrinkPrice()
	{

		Drink drink = new Drink();
		drink.setNameEn("Americano");
		drink.setNameOtherLang("Американо");
		drink.setPrice(4.80);
		Drink savedDrink = drinkService.addDrink(drink);

		savedDrink.setPrice(5.50);
		drinkService.addDrink(savedDrink);

		Drink updatedDrink = drinkRepository.findById(savedDrink.getId()).orElseThrow();
		assertEquals(5.50, updatedDrink.getPrice());
	}
}