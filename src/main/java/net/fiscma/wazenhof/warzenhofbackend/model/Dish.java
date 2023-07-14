package net.fiscma.wazenhof.warzenhofbackend.model;

import jakarta.persistence.*;
import org.springframework.data.domain.Pageable;

import java.io.Serializable;

@Entity
@Table(name = "DISH")
public class Dish implements Serializable{
    @Id
    private Long id;

    @Basic
    @Column(name = "NAME")
    private String name;
}
