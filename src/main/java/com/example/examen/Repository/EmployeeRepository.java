package com.example.examen.Repository;

import com.example.examen.Entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee,Long> {
    @Query("SELECT e FROM Employee e ORDER BY SIZE(e.donations) DESC")
    public Employee employyeByDonation();
}
