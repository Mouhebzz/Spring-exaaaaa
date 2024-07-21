package com.example.examen.Repository;

import com.example.examen.Entity.Company;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CompanyRepository extends JpaRepository<Company,Long> {
  public  Company findCompanyByCompanyName(String name);
}
