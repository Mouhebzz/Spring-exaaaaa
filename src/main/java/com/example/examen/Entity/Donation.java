package com.example.examen.Entity;

import com.example.examen.Enum.DonationType;
import jakarta.persistence.*;
import lombok.*;

import java.util.Date;
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
public class Donation {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long donID;
    float amount ;
    Date date;

    @Enumerated(EnumType.STRING)
    DonationType donationType;

    @ManyToOne
    Employee employee;


}
