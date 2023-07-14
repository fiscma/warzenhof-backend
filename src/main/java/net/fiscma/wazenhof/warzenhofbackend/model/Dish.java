package net.fiscma.wazenhof.warzenhofbackend.model;

import jakarta.persistence.*;
import lombok.Data;
import org.springframework.data.domain.Pageable;

import java.io.Serializable;

@Entity
@Table(name = "DISH")
@Data
public class Dish implements Serializable{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Basic
    @Column(name = "NAME")
    private String name;
}
