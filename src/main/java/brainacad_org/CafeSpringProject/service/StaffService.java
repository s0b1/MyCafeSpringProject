package brainacad_org.CafeSpringProject.service;

import brainacad_org.CafeSpringProject.entity.Staff;
import brainacad_org.CafeSpringProject.repository.StaffRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StaffService
{

    private final StaffRepository staffRepository;

    public StaffService(StaffRepository staffRepository)
    {
        this.staffRepository = staffRepository;
    }

    public Staff addStaff(Staff staff)
    {
        return staffRepository.save(staff);
    }

    public List<Staff> getAllStaff()
    {
        return staffRepository.findAll();
    }

    public void deleteStaff(Long id)
    {
        staffRepository.deleteById(id);
    }
}