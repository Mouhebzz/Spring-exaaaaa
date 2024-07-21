package com.example.examen.Controller;

import com.example.examen.Entity.Company;
import com.example.examen.Entity.Donation;
import com.example.examen.Entity.Employee;
import com.example.examen.Enum.DonationType;
import com.example.examen.Service.IServiceCompany;
import com.example.examen.Service.IServiceDonation;
import com.example.examen.Service.IServiceEmployee;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Set;

@RestController
@AllArgsConstructor
@RequestMapping("/examen")
public class ExamenControlleur {
    IServiceCompany c;
    IServiceEmployee e;
    IServiceDonation d;
   @PostMapping("/addcompany")
    public Company addCompany(@RequestBody Company company)
   {
       return  c.addCompany(company);

   }
   @PostMapping("/addEmployee/{companyName}")
    public Employee addEmployee(@RequestBody Employee employee,@PathVariable String companyName)
   {
       return e.addEmployeeAndAssignToCompany(employee,companyName);
   }
    @PostMapping("/addDonation")
    public Donation addDonation(@RequestBody Donation donation)
    {
        return  d.addDonation(donation);

    }
    @GetMapping("/listeDonation/{type}")
    public Set<Donation> getDonnation(@PathVariable DonationType type)
    {
        return  d.getDonationBytype(type);
    }
    @GetMapping("/listeEmployye/{companyName}/{area}")
    public List<Employee> getEmployye(@PathVariable String companyName, @PathVariable String area)
    {
     return    e.getEmployyeByArea(companyName,area);
    }
}
