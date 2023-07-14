package net.fiscma.wazenhof.warzenhofbackend.model;

import jakarta.persistence.*;

@Entity
@Table(name = "DISH")
public class Dish {
    @Id
    private Long id;

    @Basic
    @Column(name = "NAME")
    private String name;
}
