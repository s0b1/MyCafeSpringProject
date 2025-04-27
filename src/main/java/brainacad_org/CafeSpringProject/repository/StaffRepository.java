package brainacad_org.CafeSpringProject.repository;

import brainacad_org.CafeSpringProject.entity.Staff;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StaffRepository extends JpaRepository<Staff, Long>
{
}