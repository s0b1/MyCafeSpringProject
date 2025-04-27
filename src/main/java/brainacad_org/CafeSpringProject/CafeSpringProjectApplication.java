package brainacad_org.CafeSpringProject;

import brainacad_org.CafeSpringProject.entity.Drink;
import brainacad_org.CafeSpringProject.entity.Staff;
import brainacad_org.CafeSpringProject.entity.Client;
import brainacad_org.CafeSpringProject.service.DrinkService;
import brainacad_org.CafeSpringProject.service.StaffService;
import brainacad_org.CafeSpringProject.service.ClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import java.time.LocalDate;

@SpringBootApplication
public class CafeSpringProjectApplication
{
	public static void main(String[] args)
	{
		ApplicationContext context = SpringApplication.run(CafeSpringProjectApplication.class, args);

		DrinkService drinkService = context.getBean(DrinkService.class);
		ClientService clientService = context.getBean(ClientService.class);
		StaffService staffService = context.getBean(StaffService.class);

		Drink drink = new Drink();
		drink.setNameEn("Mocha");
		drink.setNameOtherLang("Мокка");
		drink.setPrice(6.50);
		drinkService.addDrink(drink);

		Client client = new Client();
		client.setFullName("Blake Fitzgerald");
		client.setBirthday(LocalDate.of(1990, 5, 20));
		client.setPhoneNumber("+1234567890");
		client.setEmail("blakey@example.com");
		client.setDiscount(10);
		clientService.addClient(client);

		Staff staff = new Staff();
		staff.setFullName("Thomas Bologa");
		staff.setPhoneNumber("+0987654321");
		staff.setEmail("bologa@coffeehouse.com");
		staff.setPosition("Barista");
		staffService.addStaff(staff);

		System.out.println("Demo data successfully inserted!");
	}
}