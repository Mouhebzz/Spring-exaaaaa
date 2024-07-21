package com.example.examen.Repository;

import com.example.examen.Entity.Donation;
import com.example.examen.Enum.DonationType;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Set;

@Repository
public interface DonationRepository extends JpaRepository<Donation,Long> {
    public Set<Donation> findDonationsByDonationTypeOrderByDate(DonationType type);
}
