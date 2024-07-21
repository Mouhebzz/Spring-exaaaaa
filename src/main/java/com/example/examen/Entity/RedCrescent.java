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
public class RedCrescent {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long redCID;
    String area;
    @OneToMany
    List<Donation> donations;
}
