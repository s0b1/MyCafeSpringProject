package brainacad_org.CafeSpringProject.entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
public class Drink
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nameEn;
    private String nameOtherLang;
    private Double price;
}