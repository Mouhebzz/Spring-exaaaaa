package com.example.examen.Entity;

import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long employeeID;
    String lastName;
    String firstName;
    String position;
    @ManyToOne
    Company company;
    @OneToMany(mappedBy = "employee")
    List<Donation> donations;
}
