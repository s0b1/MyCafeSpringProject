package brainacad_org.CafeSpringProject.repository;

import brainacad_org.CafeSpringProject.entity.Client;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClientRepository extends JpaRepository<Client, Long>
{
}