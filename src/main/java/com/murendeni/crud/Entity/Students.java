package com.murendeni.crud.Entity;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity

@Table (name = "Students")

public class Students {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column (name="firstName", nullable = false)
    private  String firstName;

    @Column (name="lastName", nullable = false)
    private String lastName;

    @Column (name="email", nullable = false, unique = true)
    private  String email;

}
