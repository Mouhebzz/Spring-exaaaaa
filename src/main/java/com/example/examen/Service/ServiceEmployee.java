package com.example.examen.Service;

import com.example.examen.Entity.Company;
import com.example.examen.Entity.Donation;
import com.example.examen.Entity.Employee;
import com.example.examen.Entity.RedCrescent;
import com.example.examen.Repository.CompanyRepository;
import com.example.examen.Repository.EmployeeRepository;
import com.example.examen.Repository.RedCrescentRepository;
import lombok.AllArgsConstructor;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class ServiceEmployee implements IServiceEmployee {
    CompanyRepository c;
    EmployeeRepository e;
    RedCrescentRepository r;
    @Override
    public Employee addEmployeeAndAssignToCompany(Employee employee, String companyName) {
        Company c1=c.findCompanyByCompanyName(companyName);
        if(c1!=null)
        {
            employee.setCompany(c1);
            c1.getEmployees().add(employee);
            c.save(c1);
            e.save(employee);
        }
        return  employee;
    }

    @Override
    public List<Employee> getEmployyeByArea(String companyName, String area) {
        RedCrescent r1=r.findByArea(area);
        List<Employee> liste =r1.getDonations().stream().map(Donation::getEmployee).filter(employee -> employee.getCompany().getCompanyName().equals(companyName)).toList();

        return liste;
    }

    @Scheduled(cron = "0 0 0 1 * ?")
    public void getEmployeeByDonation()
    {
     e.employyeByDonation();
    }
}
