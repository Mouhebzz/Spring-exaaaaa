package com.example.examen.Service;

import com.example.examen.Entity.Donation;
import com.example.examen.Enum.DonationType;

import java.util.List;
import java.util.Set;

public interface IServiceDonation {
    public Donation addDonation(Donation donation);
    public Set<Donation> getDonationBytype(DonationType type);
}
