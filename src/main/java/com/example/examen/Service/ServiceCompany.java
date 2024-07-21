package com.example.examen.Service;

import com.example.examen.Entity.Company;
import com.example.examen.Repository.CompanyRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class ServiceCompany implements IServiceCompany {
    CompanyRepository c;

    @Override
    public Company addCompany(Company company) {
        if(company.getCompanyName()!=null)
        {
            c.save(company);
        }
        return  company;
    }
}
