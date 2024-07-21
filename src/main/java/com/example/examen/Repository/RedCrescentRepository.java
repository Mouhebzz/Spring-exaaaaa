package com.example.examen.Repository;

import com.example.examen.Entity.RedCrescent;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RedCrescentRepository  extends JpaRepository<RedCrescent,Long> {
    public RedCrescent findByArea(String area);
}
