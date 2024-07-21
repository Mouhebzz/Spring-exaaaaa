package com.example.examen.Service;

import com.example.examen.Entity.Donation;
import com.example.examen.Enum.DonationType;
import com.example.examen.Repository.DonationRepository;
import com.example.examen.Repository.EmployeeRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Set;

@Service
@AllArgsConstructor
public class ServiceDonation implements  IServiceDonation{
    DonationRepository d;
    EmployeeRepository e;

    @Override
    public Donation addDonation(Donation donation) {
        if (donation.getDonationType() == DonationType.BLOOD || donation.getDonationType()==DonationType.IN_KIND)
        {
            e.save(donation.getEmployee());

            donation.setAmount(0);
            d.save(donation);
            return  donation;

        }
        else
        {
            e.save(donation.getEmployee());
            d.save(donation);
            return  donation;
        }
    }

    @Override
    public Set<Donation> getDonationBytype(DonationType type) {
        return d.findDonationsByDonationTypeOrderByDate(type);
    }
}
