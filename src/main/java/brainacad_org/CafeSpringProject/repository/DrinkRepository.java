package brainacad_org.CafeSpringProject.repository;

import brainacad_org.CafeSpringProject.entity.Drink;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DrinkRepository extends JpaRepository<Drink, Long>
{
}