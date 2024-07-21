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
public class Company {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long companyID;
    String companyName;
    String adress;
    @OneToMany(mappedBy = "company")
    List<Employee> employees;
}
