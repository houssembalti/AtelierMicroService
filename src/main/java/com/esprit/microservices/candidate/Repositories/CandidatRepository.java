package com.esprit.microservices.candidate.Repositories;

import com.esprit.microservices.candidate.Entities.Candidat;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface CandidatRepository extends JpaRepository<Candidat, Integer> {
    @Query("select c from Candidat c where c.nom like :name")
    public Page<Candidat> CandidatByNom(@Param("name") String n, Pageable pageable);

}
