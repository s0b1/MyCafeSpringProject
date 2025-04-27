package brainacad_org.CafeSpringProject.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDate;

@Entity
@Data
public class Client
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String fullName;
    private LocalDate birthday;
    private String phoneNumber;
    private String email;
    private int discount;


    public Long getId()
    {
        return id;
    }

    public void setId(Long id)
    {
        this.id = id;
    }

    public String getFullName()
    {
        return fullName;
    }

    public void setFullName(String fullName)
    {
        this.fullName = fullName;
    }

    public LocalDate getBirthday()
    {
        return birthday;
    }

    public void setBirthday(LocalDate birthday)
    {
        this.birthday = birthday;
    }

    public String getPhoneNumber()
    {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber)
    {
        this.phoneNumber = phoneNumber;
    }

    public String getEmail()
    {
        return email;
    }

    public void setEmail(String email)
    {
        this.email = email;
    }

    public int getDiscount()
    {
        return discount;
    }

    public void setDiscount(int discount)
    {
        this.discount = discount;
    }
}