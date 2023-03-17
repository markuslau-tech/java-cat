package com.cat.system.model.cat;

import jakarta.persistence.*;

import java.util.Date;

@Entity(name = "Cat")
@Table(name = "cats")
public class Cat {

    @Id
    @SequenceGenerator(
            name = "cat_seq",
            sequenceName = "cat_seq",
            allocationSize = 1
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "cat_seq"
    )
    @Column(
            name = "id",
            updatable = false
    )
    private Long id;

    @Column(nullable = false)
    private String name;

    @Column(nullable = false)
    private Gender gender;

    @Column(nullable = false)
    private String color;

    private Date dob;

}
